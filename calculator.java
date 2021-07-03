import java.util.*;

class calculator {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("a = ");
        float num1=s.nextFloat();
        System.out.print("b = ");
        float num2=s.nextFloat();

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");

        while (true) {
            System.out.print("Operator ");
            int op = s.nextInt();
            if(op == 1)
            {
                System.out.println("Addition is "+(num1 + num2));
            }
            else if(op == 2)
            {
                System.out.println("Subtraction is "+(num1 - num2));
            }
            else if(op == 3)
            {
                System.out.println("Multiplication is "+(num1 * num2));
            }
            else if(op == 4)
            {
                System.out.println("Division is "+(num1 / num2));
            }
            else
            {
                System.out.println("No such operator");
            }
        }


    } 
    
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" calculator.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" calculator                for CLASS

