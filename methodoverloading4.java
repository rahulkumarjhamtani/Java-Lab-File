public class methodoverloading4  {
        static void armstrong(int n)
        {
            int c=0,a,temp;
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
            methodoverloading4.armstrong(153);
            
    
        }
    }
    
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" armstrong.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" armstrong                for CLASS

