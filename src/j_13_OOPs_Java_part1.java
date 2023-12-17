
class Employee{

    //Attributes
    int id;
    String name;
    public void printDetails(){
        System.out.print("My name is " + name);
        System.out.println(" and my id is "+ id);
    }
}
public class j_13_OOPs_Java_part1 {
    public static void main(String[] args){
        Employee harry = new Employee();   //Instantiating a new Employee object.
        Employee rohit = new Employee();   //Instantiating a new Employee object.

        // Setting Attributes for harry

        harry.id = 1;
        harry.name = "Harry Maguire";

        // Setting Attributes for rohit
        
        rohit.id = 2;
        rohit.name = "Rohit Sharma";

        // System.out.println(harry.id);
        // System.out.println(harry.name);

        harry.printDetails();
        rohit.printDetails();
    }
}
