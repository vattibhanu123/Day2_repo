import java.util.Arrays;
public class SecondLargest {
    public static void main(String args[])
    {
        int arr[]={1,2,9,4,6,7};
        print2largest(arr);
        
    }
    public static void print2largest(int arr[]){
        if(arr.length<2){
            System.out.println("Invalid input");
            return;
        }
       Arrays.sort(arr);
       for(int i=arr.length-2;i>=0;i--){
        if(arr[i]!=arr[arr.length-1])
        {
            System.out.println("second largest element :"
            +arr[i]);
            return;
        }
       }
       System.out.println("There is no Second largest element");
    }
}

