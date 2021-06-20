class calculation {
    int z;
    public void add(int x,int y)
    {
        z=x+y;
        System.out.println("Sum = "+z);
    }
    public void sub(int x,int y)
    {
        z=x-y;
        System.out.println("Sub = "+z);
    }
}

class calc extends calculation
{
    public void mul(int x,int y)
    {
        z=x*y;
        System.out.println("Mul = "+z);
    }
    public static void main(String args[])
    {
        int a=20;
        int b=10;
        calc demo = new calc();
        demo.add(a,b);
        demo.sub(a,b);
        demo.mul(a,b);
        
    }  

}
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" singleinheritance.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" my                for CLASS
