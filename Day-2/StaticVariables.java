public class Static_Var{

    static int static_var = 100;

    void m1(){
        System.out.println(static_var+10);
    }
    static void m2(){
        System.out.println(static_var+20);
    }

    public static void main(String[] args){
        Static_Var1 obj = new Static_Var1();
        obj.m1();

        obj.m2();
    }
}
