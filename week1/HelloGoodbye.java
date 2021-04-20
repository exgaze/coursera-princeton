public class HelloGoodbye
    {
        public static void main(String[] args)
            {
                String a = "Hello " + args[0] + " and " + args[1] + ".";
                String b = "Goodbye " + args[1] + " and " + args[0] + ".";
                System.out.println(a);
                System.out.println(b);
            }
}
