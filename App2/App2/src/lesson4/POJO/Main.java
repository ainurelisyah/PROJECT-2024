package lesson4.POJO;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "john@example.com");
        //Setting values will be done here 
    
        // Using getter methods
        //String name = person.getName();
        //int age = person.getAge();
        //String email = person.getEmail();

        
        // Using setter methods
        person.setName("Jane Doe");
        person.setAge(30);
        person.setEmail("jane@example.com");
    }
    
}
