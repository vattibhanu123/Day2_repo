
import java.util.*;
class ArrayInitilizationFromUser{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int num=sc.nextInt();
            int res[]=new int[num];
            
            for(int i=0;i<num;i++){
                 System.out.println("Enter the Element of the array");
                res[i]=sc.nextInt();
             
            }
             System.out.println("Elements of the array");
            System.out.println(Arrays.toString(res));
        }
        
        
    }
}
