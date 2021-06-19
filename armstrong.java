class armstrong {
    public static void main(String args[])
    {
        int c=0,a,temp;
        int n=153;
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
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" armstrong.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" armstrong                for CLASS