public class RandomWalkers
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);
        int a = 0;
        int b = 0;
        double steps = 0;
        double average = 0;
        
        if (r < 0 || trials < 0) System.out.println("Please give positive integer");
        else{
        for(int i = 0; i <= trials; i++)
        {
            while(Math.abs(a)+Math.abs(b) != r)
            {
                double w = Math.random();
            
                if (w <= 0.25) a--;
                else if (w > 0.25 && w <= 0.50) a++;
                else if (w > 0.50 && w <= 0.75) b--;
                else if (w > 0.75 && w <= 1.00) b++;
            
                steps++;
            }
            average = average + steps;
            a = 0;
            b = 0;
            steps = 0;
            }
        System.out.println("average number of steps = " + average/trials);
        }
    }
}
