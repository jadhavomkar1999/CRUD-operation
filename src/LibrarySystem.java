import java.util.*;

class Library{
    Vector<String> astr = new Vector<String>();

    void addBooks(String str1){
        String ac = str1.toLowerCase();
        astr.add(ac);
    }

    boolean isContains(String str2){
        String ab = str2.toLowerCase();
        boolean ans = astr.contains(ab);
        return ans;
    }

    void assignBook(String str3){
        if(!isContains(str3)){
            System.out.println("Sorry, this book is not available.");
        }
        else if(astr.isEmpty()){
            System.out.println("There is no books is available in the library.");
        }
        else{
            astr.remove(str3);
            System.out.println("Book "+str3+" is successfully assign.");
        }
    }

    void availableBooks(){
        for(String str:astr){
            System.out.println(str);
        }
    }

}

public class LibrarySystem {
    public static void main(String[] args) {
        Library pappu = new Library();
        pappu.addBooks("Wings of fire");
        pappu.addBooks("Mindpower");
        pappu.addBooks("Shyamchi Aai");
        pappu.addBooks("Mrutyunjay");
        pappu.addBooks("Yayati");
        pappu.addBooks("Chava");
        pappu.availableBooks();
        System.out.println(pappu.isContains("chAvA"));
        pappu.assignBook("chAvA");
        System.out.println("After book is assign, the available books are: ");
        pappu.availableBooks();
    }

}
