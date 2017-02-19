package Java.edu.blackburn.cs.cs313sp17.levan.test.queue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Java.edu.blackburn.cs.cs313sp17.levan.src.queue.Queue;
import Java.edu.blackburn.cs.cs313sp17.levan.src.queue.ListQueue;

/**
 *
 * @author kpcoogan
 */
public class ListQueueTest {
    Queue<Integer> intQ;
    Queue<String>  strQ;

    public ListQueueTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIntQ() {
        intQ = new ListQueue<>();
        assert(intQ.length() == 0);
        intQ.enqueue(10);
        intQ.enqueue(15);
        intQ.enqueue(20);
        assert(intQ.length() == 3);
        assertEquals(intQ.toString(), "< 10 15 20 >");
        assertEquals((int) intQ.dequeue(), 10);
        assertEquals((int) intQ.dequeue(), 15);
        assertEquals((int) intQ.dequeue(), 20);

    }

    @Test
    public void testStrQ() {
        strQ = new ListQueue<>();
        assert(strQ.length() == 0);
        strQ.enqueue("Apple");
        strQ.enqueue("Banana");
        strQ.enqueue("Cantaloupe");
        assert(strQ.length() == 3);
        assertEquals(strQ.toString(), "< Apple Banana Cantaloupe >");
        assertEquals(strQ.dequeue(), "Apple");
        assertEquals(strQ.dequeue(), "Banana");
        assertEquals(strQ.dequeue(), "Cantaloupe");
    }
}