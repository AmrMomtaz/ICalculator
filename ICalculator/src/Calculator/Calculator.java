package Calculator;

public class Calculator implements ICalculator
{
	public int add(int x, int y)
	{
		return x+y;
	}
	public float divide(int x, int y)
	{
		if (y==0)throw new IllegalArgumentException("MATH ERROR : Cannot divide by 0");
		return (float)x/y;
	}
}