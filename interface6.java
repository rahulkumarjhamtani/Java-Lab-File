class showtable2
{
    interface message2
    {
        void msg();
    }
}
class interface6 implements showtable2.message2
{
    public void msg()
    {
        System.out.println("Hello");
    }
    public static void main(String args[])
    {
        showtable2.message2 obj = new interface6();
        obj.msg();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" interface6.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" interface6              for CLASS

