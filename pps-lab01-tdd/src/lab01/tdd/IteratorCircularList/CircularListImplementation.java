package lab01.tdd.IteratorCircularList;

import java.util.*;

public class CircularListImplementation implements CircularList {

    private List<Integer> list;

    //uso un listIterator perché diversamente da Iterator implementa i metodi next() e previous().
    private ListIterator  lit = null;

    public CircularListImplementation() {
        this.list = new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public void add(int element) {
        list.add(element);
    }

    @Override
    public int size() {
        return list.size(); // set size.
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Optional<Integer> forwardIterator() {

        if (list != null && !list.isEmpty())
        {
            lit = list.listIterator();

            System.out.println("Iterating the elements in forward direction: ");
            while (lit.hasNext()) {
                System.out.println(lit.next());
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Integer> backwardIterator() {
        if (list != null && !list.isEmpty())
        {
            lit = list.listIterator();

            System.out.println("Iterating the elements in forward direction: ");
            while (lit.hasPrevious()) {
                System.out.println(lit.previous());
            }
        }
        return Optional.empty();
    }

    @Override
    public void reset() {
        //assegnando nuovamente l'iteratore ritorno all'inizio della lista.
        lit = list.listIterator();
    }
}


