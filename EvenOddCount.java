class EvenOddCount{
    public static void main(String args[])
    {
       int arr[]={1,2,3,4,5,6,9,12,54,34,23,73,0};
       int oddCount=0;
       int evenCount=0;
       for (int i=0;i<arr.length;i++)
       {
           if(arr[i]%2==0)
           {
               evenCount++;
           }
           else{
               oddCount++;
           }
       }
        System.out.println("oddcount : "+oddCount  + "\nEvenCount : "+evenCount );
        
    }
}
