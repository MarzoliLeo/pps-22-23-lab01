package lab01.tdd.FilteredNext;

import lab01.tdd.IteratorCircularList.CircularList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CircularListImplementationWithFilter implements CircularListWithFilter {

    private List<Integer> list;

    //uso un listIterator perché diversamente da Iterator implementa i metodi next() e previous().
    private ListIterator  lit = null;

    public CircularListImplementationWithFilter() {
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

    @Override
    public Optional<Integer> filterNext()
    {
        //utilizzo del lamba calcolo per effettuare il filtraggio degli elementi della lista.
        List<Integer> elementsWithProperty = list
                .stream()
                //c diventa l'elemento filtrante all'interno della lista.
                .filter(c -> c > 3 /*definizione della mia proprietà, riporta solo i numeri > 3 */)
                .collect(Collectors.toList());

        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list);
        }

        for (int i = 0 ; i < elementsWithProperty.size() ; i++)
        {
            System.out.println(elementsWithProperty);
        }
        return Optional.empty();
    }
}


