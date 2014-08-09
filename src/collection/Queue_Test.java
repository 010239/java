package collection;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Iterator;

/**
 * @author DongZhukai
 * @date 14-8-1.
 */
public class Queue_Test {
  public static void main(String[] args) {
    ArrayQueue arrayQueue = new ArrayQueue(10);

    arrayQueue.add(0);
    arrayQueue.add(1);
    arrayQueue.add(2);
    arrayQueue.add(3);
    arrayQueue.add(4);
    arrayQueue.add(5);
    arrayQueue.add(6);
    arrayQueue.add(7);
    arrayQueue.add(8);
    arrayQueue.add(9);

    Iterator it = arrayQueue.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

    for(Object num : arrayQueue){
      System.out.println(num);
    }
  }
}
