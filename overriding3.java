class parent3 {
    
    final void run()
    {
        System.out.println("Vehicle is running");

    }
}
class child3 extends parent3
{
    void run()
    {
        System.out.println("Bike is running");
    
    }
    public static void main(String args[])
        {
            child c = new child();
            c.run();
    
        }
    }
    
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" overriding.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" child                for CLASS

