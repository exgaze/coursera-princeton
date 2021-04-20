public class RandomWalker
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int a = 0;
        int b = 0;
        int steps = 0;
        
        if (r < 0)System.out.println("Please give positive integer");
        else{
        System.out.println("(" + a + ", " + b + ")");
        while(Math.abs(a)+Math.abs(b) != r)
        {
            double w = Math.random();
            
            if (w <= 0.25) a--;
            else if (w <= 0.50) a++;
            else if (w <= 0.75) b--;
            else if (w <= 1.00) b++;
            
            steps++;
            System.out.println("(" + a + ", " + b + ")");
        }
        System.out.println("steps = " + steps);
            }
    }
}
