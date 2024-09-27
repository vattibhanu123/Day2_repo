public class PrintingDuplicates {
    public static void main(String[] args) {
        int arr[]={9,8,4,8,3,2,6,4,1};
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    
}
}

