public class PositiveNegative {
    public static void main(String[] args) {
       
        int array[] = {1,-5,0,8,-4,3,-9,2,8,6,-7};
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        
        int positiveArray[] = new int[positiveCount];
        int negativeArray[] = new int[negativeCount];

        
       int  pCount = 0; 
       int nCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArray[pCount++] = array[i];
            } else {
                negativeArray[nCount++] = array[i];
            }
        }

        
        System.out.println("Positive numbers:");
        for (int num : positiveArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nNegative numbers:");
        for (int num : negativeArray) {
            System.out.print(num + " ");
        }

        
    }
}

