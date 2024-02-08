package lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringManipulator{
    private ArrayList<String>arrayList;

// { "Volvo", "BMW", "Ford"}
// {  0,  1,   2}

//Constructor to initialize the ArrayList
public ArrayListStringManipulator(){
    arrayList = new ArrayList<>();
}

//Method to add an element to the ArrayList 
public void addElement(String element) {
    //controls
    arrayList.add(element);
}

//Method to remove an element by Index from the ArrayList 
public void removeElementByValue(String element) {
    arrayList.remove(String.valueOf(element));
}

//Method to remove an element by Index from the ArrayList 
public void removeElementByIndex(int ind) {
    arrayList.remove(ind);
}

public ArrayList<String>getArrayList(){
    return arrayList;
}

//Method to search for an element in the ArrayList and return its index
//If the element is not found, return -1


public int searchElement(String element){
    return arrayList.indexOf(element);
}


//Method to sort the ArrayList in ascending order 
public void sortList(){
    Collections.sort(arrayList);
}

public static void main(String[] args) {
    ArrayListStringManipulator arrayListStringManipulator = new ArrayListStringManipulator();
    arrayListStringManipulator.addElement("Volvo");
    arrayListStringManipulator.addElement("BMW");
    arrayListStringManipulator.addElement("Ford");
    System.out.println(arrayListStringManipulator.getArrayList().toString());

    /* 
    // {"Volvo", "BMW", "Ford"}
    arrayListStringManipulator.removeElementByValue("Volvo");
    // {"BMW", "Ford"}
    //arrayListStringManipulator.removeElementByIndex("");
    //{"BMW"}
    System.out.println(arrayListStringManipulator.getArrayList().toString());
    */

    
    int ind = arrayListStringManipulator.searchElement("Volvo");
        System.out.println(ind);

        /* arrayListStringManipulator.sortList();
        System.out.println(arrayListStringManipulator.getArrayList().toString());
        //[ Volvo, BMW, Ford ] */

    }
    
}

