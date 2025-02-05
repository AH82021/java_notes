

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

        // SubString

        String str1 = "Java shazam is fun with ";


        if(str1.indexOf("shazam")>0){
            System.out.println("Found the name");
        }

        System.out.println(str1.indexOf("shazam"));

        // IndexOf

        System.out.println(str1.indexOf('f'));


        String str2 = "java";

        System.out.println(str2.substring(1,3));


        //Join  I like java

        String a = "Java";
        String b = "Like";
        String cc = "I";
        // I - like- Java

        String joinedStr = String.join(" ",cc,b,a);
        System.out.println(joinedStr);


// replace

        String sEx = "bat ball";

       String newStr = sEx.replace('b','c');

        System.out.println(newStr);

        // String : immutable

        String username ="Jack";
        username = "ali";


        //Mutable

       // StringBuffer, StringBuilder
        //SQl

        // Database , MangoDb(NoSQl) , Document , Collection , (table(Rows,Cols) Relational Database or SQL
        // DBMS
        // POSTGRES


        StringBuilder user = new StringBuilder("jack ");
        user.append("Smith");

        System.out.println(user);

    }
}
