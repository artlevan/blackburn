package Java.edu.blackburn.cs.cs313sp17.levan.test.dictionary;

import Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary.Dictionary;
import Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary.DictionaryImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class DictionaryTest {

    public DictionaryTest() {
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

    /*
     * This is a simple test case that is only meant to verify
     * That student implementation makes proper use of Java generics
     * and return types at the top-most level. It is NOT intended
     * as a thorough test of functionality
     */
    @Test
    public void GenericTest() {
        // Build dictionary that is plenty big enough
        // Get Java generics and diamond notation right
        DictionaryImpl<Integer, String> D = new DictionaryImpl<>(11);

        // Insert a few things
        D.insert("Apple".hashCode(), "Apple");
        D.insert("Banana".hashCode(), "Banana");
        D.insert("Carrot".hashCode(), "Carrot");
        D.insert("Date".hashCode(), "Date");

        // Search for a couple of them and make sure they are there
        assertEquals("Apple", D.find("Apple".hashCode()));
        assertEquals("Carrot", D.find("Carrot".hashCode()));

        // Remove something...
        D.remove("Carrot".hashCode());

        // ...and make sure it's no longer in Dictionary
        assertEquals(null, D.find("Carrot".hashCode()));
    }
}
