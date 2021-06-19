import java.util.*;

class multiply {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("a = ");
        float num1=s.nextFloat();
        System.out.print("b = ");
        float num2=s.nextFloat();

        int num3 = (int)((num1)/(1/num2));                 //multiply without using * operator
        System.out.println("Multiplication is "+num3);

    } 
    
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" scanner.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" multiply                for CLASS

