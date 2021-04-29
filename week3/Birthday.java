public class Birthday
{
    public static void main(String[] args)
    {
        int range = Integer.parseInt(args[0]);
        int trial = Integer.parseInt(args[1]);
        int people = 0;
        double[] result = new double[range];

        for (int i = 0; i < trial; i++)
        {
            people = 0;
            boolean[] firstBirth = new boolean[range];

            while (true)
            {
                people++;
                int pbirth = (int) (Math.random() * range);
                if (firstBirth[pbirth]) {
                    result[people]++;
                    break;
                };
                firstBirth[pbirth] = true;
            }
        }

        double sum = 0;

        for(int j = 1; j < result.length; j++)
        {
            sum += result[j];
            System.out.println(j + "\t" + result[j] + "\t" + sum/trial); 
            if (sum/trial > 0.5) break;
        }
    }
}
