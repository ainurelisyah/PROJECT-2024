package lesson2.operators.exec1;

public class exec1 {

    int k;
    boolean p; // Added boolean variable p
    int a = 5;
    int b = 7;
    int j = 10;

    public static void main(String[] args) {
        exec1 exec1Var = new exec1(); // Corrected the class name
        exec1Var.exec1Calculate();
    }

    public void exec1Calculate() {
        this.k = this.a + this.b - 10;
        this.p = (a >= b);
        System.out.println("go");
        double squareRoot = Math.sqrt(2); // Corrected the syntax for Math.sqrt
        System.out.println(squareRoot);
    }
}
