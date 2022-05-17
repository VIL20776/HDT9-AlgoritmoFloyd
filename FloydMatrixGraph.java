import java.util.ArrayList;

public class FloydMatrixGraph {

    protected ArrayList<String> vertices;
    protected ArrayList<Edge<String,Integer>> relacionesInit;
    protected Matrix<ArrayList<Edge<String,Integer>>> relaciones;

    public FloydMatrixGraph (ArrayList<String> vertices, ArrayList<Edge<String,Integer>> relaciones) {
        this.vertices = vertices;
        this.relacionesInit = relaciones;
        this.relaciones = new Matrix<>(vertices.size());
        createMatrix();
        floyd();
    }

    protected void createMatrix () {
        for (Edge<String,Integer> edge : relacionesInit) {
            for (int i = 0; i < vertices.size(); i++) {
                String iVertex = vertices.get(i);
                for (int j = 0; j < vertices.size(); j++) {
                    String jVertex = vertices.get(i);

                    if (i == j) {
                        this.relaciones.get(i, j).add(
                            new Edge<String,Integer>(iVertex, jVertex, 0)
                        );
                        this.relaciones.get(j, i).add(
                            new Edge<String,Integer>(jVertex, iVertex, 0)
                        );
                    }

                    if(edge.hasVertex(iVertex) && edge.hasVertex(jVertex)) {
                        this.relaciones.get(i, j).add(edge);
                        this.relaciones.get(j, i).add(edge);  
                    } else {
                        this.relaciones.get(i, j).add(
                            new Edge<String,Integer>(iVertex, jVertex, Integer.MAX_VALUE)
                        );
                        this.relaciones.get(j, i).add(
                            new Edge<String,Integer>(jVertex, iVertex, Integer.MAX_VALUE)
                        );
                    }
                }
            }
        }
    }

    protected void floyd () {
        for (int v = 0; v < vertices.size(); v++) {
            for (int i = 0; i < vertices.size(); i++) {
                for (int j = 0; j < vertices.size(); j++) {
                    ArrayList<Edge<String,Integer>> first = relaciones.get(i, v);
                    ArrayList<Edge<String,Integer>> last = relaciones.get(v, j);

                    if (edgeListValue(first) == Integer.MAX_VALUE || edgeListValue(last) == Integer.MAX_VALUE) {
                        continue;
                    }
                    
                    if (edgeListValue(relaciones.get(i, j)) > (edgeListValue(first) + edgeListValue(last))) {
                        first.addAll(last);
                        relaciones.set(i, j, first);        
                    }
                }
            }
        }
    }

    private int edgeListValue(ArrayList<Edge<String,Integer>> edges) {
        int value = 0; 
        for (Edge<String,Integer> edge : edges) {
            if (edge.label() == Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            value += edge.label();
        }
        return value;
    }
    
    public ArrayList<Edge<String,Integer>> getEdgeList (int origin, int destiny) {
        return relaciones.get(origin, destiny);
    }

    private void addVertex(String vtx) {
        vertices.add(vtx);
    }

    public void addEdge(String vtx1, String vtx2, int label) {
        if (!vertices.contains(vtx1)) {
            addVertex(vtx1);
        }
        if (!vertices.contains(vtx2)) {
            addVertex(vtx2);
        }

        Edge<String,Integer> newEdge = new Edge<String,Integer>(vtx1, vtx2, label);
        relacionesInit.add(newEdge);
    }

    public void update() {
        createMatrix();
        floyd();
    }
}