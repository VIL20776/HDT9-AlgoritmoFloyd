import java.util.Vector;

public class MatrixGraph<V,E> implements Graph<V,E> {

    protected Vector<Vertex<V>> vertices;
    protected Edge<V,E>[][] relaciones;

    @Override
    public void add(V label) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addEdge(V vtx1, V vtx2, E label) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public V remove(V label) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E removeEdge(V vLabel1, V vLabel2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V get(V label) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Edge<V, E> getEdge(V label1, V label2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean contains(V label) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsEdge(V vLabel1, V vLabel2) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean visit(V label) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean visitEdge(Edge<V, E> e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isVisited(V label) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isVisitedEdge(Edge<V, E> e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

}
