public class methodoverloading4  {
        static void func(int x)
        {
            for(int i=2;i<x;i++)
            {
                if(x % i == 0)
                {
                    System.out.println("Not a prime number");
                    break;
                }
                else
                {
                    System.out.println("Prime number");
                    break;
                }
            }
        }
        static void func(double n)
        {
            double c=0,a,temp;
            temp=n;
    
            while(n>0)
            {
                a=n%10;
                n=n/10;
                c=(c+a*a*a);
            }
            if(temp==c)
                System.out.println(temp + " is a Armstrong number");
            else    
                System.out.println(temp + " is not a Armstrong number");
        }
        public static void main(String args[])
        {
            methodoverloading4.func(7);
            methodoverloading4.func(153.1);
            
    
        }
    }
    
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" methodoverloading4.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" methodoverloading4                for CLASS

