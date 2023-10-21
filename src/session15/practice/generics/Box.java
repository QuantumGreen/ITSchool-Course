package session15.practice.generics;

import session15.practice.Employee;

public class Box<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    private static <E> void printArray(E[] array){
        for(E element: array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Box<String> myString = new Box<>();
        myString.setObject("helloJohn");

        System.out.println(myString.getObject() + ", from box class");

        Integer[] integers = {1,5,7};
        String[] names = {"John","Alice","Bob"};

        printArray(integers);
        printArray(names);
    }

}
