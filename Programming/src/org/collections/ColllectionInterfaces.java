package org.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.stream.Collectors;

public class ColllectionInterfaces {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList();
        
        c.add(1);
        c.add(2);
        c.add(1);
        c.add(2);
        c.add(1);
        c.add(2);
        c.add(1);
        c.add(2);
      /*  System.out.println(c);
         Collections.shuffle((List<?>) c);
        System.out.println(c);
        Collections.shuffle((List<?>) c,new Random());
        System.out.println(c);
      */  
        Collections.swap((List<?>)c, 0, 1);
        System.out.println(c);

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(4);
        // l.addAll(c);

        // c.addAll(l);

        c.stream()
                // .filter(e -> e.intValue() == new Integer(1))
                .forEach(e -> System.out.println(e.intValue()));
        String joined = c.stream()
                .map(Object::toString)
                .collect(Collectors.joining(","));

        System.out.println(joined);
        Iterator<Integer> it = c.iterator();
        c.removeAll(Collections.singleton(1));
      
        System.out.println(c);
        
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("Pravin");
        queue.add("Rahul");
        queue.offer("Arun");
        while (!(queue.isEmpty())) {
            
            System.out.println(queue.remove());
        }
    }
}
