import java.util.Scanner;

public class DesiredSum {
    
    public static int[] operation(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == sum - array[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return array;
       
    }

    public static void main(String args[])
    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of elements you want to store: ");  
            int n = scan.nextInt();  
            int[] array = new int[10];  
            System.out.println("Enter the elements of the array: ");  
            for(int k=0; k<n; k++)  
            {  
            array[k]=scan.nextInt();  
            } 
            // int[] array = {2,4,5,6,7,8,9,3,1};
            System.out.println("Enter the desired sum value: ");  
            int sum = scan.nextInt();
            int[] result = new int[2];
      
        result = DesiredSum.operation(array, sum);

        System.out.println("Desire sum is the sumation of index " + result[0] + " and index " + result[1]);
        }   
        
        

    }
}
