interface Bicycle{
    int a = 45;       // Properties in interface and it is default is final it can not be changed.
    void applyBreak(int decreament);
    void speedUp(int increament);
}

interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}


class AvonCycle implements Bicycle, HornBicycle{
    int speed = 60;
    public void applyBreak(int decreament){
        speed = speed - decreament;
        System.out.println("Apply Break...");
    }
    public void speedUp(int increament){
        speed+= increament;
        System.out.println("Speed up the speed...");
    }

    public void blowHornk3g(){
        System.out.println("Kabhi Kushi Kabhi Gum...");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon na..");
    }
}

public class j_19_OOPs_java_part7 {
    public static void main(String[] args) {
        AvonCycle b = new AvonCycle();
        b.applyBreak(10);
        b.speedUp(15);
        b.blowHornk3g();
        b.blowHornmhn();
        System.out.println(b.a);
        // b.a = 456;  ---> this through error becauses interface propertis are by default final they can not be changed.

    }
}
