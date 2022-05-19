import java.util.ArrayList;

public class FloydDriver {

    FloydMatrixGraph floydMatrixGraph;
    FileReader fileReader;
    Vista vista;

    public FloydDriver () {
        fileReader = new FileReader();
        fileReader.read();

        floydMatrixGraph = new FloydMatrixGraph(fileReader.getVertices(), fileReader.getRelacionesInit());
    }

    public void menu() {
        boolean active = true;
        while (active) {
            String option = vista.seleccion();
            switch (option) {
                case "1":
                    String[] ruta = vista.encontrarCiudad();
                    ArrayList<Edge<String,Integer>> route = floydMatrixGraph.getEdgeList(ruta[0], ruta[1]);
                    int routeValue = floydMatrixGraph.edgeListValue(route);
                    vista.printRoute(route, routeValue);
                    break;
                
                case "2":
                    vista.printCenter(floydMatrixGraph.graphCenter());
                    break;

                case "3":
                    switch (vista.modifyGraph()) {
                        case "1":
                            String[] eliminar= vista.removeConection();
                            floydMatrixGraph.removeEdge(eliminar[0], eliminar[1]);
                            break;

                        case "2":
                            String[] agregar = vista.addConection();
                            floydMatrixGraph.addEdge(agregar[0], agregar[1], Integer.parseInt(agregar[2]));
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case "4":
                    active = false;
            
                default:
                    break;
            }
        }
    }


}
