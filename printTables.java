

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        System.out.println("Please enter: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("Multiplication Table for: " + input);
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Answer: " + input + " * " + (i + 1) + " = " + input * (i + 1) + ".");
        }
    }
}
