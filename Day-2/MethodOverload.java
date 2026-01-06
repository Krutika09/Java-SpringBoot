class CalculatorMethodOverload {

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}

public class MethodOverload{
    public static void main(String[] args){
        CalculatorMethodOverload c = new CalculatorMethodOverload();

        System.out.println("Add 2 intergers: "+c.add(10,20));
        System.out.println("Add 3 intergers: "+c.add(10,20, 30));
        System.out.println("Add 2 doubles: "+c.add(10.88,20.67));



    }
}
