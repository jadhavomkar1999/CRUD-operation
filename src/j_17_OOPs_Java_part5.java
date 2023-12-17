
/* Types of Inheritance in the java as follow..

  1)Single Inheritance : In single inheritance, subclasses inherit the features of one superclass.
  2)Multilevel Inheritance : In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
  3)Hierarchical Inheritance : In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass.
  4)Hybrid inheritance : It can be achieved through a combination of Multilevel Inheritance and Hierarchical Inheritance with classes, Hierarchical and Single Inheritance with classes

  Note*: Multiple inheritance is not supported in Java through class.

*/

                      // Multilevel Inheritance

class Base{
    int x;

    Base(int x){
        this.x = x;

        System.out.println("value of X : "+ x);
    }

}

class Child1 extends Base{
    int y;

    Child1(int x, int y){
        super(x);
        this.y = y;

        System.out.println("value of Y : "+ y);
    }

}

class Child2 extends Child1{

    int z;

    Child2(int x,int y,int z){
        super(x,y);
        this.z = z;

        System.out.println("value of Z : "+ z);
    }

}

public class j_17_OOPs_Java_part5 {
    public static void main(String[] args){

        //Base bs = new Base(10);
        //Child1 ch = new Child1(10,12);
        Child2 ch1 = new Child2(10,12,14);
    }
}
