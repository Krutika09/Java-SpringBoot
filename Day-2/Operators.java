public class Operators {

    // Operators are special symbols used to perform operations on operands
    // int result = 10 + 20;  // 10,20 operands, + = operator

    public static void main(String[] args) {

        // ==== Arithmetic Operator ====
        int a = 40, b = 20;
        System.out.println("Addition of (A + B) is : " + (a + b));
        System.out.println("Subtraction of (A - B) is : " + (a - b));
        System.out.println("Multiplication of (A * B) is : " + (a * b));
        System.out.println("Modulus (Remainder) of (A % B) is : " + (a % b));
        System.out.println("Division of (A / B) is : " + (a / b));

        // ==== Assignment Operator ====
        int n1 = 100;
        int n2 = 200;
        n1 += n2;
        System.out.println(n1);
        n1 -= n2;
        System.out.println(n1);
        n1 *= n2;
        System.out.println(n1);
        n1 %= n2;
        System.out.println(n1);

        // ==== Relational Operator ====
        int r1 = 223;
        int r2 = 564;
        System.out.println("Is r1 equal to r2: " + (r1 == r2));
        System.out.println("Is r1 not equal to r2: " + (r1 != r2));
        System.out.println("Is r1 greater than r2: " + (r1 > r2));
        System.out.println("Is r1 less than r2: " + (r1 < r2));
        System.out.println("Is r1 greater than or equal to r2: " + (r1 >= r2));
        System.out.println("Is r1 less than or equal to r2: " + (r1 <= r2));

        // ==== Logical Operator ====
        boolean x = true;
        boolean y = false;
        boolean z = true;
        System.out.println(x && y);
        System.out.println(x || z);
        System.out.println(x != y);

        System.out.println((10 > 20) && (20 < 66));
        System.out.println((10 > 20) || (20 < 66));
        System.out.println((10 > 20) != (20 < 66));

        // ==== Unary Operator ====
        int u = 10;
        System.out.println(u++);
        System.out.println(u);
    }
}
