import java.util.ArrayList;

public class Matrix<E> {
    protected ArrayList<ArrayList<E>> matrix = new ArrayList<>();
    protected int size = 0;
    
    public void incrementSize () {
        this.size++;
        for (ArrayList<E> row : matrix) {
            row.add(null);
        }
        matrix.add(new ArrayList<>(size));
    }
    
    public E get(int index1, int index2) {
        return matrix.get(index1).get(index2);
    }
}
