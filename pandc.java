import java.util.*;  

class pandc {
    static int factorial(int n) {
       int fact = 1;
       int i = 1;
       while(i <= n) 
       {
          fact *= i;
          i++;
       }
       return fact;
    }
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("n = ");
        int n=s.nextInt();
        System.out.print("r = ");
        int r=s.nextInt();

       int comb, per;
       per = factorial(n) / factorial(n-r);
       System.out.println("Permutation: " + per);
       comb = factorial(n) / (factorial(r) * factorial(n-r));
       System.out.println("Combination: " + comb);
    }
 }

 // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" pandc.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" pandc                for CLASS
