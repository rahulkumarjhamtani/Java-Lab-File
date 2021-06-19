class reversenum{
    public static void main(String args[])
    {
        int r,s,temp;
        int n=456;

        
        r=n%10;
        temp = n/10;
        s = temp%10;
        n=n/100;
        
        System.out.print(r+""+s+""+n);

    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" reversenum.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" reversenum                for CLASS
