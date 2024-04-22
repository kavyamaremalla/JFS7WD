package com.java.training;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        List<Integer> vectorList = new Vector<>();

        Stack<Integer> stackList = new Stack<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.add(3);

        arrayList.remove(1);

       System.out.println(arrayList.contains(2));

        Iterator iterator = arrayList.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        vectorList.add(3);
        vectorList.add(5);
        vectorList.add(3);

//        System.out.println(vectorList);

        linkedList.addAll(arrayList);

//        System.out.println(linkedList);

        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.push(3);

//        System.out.println(stackList.get(0));

        stackList.pop();
//        System.out.println(stackList.peek());

//        System.out.println(stackList);


        Queue<Integer> priorityQueue = new ArrayDeque<>();

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(1);


//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.element());
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.remove());
//
//        System.out.println(priorityQueue.contains(3));
//        System.out.println(priorityQueue);

        Deque deque = new ArrayDeque();
        deque.add(1);
        deque.add(2);
        deque.add(3);

        deque.addFirst(4);
        deque.addLast(6);
        System.out.println(deque);
//        System.out.println(deque.getFirst());
//        System.out.println(deque.getLast());
//        System.out.println(deque.offer(8));


    }

}
