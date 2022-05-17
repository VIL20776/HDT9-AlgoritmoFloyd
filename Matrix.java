import java.util.ArrayList;

public class Matrix<E> {
    protected ArrayList<ArrayList<E>> matrix = new ArrayList<>();
    protected int size = 0;

    public Matrix (int size) {
        this.size = size;
        matrix = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            matrix.set(i, new ArrayList<>(size));
        }
    }
    
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

    public void set(int index1, int index2, E item) {
        matrix.get(index1).set(index2, item);
    }

    public int size() {
        return size;
    }
}
