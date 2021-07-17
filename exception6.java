import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exception6 {
    public static void main(String args[])
    {
        PrintWriter pw;
        try
        {
            // create a new text file of name exception6.txt
            pw = new PrintWriter("exception6.txt");
            pw.println("saved");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        System.out.println("File saved successfully");

    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" exception6.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" exception6                for CLASS

