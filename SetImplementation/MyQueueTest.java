package SetImplementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    @Test
    void add(){
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());

        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());

    }

    @Test
    void clear() {
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());
        set.clear();
        mySet.clear();
        assertEquals(set.size(), mySet.size());

        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());
        set1.clear();
        mySet1.clear();
        assertEquals(set1.size(), mySet1.size());
    }

    @Test
    void contains() {
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        for (int i = 0; i<13; i++){
            assertEquals(set.contains(i), mySet.contains(i));
        }

        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        for (int i = 0; i<13; i++){
            assertEquals(set1.contains((char)('a'+i)),mySet1.contains((char)('a'+i)));
        }
        assertEquals(set1.size(), mySet1.size());
    }

    @Test
    void isEmpty() {
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        assertEquals(set.isEmpty(), mySet.isEmpty());
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.isEmpty(), mySet.isEmpty());
        set.clear();
        mySet.clear();
        assertEquals(set.isEmpty(),mySet.isEmpty());

        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.isEmpty(), mySet1.isEmpty());
        set1.clear();
        mySet1.clear();
        assertEquals(set1.isEmpty(), mySet1.isEmpty());
    }

    @Test
    void remove() {
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        assertEquals(set.size(), mySet.size());
        for (int i = 0; i<13; i++){
            set.remove(i);
            mySet.remove(i);
            assertEquals(set.size(), mySet.size());
        }


        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        assertEquals(set1.size(), mySet1.size());
        for (int i = 0; i<13; i++){
            set1.remove((char)('a'+i));
            mySet1.remove((char)('a'+i));
            assertEquals(set1.size(), mySet1.size());
        }

    }

    @Test
    void toArray() {
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        Object[] arr = set.toArray();
        Object[] myArr = mySet.toArray();
        Arrays.sort(arr);
        Arrays.sort(myArr);
        for(int i=0; i<arr.length; i++)
            assertEquals(arr[i],myArr[i]);

        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        Object[] arr1 = set1.toArray();
        Object[] myArr1 = mySet1.toArray();
        Arrays.sort(arr1);
        Arrays.sort(myArr1);
        for(int i=0; i<arr1.length; i++)
            assertEquals(arr1[i],myArr1[i]);
    }

    @Test
    void peek(){
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        Object arr = set.peek();
        Object myArr = mySet.peek();
        assertEquals(arr,myArr);

        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }
        Object arr1 = set1.peek();
        Object myArr1 = mySet1.peek();
            assertEquals(arr1,myArr1);
    }

    @Test
    void element(){
        Queue<Integer> set = new LinkedList<>();
        MyQueue<Integer> mySet = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set.add(i);
            mySet.add(i);
        }
        for (int i = 0; i < set.size(); i++) {
            assertEquals(set.element(),mySet.element());
            assertEquals(set.size(),mySet.size());

        }


        // testing on characters
        Queue<Character> set1 = new LinkedList<>();
        MyQueue<Character> mySet1 = new MyQueue<>();
        for (int i = 0; i<13; i++){
            set1.add((char)('a'+i));
            mySet1.add((char)('a'+i));
        }

        for (int i = 0; i < set1.size(); i++) {
            assertEquals(set1.element(),mySet1.element());
            assertEquals(set1.size(),mySet1.size());
        }
    }
}