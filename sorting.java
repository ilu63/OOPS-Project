import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class sorting {
    public static int result(int[] array) {
        Arrays.sort(array);
        int b = array.length - 1;
        int num = 0;
        
        for (int i = b ; i >=0; i--) {
            int x = array[i];
            int y = array[i];
            int k = 0;
            // for(; x != 0; x/=10, ++k);
            while (x != 0) {
                
                x /= 10;
                ++k;
              }
            
            int z = (int) Math.pow(10,k);
                num = num * z + y;
        }
        return num;  
        
    }

    public static void main(String args[])
    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of elements you want to store: ");  
            int n = scan.nextInt();  
            int[] array = new int[n];  
            System.out.println("Enter the elements of the array: ");  
            for(int k=0; k<n; k++)  
            {  
            array[k]=scan.nextInt();  
            } 
     //  int array[] = {22,9, 77};
        System.out.println(result(array));
        }   
        
        

    }
}

    

