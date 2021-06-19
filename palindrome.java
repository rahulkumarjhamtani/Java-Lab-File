class palindrome{
    public static void main(String args[])
    {
        int r,sum=0,temp;
        int n=151;
        temp=n;

        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(temp + " is a Palindrome number");
        else    
            System.out.println(temp + " is not a Palindrome number");

    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" palindrome.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" palindrome                for CLASS