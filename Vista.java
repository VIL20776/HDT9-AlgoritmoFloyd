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
}
