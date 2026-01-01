public class Literals {

    public static void main(String[] args){

//        Literals = Literals are constant used in JAVA to represent fixed values.
//        For ex. int rollno = 101; This value is directly assigned to variables.

//        ====Integer Literals====
       int no1 = 123456789;
       long no2 = 12345678901l;
       int no1 = 1_00_000_00;
       int no1 = 0b110101; // 0b for binary number.
       int no1 = 031; // 0 is used for octal number.
       int no1 = 0x19; // 0x for hexadecimal.
       System.out.println(no1);

//        ====Floating-point Literals====
       float f1 = 12.3F;
       System.out.println(f1);

       double d1 = 23.56;
       System.out.println(d1);

//        ====Character literals{'A', '@', '\n'}====
       char c1 = '@'; // char only accept in single quotes
       System.out.println(c1);

       char c2 = '\n'; //We can use special character like \n=for new line, \t=for tab
       System.out.println("Hello" + c2 + "Krutika");

       char c3 = '\t';
       System.out.println("Hello" + c3 + "Krutika");

//        ====String Literals====
       String name = "Krutika Yawale";
       System.out.println(name);

       String phno = "9876543210";
       System.out.println(phno);

    }
}
