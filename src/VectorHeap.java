import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    private ArrayList<E> heap;

    public VectorHeap() {
        this.heap = new ArrayList<>();
    }

    /**
     * Intercambia dos elementos en el heap.
     * @param i Índice del primer elemento.
     * @param j Índice del segundo elemento.
     */
    private void swap(int i, int j) {
        E aux = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, aux);
    }

    /**
     * Mueve un elemento hacia arriba en el heap hasta que se cumple la propiedad del heap.
     * @param index El índice del elemento a comprobar si se mueve hacia arriba.
     */
    private void moverArriba(int index) {
        while (index > 0) {
            int padre = (index - 1) / 2;

            if (heap.get(index).compareTo(heap.get(padre)) < 0) {
                swap(index, padre);
                index = padre;
            } else {
                break;
            }
        }
    }

    /**
     * Inserta un elemento en el heap.
     * @param elemento elemento a insertar.
     */
    @Override
    public void insert(E elemento) {
        heap.add(elemento);
        moverArriba(heap.size() - 1);
    }

    /**
     * Mueve un elemento hacia abajo en el heap hasta donde se cumple la propiedad del heap para mantener el orden correcto.
     * @param index El índice del elemento a comprobar si se mueve hacia abajo.
     */
    private void moverAbajo(int index) {
        int size = heap.size();
        boolean terminado = false;
        while (!terminado) {
            int izquierda = 2 * index + 1;
            int derecha = 2 * index + 2;
            int min = index;

            if (izquierda < size && heap.get(izquierda).compareTo(heap.get(min)) < 0) {
                min = izquierda;
            }
            if (derecha < size && heap.get(derecha).compareTo(heap.get(min)) < 0) {
                min = derecha;
            }
            if (min != index) {
                swap(index, min);
                index = min;
            } else {
                terminado = true;
            }
        }
    }

    /**
     * Elimina y devuelve el elemento hasta arriba del heap, y vuelve a comprobar la propiedad del heap con el último elemento.
     * @return El elemento mínimo del heap, o null si el heap está vacío.
     */
    @Override
    public E remove() {
        if (heap.isEmpty()) {
            return null;
        }

        E min = heap.get(0);
        E last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            moverAbajo(0);
        }
        return min;
    }

    /**
     * Devuelve el elemento mínimo del heap sin eliminarlo.
     * @return El elemento mínimo del heap, o null si el heap está vacío.
     */
    @Override
    public E peek() {
        if (heap.isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    /**
     * Comprueba si el heap está vacío.
     * @return true si el heap está vacío, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}