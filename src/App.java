public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");
        String str = "hello";
        String greeting = str;
        str = "hi";
        System.out.println(str);
        System.out.println(greeting);

    }
}
