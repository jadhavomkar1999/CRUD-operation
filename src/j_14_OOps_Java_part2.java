
class Employee2{
    private int id;                     // Attributes
    private String name;               // Attributes

    public String getName(){              // Getters
        return name;
    }

    public void setName(String s){       // Setters
        this.name = s;
    }

    public int getId(){                  //Getter
        return id;
    }

    public void setId(int n){                 //Setters
        this.id =n;
    }

}

public class j_14_OOps_Java_part2 {
    public static void main(String[] args){

        Employee2 harry = new Employee2();                // Object Instantiation

        harry.setName("Harry Maguire.");                  // set attributes
        harry.setId(12);

        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
