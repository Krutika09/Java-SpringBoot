import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBArray{
    public static void main(String args[]){
        int[] array = {12,4,5,7,13,14,20};
        System.out.println(array[2]);
        for (int element: array){
            System.out.println(element); }
        
        // =====================================
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        
        System.out.println("Enter you name: ");
        String name = sc.nextLine();
        
        list.add(name);
    
        System.out.println(list);

    }
}
