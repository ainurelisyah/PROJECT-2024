package lesson8.GenericStack;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = stack.size() - 1;
        T poppedItem = stack.get(lastIndex);
        stack.remove(lastIndex);
        return poppedItem;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test GenericStack with Integer
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(5);
        intStack.push(10);
        System.out.println("Popped item from Integer stack: " + intStack.pop());
        System.out.println("Is Integer stack empty? " + intStack.isEmpty());

        // Test GenericStack with String
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hi");
        stringStack.push("There!");
        System.out.println("Popped item from String stack: " + stringStack.pop());
        System.out.println("Is String stack empty? " + stringStack.isEmpty());

        // Test GenericStack with Double
        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(3.14);
        doubleStack.push(2.0);
        System.out.println("Popped item from Double stack: " + doubleStack.pop());
        System.out.println("Is Double stack empty? " + doubleStack.isEmpty());
    }
}

