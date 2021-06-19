class parent2 {
    
    void run()
    {
        System.out.println("Vehicle is running");

    }
}
class child2 extends parent2
{
    void run()
    {
        System.out.println("Bike is running");
        super.run();
    
    }
    public static void main(String args[])
        {
            child c = new child();
            c.run();
    
        }
    }
    
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" overriding2.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" child2                for CLASS

