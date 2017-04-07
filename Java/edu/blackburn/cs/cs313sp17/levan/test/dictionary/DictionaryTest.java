package Java.edu.blackburn.cs.cs313sp17.levan.test.dictionary;

import Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary.Dictionary;
import Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary.DictionaryImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.net.URL;

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
        DictionaryImpl<Integer, String> d = new DictionaryImpl<>(11);

        // Insert a few things
        d.insert("Apple".hashCode(), "Apple");
        d.insert("Banana".hashCode(), "Banana");
        d.insert("Carrot".hashCode(), "Carrot");
        d.insert("Date".hashCode(), "Date");

        // Search for a couple of them and make sure they are there
        assertEquals("Apple", d.find("Apple".hashCode()));
        assertEquals("Carrot", d.find("Carrot".hashCode()));

        // Remove something...
        d.remove("Carrot".hashCode());

        // ...and make sure it's no longer in Dictionary
        assertEquals(null, d.find("Carrot".hashCode()));
    }

    @Test
    public void InputTest() throws FileNotFoundException, IOException {
        URL path = Dictionary.class.getResource("dict-small.txt");
        FileReader fr = new FileReader(path.getFile());
        BufferedReader read = new BufferedReader(fr);
        DictionaryImpl<Integer, String> d = new DictionaryImpl<>(11);
        String hashMe = "";
        String hashTest = "";
        boolean fileFound = false;

        if (read.readLine() != null) {
            fileFound = true;
            hashTest = read.readLine();
        }
        assertEquals(true, fileFound);

        while (read.readLine() != null) {
            hashMe = read.readLine();

            if (hashMe != null) {
                d.insert(hashMe.hashCode(), hashMe);
            }
        }

    }

    @Test
    public void negativeTest() {
        //Generate Dictionary of size 1
        DictionaryImpl<Integer, String> d = new DictionaryImpl<>(1);
        //Insert a String with a negative key
        d.insert(-4, "Negative");
        //Search for the negative key
        assertEquals("Negative", d.find(-4));

    }

    @Test
    public void CollisionTest() {
        //Generate Dictionary of size 1
        DictionaryImpl<Integer, String> d = new DictionaryImpl<>(1);
        //Insert two different strings to the same key
        d.insert("alpha".hashCode(), "alpha");
        d.insert("alpha".hashCode(), "bravo");

        //Search the first entry then remove it
        assertEquals("alpha", d.find("alpha".hashCode()));
        d.remove("alpha".hashCode());
        //Search the second entry then remove it
        assertEquals("bravo", d.find("alpha".hashCode()));
        d.remove("alpha".hashCode());
        //Assert there's nothing left
        assertEquals(null, d.find("alpha".hashCode()));

    }
}
