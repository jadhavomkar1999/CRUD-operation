abstract class Base1{
    Base1(){
        System.out.println("This is Base1 class constructor.");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child3 extends Base1{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

}


public class j_18_OOPs_java_part6 {
    public static void main(String[] args){

        // Base1 bs = new Base1();  --> through the error because abstract class does not have class object
        Child3 ch = new Child3();
        ch.greet();
    }
}
