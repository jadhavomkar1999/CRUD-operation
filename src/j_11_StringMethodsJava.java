public class j_11_StringMethodsJava {
    public static void main(String[] args){
        String name = "Omkar";                  // String is Immutable.

        String str = "   India is      my   country   .    ";
        //String a1 = new String("Omkar");      // another method for string
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(str.trim());                  //Remove extra spaces from  starting and ending of the string.

        System.out.println(name.substring(2));       // return sustring from given starting index.
        System.out.println(name.substring(0,4));          // return the substring from start index to the end index. start index included and end index excluded.
        System.out.println(name.replace('r','a'));   // replace old char with the new char in given string.
        System.out.println(name.replace("ar","ya"));  // replace string with another string.
        System.out.println(name.startsWith("Om"));      // return true if starts with given string.
        System.out.println(name.endsWith("ar"));        // return true if ends with given string.
        System.out.println(name.charAt(0));           // return char at given index.
        System.out.println(name.indexOf("ar"));       // return index of the given string.
        System.out.println(name.indexOf("ar",2));  // returnindex of given string starting from the given index.
        System.out.println(str.lastIndexOf("i"));       // return last index of given string.
        System.out.println(name.lastIndexOf("a",4));  //return last index of given string before given index.
        System.out.println(name.equals("Omkar"));     // return true if both string is same.
        System.out.println(name.equalsIgnoreCase("omKAr"));  // return true if both string are same it ignore the upper of lower form of charecter.

    }
}
