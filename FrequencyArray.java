public class FrequencyArray {  
    public static void main(String[] args) {  
       
        int arr[] = {1,9,2,2,9,4,6,1,4,0,4 };  
        int newArr[] = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    newArr[j] = visited;  
                }  
            }  
            if(newArr[i] != visited)  
                newArr[i] = count;  
        }  
  
      
        System.out.println(" Element | Frequency");  
        
        for(int i = 0; i < newArr.length; i++){  
            if(newArr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + newArr[i]);  
        }  
       
    }}  






