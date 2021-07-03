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

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" abstractclass1.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" abstractclass1                for CLASS
