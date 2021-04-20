public class GeneralizedHarmonic
{
    public static void main(String[] args)
    {
        double n = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double result = 0;

        if (n <= 0){System.out.println("Please give positive integer");}
        else
        {
        for(int i = 1; i <= n; i++)
            {
                result = result + 1.0/Math.pow(i, r);
            }
            System.out.println(result);
        }
    
    }
}
