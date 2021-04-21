public class DiscreteDistribution
{
    public static void main(String[] args)
    {
        int trial = Integer.parseInt(args[0]);
        double[] a;
        a = new double[args.length];
        for ( int i = 0; i < a.length; i++ )
        {
            if( i == 0 ) a[i] = 0;
            else
               a[i] = Double.parseDouble(args[i]);
        }
        
        double[] s;
        s = new double[a.length];
        for ( int i = 1; i < s.length; i++ )
        {
           s[i] = s[i-1] + a[i];
        }
        for ( int i = 1; i <= trial; i++ )
        {
            double prob = Math.random();
            for ( int j = 1; j < a.length; j++ )
            {
                if( s[j-1] / s[s.length-1] < prob && prob <= s[j] / s[s.length-1] ) System.out.print(j + " ");
                else continue;
            }
        }
    }
}
