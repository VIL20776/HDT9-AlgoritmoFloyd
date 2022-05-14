/**
 * Edge
 * 
 * Clase basada en la implementacion del libro de JavaStructures
 */
public class Edge <V,E> {
    protected V vertex1, vertex2;
    protected E label;
    protected boolean visited;
    protected boolean directed;

    public Edge(V vtx1, V vtx2, E label,
    boolean directed)
    // post: edge associates vtx1 and vtx2; labeled with label
    //directed if "directed" set true
    {
        this.vertex1 = vtx1;
        this.vertex2 = vtx2;
        this.label = label;
        this.directed = directed;
    }
    public V here()
    // post: returns first node in edge
    {
        return vertex1;
    }
    public V there()
    // post: returns second node in edge
    {
        return vertex2;
    }
    public void setLabel(E label)
    // post: sets label of this edge to label
    {
        this.label = label;
    }
    public E label()
    // post: returns label associated with this edge
    {
        return label;
    }
    public boolean visit()
    // post: visits edge, returns whether previously visited
    {
        if (!visited) visited = true;
        return visited;
    }
    public boolean isVisited()
    // post: returns true iff edge has been visited
    {
        return visited;
    }
    public boolean isDirected()
    // post: returns true iff edge is directed
    {
        return directed;
    }
    public void reset()
    // post: resets edge's visited flag to initial state
    {
        visited = false;
    }
    public boolean equals(Object o)
    // post: returns true iff edges connect same vertices
    {
        Edge<?,?> e = (Edge<?,?>) o;
        return 
            (here() == e.here() && there() == e.there()) ? true :
            (!directed && here() == e.there() && there() == e.here()) ? true : false;
    }
}
