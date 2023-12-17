
// Inheritance in Java as follow...
class Father{                                            // Parant Class
    int x;

    Father(){                                            // Default Parant Constructor.
        System.out.println("This is Base Class Constructor.");
    }

    Father(int x){                                      // Parameterized Parant Constructor.
        this.x = x;
        System.out.println("This is Base Class Constructor with value of x is: "+ x);
    }

}

class Child extends Father{                          // Child Class
    int y;

    Child(){                                         // Default Child Constructor.
        System.out.println("This is Child Class Constructor.");
    }

    Child(int x,int y){                                    // Parameterized Child Constructor.
        super(x);
        this.y = y;
        System.out.println("This is Child Class Constructor with value of y is: "+ y);
    }


}

public class j_16_OOPs_java_part4 {

    public static void main(String[] args){

        //Child ch = new Child();
        Child ch1 = new Child(10,12);

    }
}
