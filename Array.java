public class Array{
    public static void main(String args[]){
        int[] age = {12,3,2,6,7,9,0}; 
        // System.out.println("This is first element of array : " + age[0] );
        
        for (int element: age){
            System.out.println(element);//Print arrary one by one
        }
    }
}
// ==========================================================
public class Array{
    public static void main(String args[]){
        int[] data = new int[5]; //declare and allocate the memory
        
        data[0] = 7;
        data[1] = 87;
        data[2] = 47;
        data[3] = 70;
        data[4] = 74;
        
        System.out.println( data[3]);
        
    }
}
