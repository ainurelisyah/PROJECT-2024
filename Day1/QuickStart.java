


class QuickStart {
    public static void main (String[] args) {
        System.out.println("Hello, World." + args[0] + "" + args[1]);
        second();
        SecondClass secondClass = new SecondClass();
        secondClass.second();
        if(args[1].equals("Mar")){
            SecondClass.third();
        }
        
    }

    public static void second(){
        System.out.println("second");
    }
}

class SecondClass {

    void second(){
        System.out.println("second in a class");
    }

    static void third(){
        System.out.println("third in a class");
    }
}