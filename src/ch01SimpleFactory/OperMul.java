package ch01SimpleFactory;

public class OperMul extends Operation{
	
	public int GetResult()
	{
		int result = 0;
		result = numA * numB;
		return result;
	}
}
