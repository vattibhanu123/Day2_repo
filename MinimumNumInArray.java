class MinimumNumInArray
{
    public static void main(String args[]){
        int arr[]={11,2,3,5,19,12};
        int min=arr[0];
        
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min)
            {
                min=arr[i];
                
            }
        }
        System.out.println(min);
        
    }
    
}
