public class exception3 {
    public static void main(String args[])
    {
        int i = 50;
        int j = 0;
        int data;
        try
        {
            data = i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println(i/(j+2));

    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" exception3.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" exception3                for CLASS
