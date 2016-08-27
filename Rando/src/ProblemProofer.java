
public class ProblemProofer
{

    private static int      sum;
    private static int      product;
    public static final int AMOUNT = 5;


    public static void main(String[] args)
    {
        calculate();
    }


    public static void output()
    {
        System.out.println("The sum of the numbers from 1 to " + AMOUNT + " is "
            + sum);
        System.out.println("The product of the numbers from 1 to " + AMOUNT
            + " is " + product);

    }


    public static void calculate()
    {
        int sum = 0;
        int product = 1;

        for (int i = 1; i <= AMOUNT; i++)
        {
            sum = sum + i;
            product = product * i;
        }

        output();
    }
}
