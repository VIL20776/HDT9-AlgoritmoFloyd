/**
 * Vertex
 * 
 * Clase basada en la implementacion del libro de JavaStructures
 */
public class Vertex <E>{

    protected E label;
    protected boolean visited;

    public Vertex (E label) 
    // post: constructs unvisited vertex with label
    {
        this.label = label;
        this.visited = false;
    }

    public E label()
    // post: returns user label associated w/vertex
    {
        return label;
    }
    public boolean visit()
    // post: returns, then marks vertex as being visited
    {
        if (!visited) visited = true;
        return visited;
    }
    public boolean isVisited()
    // post: returns true iff vertex has been visited
    {
        return visited;
    }
    public void reset()
    // post: marks vertex unvisited
    {
        visited = false;
    }
}