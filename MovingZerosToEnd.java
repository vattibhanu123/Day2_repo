
import java.util.Arrays;
class MovingZerosToEnd{
    public static void main(String args[])
    {
        int arr[]={1,2,0,3,0,4,0,0};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
        System.out.print(Arrays.toString(arr));
    }
}
