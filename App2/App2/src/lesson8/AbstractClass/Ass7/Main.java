package lesson8.AbstractClass.Ass7;

public class Main {
    public static void main(String[] args) {
        //Create object
        Circle circle = new Circle (3);
        Rectangle rectangle = new Rectangle (5,8);
        Triangle triangle = new Triangle(4, 6);

        //Call method to sort an array of SortableShape objects
        SortableShape[] shapes = {circle, rectangle, triangle};

        //Display areas before sorting
        System.out.println("Areas before sorting: ");
        for (int i = 0; i <shapes.length; i++){
            System.out.println(shapes[i].getName() + ": " + shapes[i].area());
        }
        
        // or use for each loop
        // for (SortableShape shape : shapes) {
        //     System.out.println(shapes[i].getName() + ": " + shape.area());
        // }

        //Sort the shapes basaed on areas 
        ShapeSorter.sort(shapes);

        //Display areas after sorting 
        System.out.println("\nAreas after sorting: ");
        for (int i=0; i <shapes.length; i++){
            System.out.println(shapes[i].getName() + ": " + shapes[i].area());
        }

        // or use for each loop
        // for (SortableShape shape : shapes){
        //     System.out.println(shapes[i].getName() + ": " + shape.area());
        // }

    }
}
