package com.java.training;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//       System.out.println(arrayList.contains(2));

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
//        System.out.println(deque);
//        System.out.println(deque.getFirst());
//        System.out.println(deque.getLast());
//        System.out.println(deque.offer(8));


        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("rama");
        treeSet.add("raja");
        treeSet.add("jill");
        hashSet.add(null);
        linkedHashSet.add(null);
        hashSet.add("abhay");
        linkedHashSet.add(null);

//          System.out.println(linkedHashSet);

//        System.out.println(treeSet);
//        System.out.println(hashSet);

//        treeSet.stream().forEach(element -> System.out.println(element));



//        System.out.println(hashSet.contains("rama"));

//        Child1 john = new Child1();
//        john.school();
//        john.age = 19;
//
//        Parent john1 = new Child1();
//        john1.buyAToy();

//        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> hashMap = new TreeMap<>();

        hashMap.put(1, "John");
//        hashMap.put(null, "Jill");
//        hashMap.put(null, "Jack");
        hashMap.put(2,"Jill");
        hashMap.put(3,"Jill");
        hashMap.put(4, null);
        hashMap.put(5, null);


//        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//            System.out.println("Traditional For Loop " + entry.getValue());
//        }
//
//        hashMap.forEach((k,v) -> {
//            System.out.println("For Each " + v);
//        });

        System.out.println("Tree Map " + hashMap);

        Optional<Integer> optionalKey = hashMap.entrySet()
                                        .stream()
                                        .filter(o -> o.getKey()!=null)
                                        .filter(e -> (e.getKey() > 2))
                                        .map(Map.Entry::getKey).findFirst();
        if (optionalKey.isEmpty()){
            System.out.println("Condition is not satisfied");
        } else if (optionalKey.isPresent()) {
            System.out.println("You have some values " + optionalKey);
        }

        System.out.println(Optional.ofNullable(hashMap).isPresent());
    }

    interface Parent{
        void buyAToy();
    }

    class Child1 implements Parent{

        int age = 18;
        void school(){

        }
        @Override
        public void buyAToy() {

        }
    }


}
