public class overloadtypecast {
        void sum(int a, long b)
        {
            System.out.println(a+b);
        }
        void sum(int a, int b, int c)
        {
            System.out.println(a+b+c);
          
        }
        public static void main(String args[])
        {
            overloadtypecast obj = new overloadtypecast();
            obj.sum(10,10);
            obj.sum(10,20,30);
        }
    }
    
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" overloadtypecast.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" overloadtypecast                for CLASS
 
