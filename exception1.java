public class exception1 {
    public static void main(String args[])
    {
        // to handle not defined values
        try
        {
            int data = 100/0;
        }
        // arithmetic exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest code");

    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" exception1.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" exception1                for CLASS
