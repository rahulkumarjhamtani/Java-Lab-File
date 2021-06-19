class fibonacci {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int c,i;
        int n=8;

        System.out.print(b);
        
        for(i=1;i<n;++i)
        {
            c=a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" fibonacci.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" fibonacci                for CLASS
