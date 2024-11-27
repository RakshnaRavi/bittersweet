//Shrimayi and Rakshna
@FunctionalInterface
interface Adder {
    int addNumber(int start, int end);
}

public class Main{
    public static void main(String[] args) {
		if(args.length < 2)
		{
			return;
		}

		try{
            int start =  Integer.parseInt(args[0]);;
            int end =  Integer.parseInt(args[1]);;

            Adder add = (a, b) -> {
                int sum = 0;
                for (int i = a; i <= b; i++) {
                    sum += i;
                }
                return sum;
            };

            int result = add.addNumber(start, end);
            System.out.println("The sum: " + result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error");
		}

    }
}

