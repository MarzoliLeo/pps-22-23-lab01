package FilteredNextTests;

import lab01.tdd.FilteredNext.CircularListImplementationWithFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularListImplementationWithFilterTest {

    CircularListImplementationWithFilter circularListImplementationWithFilter;

    @BeforeEach
    void setUp() {
        circularListImplementationWithFilter = new CircularListImplementationWithFilter();
    }

    @Test
    void filterNext() {
        circularListImplementationWithFilter.add(0);
        assertEquals(0, circularListImplementationWithFilter.getList().indexOf(0));
        circularListImplementationWithFilter.add(1);
        assertEquals(1, circularListImplementationWithFilter.getList().indexOf(1));
        circularListImplementationWithFilter.add(2);
        assertEquals(2, circularListImplementationWithFilter.getList().indexOf(2));
        circularListImplementationWithFilter.add(3);
        assertEquals(3, circularListImplementationWithFilter.getList().indexOf(3));
        circularListImplementationWithFilter.add(4);
        assertEquals(4, circularListImplementationWithFilter.getList().indexOf(4));

        circularListImplementationWithFilter.filterNext();
    }
}