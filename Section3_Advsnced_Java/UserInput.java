import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter a number");
        // int num = System.in.read();
        // //this returns the ASCII values of the input number

        // System.out.println(num);
        // ----getting input primary way -------
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num1 = Integer.parseInt(bf.readLine());

        //----getting inpout secvondary way
        System.out.println("Enter another number");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        
        System.out.println(num1+" and "+num2);

        bf.close();
        sc.close();
    }
} 

