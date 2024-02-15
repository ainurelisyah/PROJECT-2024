package lesson8.PairClass;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public static void main(String[] args) {
        // Create a Pair of Integer and String
        Pair<Integer, String> myPair = new Pair<>(42, "Hello");

        // Get and set elements
        System.out.println("First element: " + myPair.getFirst());
        System.out.println("Second element: " + myPair.getSecond());

        myPair.setFirst(99);
        myPair.setSecond("World");

        System.out.println("Updated first element: " + myPair.getFirst());
        System.out.println("Updated second element: " + myPair.getSecond());
    }
}
