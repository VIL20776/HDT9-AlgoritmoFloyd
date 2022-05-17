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
                    
                    break;
            
                default:
                    break;
            }
        }
    }


}
