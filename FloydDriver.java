import java.util.ArrayList;

public class FloydDriver {

    FloydMatrixGraph floydMG;
    FileReader fileReader;
    Vista vista;

    public FloydDriver () {
        fileReader = new FileReader();
        fileReader.read();

        floydMG = new FloydMatrixGraph(fileReader.getVertices(), fileReader.getRelacionesInit());
        vista = new Vista();
    }

    public void menu() {
        boolean active = true;
        while (active) {
            String option = vista.seleccion();
            switch (option) {
                case "1":
                    String[] ruta = vista.encontrarCiudad();
                    ArrayList<Edge<String,Integer>> route = floydMG.getEdgeList(ruta[0], ruta[1]);
                    int routeValue = floydMG.edgeListValue(route);
                    vista.printRoute(route, routeValue);
                    break;
                
                case "2":
                    vista.printCenter(floydMG.graphCenter());
                    break;

                case "3":
                    switch (vista.modifyGraph()) {
                        case "1":
                            String[] eliminar= vista.removeConection();
                            floydMG.removeEdge(eliminar[0], eliminar[1]);
                            break;

                        case "2":
                            String[] agregar = vista.addConection();
                            floydMG.addEdge(agregar[0], agregar[1], Integer.parseInt(agregar[2]));
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case "4":
                    active = false;
                    break;
            
                default:
                    vista.invalidInput();
                    break;
            }
        }
    }


}
