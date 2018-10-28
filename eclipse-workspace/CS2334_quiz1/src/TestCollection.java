import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection
{

    public TestCollection()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // Steps to trim values correctly
        String line = " TAIR SRAD BATV  ";
        String[] lineElements = line.split("\\s+");

        line.trim();
        String[] x = line.trim().split("\\s+");

        ArrayList<String> arrayCollection = new ArrayList<>();
        arrayCollection.add("CS");
        arrayCollection.add("2334");
        arrayCollection.add("can");
        arrayCollection.add("be");
        arrayCollection.add("hard");

        System.out.println("arrayCollection");
        System.out.println(arrayCollection);

        String[] strings = { "CS", "2334", "can", "be", "fun" };
        // Holds string values on "strings" Array
        ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(strings)); 
        arrayCollection.addAll(s1);
        System.out.println(arrayCollection);

        // talk about what clone() does
        // clone makes an exact copy of an objecy
        ArrayList<String> s2 = (ArrayList<String>) arrayCollection.clone();

        LinkedList<String> listA = new LinkedList<>(arrayCollection);

        // Iterators
        Iterator<String> iterator = listA.iterator();

        System.out.println(listA.iterator().getClass());

        while (iterator.hasNext())
            System.out.println(iterator.next().toUpperCase());

        for (String str : listA)
            System.out.println(str.toLowerCase());

        listA.indexOf("hard");
        listA.addAll(listA.indexOf("hard"), s2);

        List<Integer> integers = Arrays.asList(1, 3, 2);
        Collections.sort(integers);

        Collections.sort(integers, Collections.reverseOrder());

        Collections.max(integers);
        Collections.reverse(integers);

        List<GregorianCalendar> dates = Collections.nCopies(5, new GregorianCalendar(2010, 1, 1));
        System.out.println(dates.getClass());
        LinkedList<GregorianCalendar> datesLinkList = new LinkedList<>(dates);
        datesLinkList.add(new GregorianCalendar(2010, 1, 1));

        List<GregorianCalendar> d1 = datesLinkList;
        d1.add(new GregorianCalendar(2010, 1, 1));

        if (false)
        {
            dates.add(new GregorianCalendar(2010, 3, 4));
            LinkedList<GregorianCalendar> datesXX = new LinkedList<>(dates);
        }

        Queue<String> queue = new LinkedList<>();

        for (String str : arrayCollection)
        {
            queue.offer(str);
        }
        queue.remove();

        // strings are being remove din reverse order
        arrayCollection = new ArrayList<>(Arrays.asList("one", "two", "seven", "boo"));
        PriorityQueue<String> pq = new PriorityQueue<>(arrayCollection.size(), Collections.reverseOrder());
        ListIterator<String> position = arrayCollection.listIterator();
        while (position.hasNext())
        {
            pq.offer((String) position.next());
        }

        pq.remove();
        pq.offer("seven");
        pq.offer("seven");

        pq.remove();
        // new string to satisfy reversed order
        PriorityQueue<String> pqNaturalOrder = new PriorityQueue<>(arrayCollection);
        pqNaturalOrder.remove();
        pqNaturalOrder.remove();

        Set<String> set = new TreeSet<>(pq);
        set.add("hello");

    }

}
