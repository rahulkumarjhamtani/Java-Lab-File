abstract class demo
{
    abstract void run();
}
class abstractclass1 extends demo{
    void run()
    {
        System.out.println("Running Safely");
    }
    public static void main(String args[])
    {
        demo obj = new abstractclass1();
        obj.run();
    }
}
