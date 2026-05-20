import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class VectorHeapTest {

    private VectorHeap<Integer> heap;

    @Before
    public void setUp() {
        heap = new VectorHeap<>();
    }

    /**
     * Verifica que insert funciona correctamente.
     */
    @Test
    public void testInsert() {

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(1);

        assertEquals(Integer.valueOf(1), heap.peek());
    }

    /**
     * Verifica que remove devuelve el menor elemento.
     */
    @Test
    public void testRemove() {

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(1);

        Integer eliminado = heap.remove();

        assertEquals(Integer.valueOf(1), eliminado);
    }

    /**
     * Verifica el orden correcto del heap.
     */
    @Test
    public void testOrdenCompleto() {

        heap.insert(8);
        heap.insert(3);
        heap.insert(15);
        heap.insert(1);
        heap.insert(7);

        assertEquals(Integer.valueOf(1), heap.remove());
        assertEquals(Integer.valueOf(3), heap.remove());
        assertEquals(Integer.valueOf(7), heap.remove());
        assertEquals(Integer.valueOf(8), heap.remove());
        assertEquals(Integer.valueOf(15), heap.remove());
    }

}