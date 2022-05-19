/**
 * Universidad del Valle de Guatemala 
 * Hoja de Trabajo 9 
 * Dariel Villatoro 20776
 * Se crea la clase encargada de leer los archivos de texto
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    /**Se usa para almacenar cada linea */
    protected ArrayList<Edge<String,Integer>> relacionesInit;
    protected ArrayList<String> vertices;

    public FileReader () {
        relacionesInit = new ArrayList<>();
        vertices = new ArrayList<>();
    }

    /**
     * Metodo que almacena las lineas del documento.
     * @return ArrayList con las lineas del documento.
     */
    public void read(){
        try{
            String nombre= "guategrafo.txt";
            File myFile = new File(nombre);
            Scanner s = new Scanner(myFile);
            String linea = "";
            while (s.hasNextLine()){
                linea = s.nextLine();
                String[] split = linea.split(" ");
                Edge<String,Integer> edge = new Edge<String,Integer>(split[0], split[1], Integer.parseInt(split[2]));
                relacionesInit.add(edge);

                if (!vertices.contains(split[0])) {
                    vertices.add(split[0]);
                }
                if (!vertices.contains(split[1])) {
                    vertices.add(split[1]);
                }
            }
            
        }catch(Exception e){
                String m="FileReader: leer archivo():"+ e.getMessage();
                throw new RuntimeException(m);

        }
    }

    public ArrayList<Edge<String, Integer>> getRelacionesInit() {
        return relacionesInit;
    }

    public ArrayList<String> getVertices() {
        return vertices;
    }
}
