public class exception2 {
    public static void main(String args[])
    {
        try
        {
            int data = 50/0;
        }
        catch(Exception e)
        {
            System.out.println("Can't divide by zero");
        }

    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" exception2.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" exception2                for CLASS
