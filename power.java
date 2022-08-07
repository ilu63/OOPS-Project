import java.util.Scanner;
public class power {
    public static int power(int x, int y) {
        
        if(y==0){
            return 1;
        } 
        if (y%2 == 0){
        return power(x,y/2) * power(x, y/2);
        }
        return x * power(x, y/2) * power(x, y/2);


         
    }

    public static void main(String args[])
    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Base Number: ");  
            int x = scan.nextInt();
            System.out.println("Enter the power number: ");  
            int y = scan.nextInt();  
            // int x= 2;
            // int y = 3;
        System.out.println(x +" raised to power "+ y + " is (" + x + "^" + y + ") = " + power(x,y));
        }   
        
        

    }
}
