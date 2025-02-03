

public class Main {
    public static void main(String[] args) {


        //

        int number = 2;
 // number = number + 4;
       number +=   4;

        System.out.println(number);

        // What is String;
        //String pool;
        // == vs equals

     // String are  immutable
        //  security , thread safety , memory efficiency

        // Class (User defined, Built-in)
      String name = "Ahmad";
     int numberOfChars = name.length();
        System.out.println(numberOfChars);
        // it helps count number of characters with larger String
        // String input validation

//charAt
     char c =   name.charAt(3);
        System.out.println(c);

        //concat
        //AhmadShahdab
    // String newName =   name.concat(" Shahdab").concat(" Badakhshani");

        String newName = name +" Shahdab"+" Badakhshani";
        System.out.println(newName);

        System.out.println("Ajmal is reading with "+name);

        String data = "Data "+ 123;
        System.out.println(data);

        String firstName ="Jeena";
        String lastName =" Razaq";

       String fullName = firstName + lastName;
        System.out.println(fullName);

      boolean bData =  firstName.contains("a");
        System.out.println(bData);
    }
}
