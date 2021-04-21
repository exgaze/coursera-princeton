public class ThueMorse
{
    public static void main(String[] args)
    {
        int length = Integer.parseInt(args[0]);
        boolean[] a;
        a = new boolean[length];
        a[0] = false;
        a[1] = true;
        for ( int i = 2; i <= length; i *= 2 )
        {
            if ( a[i/2 - 1] == false ) a[i/2 + 1] = true;
            else if ( a[i/2 - 1] == true ) a[i/2 + 1] = false;
        }
        for ( int i = 0; i < length; i++ )
        {
            for ( int j = 0; j < length; j++ )
            {
                if ( a[j] == true && j == length - 1 ) System.out.println("-");
                else if ( a[j] == false && j == length - 1 ) System.out.println("+");
                else if ( a[j] == true ) System.out.print("-  ");
                else if ( a[j] == false ) System.out.print("+  ");
            }
        }
    }
}
