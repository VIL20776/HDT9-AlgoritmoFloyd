import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    Scanner scan = new Scanner(System.in);

    public String seleccion () {
        System.out.println(
            "Elija alguna de las opciones"+
            "\n1. Encontrar ciudad"+
            "\n2. Encontrar la ciudad central"+
            "\n3. Modificar las conexiones"+
            "\n4. Salir"
        );

        return scan.nextLine();
    }

    public String[] encontrarCiudad () {
        String[] ruta = new String [2];
        System.out.println("Ingrese el nombre la ciudad de partida.");
        ruta[0] = scan.nextLine();
        System.out.println("Ingrese la ciudad de destino.");
        ruta[1] = scan.nextLine();

        return ruta;
    }

    public void printRoute(ArrayList<Edge<String,Integer>> route, int value) {
        System.out.println(
            "La distancia hacia el destino es de: " + Integer.toString(value) +
            "\nDesplegando la ruta a seguir:"
            );
        for (Edge<String,Integer> edge : route) {
            System.out.println(edge.here() + "--->" + edge.there());
        }
    }

    public void printCenter(String center) {
        System.out.println("La ciudad central es" + center);
    }

    public String modifyGraph () {
        System.out.println(
            "¿Como desea modificar las conexiones?"+
            "\n1. Eliminar una conexion"+
            "\n2. Agregar una conexion"
            );
        String modificacion = scan.nextLine();
        return modificacion;
    }

    public String[] removeConection() {
        String[] vertices = new String[2];
        System.out.println("Ingrese las conexiones a cortar");
        System.out.println("Primera ciudad:");
        vertices[0] = scan.nextLine();
        System.out.println("Segunda ciudad:");
        vertices[1] = scan.nextLine();

        return vertices;
    }

    public String[] addConection() {
        String[] vertices = new String[3];
        System.out.println("Ingrese las conexiones a crear");
        System.out.println("Primera ciudad:");
        vertices[0] = scan.nextLine();
        System.out.println("Segunda ciudad:");
        vertices[1] = scan.nextLine();
        System.out.println("Distancia entre ellas (en KM)");
        vertices[2] = scan.nextLine();  

        return vertices;
    }
}
