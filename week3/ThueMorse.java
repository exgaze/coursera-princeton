public class ThueMorse
{
    public static void main(String[] args)
    {
        int length = Integer.parseInt(args[0]);
        boolean[] a;
        a = new boolean[length*length];
        a[0] = false;
        for ( int i = 0; i < a.length/2; i++ )
        {
            if ( a[i] == false ) a[2 * i] = false;
            else a[2 * i] = true;

            if ( a[i] == false ) a[2 * i + 1] = true;
            else a[2 * i + 1] = false;
            
        }
        for ( int i = 0; i < a.length; i++ )
        {
            if ( (i + 1) % length == 0  && a[i] == true ) System.out.println("-");
            else if ( (i + 1) % length == 0 && a[i] == false ) System.out.println("+");
            else if ( a[i] == true ) System.out.print("-  ");
            else if ( a[i] == false ) System.out.print("+  ");
        }
    }
}
