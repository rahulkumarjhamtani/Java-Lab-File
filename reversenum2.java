import java.util.*;
class reverse{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = s.nextInt();

        int rev = fun(num);
        
        System.out.print("Reversed number : " + rev);

    }

    public static int fun(int number)
    {
        int n = 0,temp = 0;
        do
        {
            temp = number % 10;
            n = n * 10 + temp;
            number = number / 10;
        }while(number > 0);
        return n;
    } 
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" reversenum2.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" reverse               for CLASS

