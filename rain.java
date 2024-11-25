
@FunctionalInterface

interface NumAdd
{
	int numbers(int a, int rVal);
}

public class rain implements NumAdd
{
	public static void main (String [] args)
	{
		NumAdd add = (a, rVal) ->
		{
			int sum =0;
			for(int i = a; i < rVal; i++)
			{
				sum+=i;
			}
			return sum;
		}
	}
}

