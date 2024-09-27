
class MergingTwoArrays{
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={3,8,9,7,0};
        int A=arr1.length;
        int B=arr2.length;
        int C=A+B;
        int arr3[]=new int[C];
        for(int i=0;i<A;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<B;i++){
            arr3[A+i]=arr2[i];
        }
        System.out.println("Merged array");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}
