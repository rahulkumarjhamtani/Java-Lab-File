abstract class demo2
{
    demo2()
    {
        System.out.println("Bike is created");
    }
    abstract void run();
    void gear()
    {
        System.out.println("Gear changed");
    }
}
class honda extends demo2{
    void run()
    {
        System.out.println("Running Safely");
    }
}
class abstractclass3{
    public static void main(String args[])
    {
        demo2 obj = new honda();
        obj.run();
        obj.gear();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" abstractclass3.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" abstractclass3                for CLASS

