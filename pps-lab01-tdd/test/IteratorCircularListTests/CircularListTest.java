package IteratorCircularListTests;

import lab01.tdd.IteratorCircularList.CircularListImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularListImplementation circularListImpl;

    @BeforeEach
    void BeforeEach()
    {
        circularListImpl =  new CircularListImplementation();
    }

    @Test
    public void testAddAndSize(){
        circularListImpl.add(0);
        assertEquals(0, circularListImpl.getList().indexOf(0));
        circularListImpl.add(1);
        assertEquals(1, circularListImpl.getList().indexOf(1));
        circularListImpl.add(2);
        assertEquals(2, circularListImpl.getList().indexOf(2));
        circularListImpl.add(3);
        assertEquals(3, circularListImpl.getList().indexOf(3));
        circularListImpl.add(4);
        assertEquals(4, circularListImpl.getList().indexOf(4));

        //test the size.
        assertEquals(5, circularListImpl.size());
    }


    @Test
    public void testIsEmpty()
    {
        if(circularListImpl.isEmpty())
        {
            assertNull(circularListImpl);
        }

    }

    @Test
    public void testCircolarityOfList(){
        if(circularListImpl.isEmpty())
        {
            assertNull(circularListImpl);
        }
        circularListImpl.forwardIterator();
        circularListImpl.backwardIterator();

    }

    @Test
    public void testReset()
    {
        circularListImpl.reset();
        assertEquals(circularListImpl.isEmpty(), circularListImpl.isEmpty());
    }


}
