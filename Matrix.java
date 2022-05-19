import java.util.ArrayList;

public class Matrix<E> {
    protected ArrayList<ArrayList<E>> matrix = new ArrayList<>();
    protected int size = 0;

    public Matrix (int size) {
        matrix = new ArrayList<>(size);
        while (this.size < size) {
            incrementSize();
        }
    }
    
    private void incrementSize () {
        this.size++;
        ArrayList<E> newRow = new ArrayList<>(size);
        for (ArrayList<E> row : matrix) {
            row.add(null);
            newRow.add(null);
        }
        newRow.add(null);
        matrix.add(newRow);
    }
    
    public E get(int index1, int index2) {
        return matrix.get(index1).get(index2);
    }

    public void set(int index1, int index2, E item) {
        matrix.get(index1).set(index2, item);
    }

    public int size() {
        return size;
    }
}
