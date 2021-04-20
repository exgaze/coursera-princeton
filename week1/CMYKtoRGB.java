public class CMYKtoRGB
{
    public static void main(String[] args)
    {
        double cyan    = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow  = Double.parseDouble(args[2]);
        double black   = Double.parseDouble(args[3]);

        double white = 1 - black;
        double red   = 255 * white * (1-cyan);
        double green = 255 * white * (1-magenta);
        double blue  = 255 * white * (1-yellow);

        int redresult   = ( int )Math.round(red);
        int greenresult = ( int )Math.round(green);
        int blueresult  = ( int )Math.round(blue);

        System.out.println("red   = " + redresult);
        System.out.println("green = " + greenresult);
        System.out.println("blue  = " + blueresult);
    }
}
