package lesson4.Quiz.Q22;

public class Test {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name2 == name3); // == cannot read in even it is a same values 

        // 2 ways to fix 
        // .equals()
        // or put final to all variables
    }
}

