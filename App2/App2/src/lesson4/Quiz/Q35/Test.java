package lesson4.Quiz.Q35;

public class Test {
    public static void main(String[] args) {
        String[][] fruits = {{"apple", "mango"}, {"orange", "grape"}};

        /*for (int i = 0; i<fruits.length; i++)
            for(int j = 0; j<fruits[i].length; j++)
            System.out.println(fruits[i][j]+""); 
            //Output : apple
                        mango
                        orange
                        grape */

           /*for (int i = 1; i<fruits.length; i++)
            for(int j = 1; j<fruits[i].length; j++)
            System.out.println(fruits[i][j]+"");
            //Output : Grape */

            /*for (int i = 1; i<fruits.length; i++)
            for(int j = 1; j<=fruits[i].length; j++)
            System.out.println(fruits[i][j]+"");
            //Output : Exception time run  */

            for (String[] arr : fruits)
            for(String fruit : arr)
            System.out.println(fruit+"");
           /* Output : apple
                        mango
                        orange
                        grape  */
        }       

}
