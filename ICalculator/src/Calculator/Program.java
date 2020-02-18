package Calculator;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first number : ");
		int x = input.nextInt();
		System.out.println("Enter the second number : ");
		int y = input.nextInt();
		input.close();
		System.out.println("\n\nThe Sum = "+calc.add(x, y)+"\nThe Division = "+calc.divide(x, y));
	}
}