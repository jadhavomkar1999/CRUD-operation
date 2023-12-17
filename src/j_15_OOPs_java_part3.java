

class Employee3{
    private int id;
    private String name;

    // Constructor can be Overloaded similarly Methode Overloading as follow by using parameter.

    Employee3(){                                             // Default Constructor
        System.out.println("Default Contructor called.");
    }

    Employee3(int id,String name){                          // Parameterized Constructor
        this.id = id;
        this.name = name;
    }


    public void getDetails(){
        System.out.println("Id: "+ id + " ," + "Name: "+ name);
    }
}


public class j_15_OOPs_java_part3 {

    public static void main(String[] args){

        Employee3 harry = new Employee3();

        Employee3 ram = new Employee3(13,"Ram Singh");

        harry.getDetails();
        ram.getDetails();

    }
}
