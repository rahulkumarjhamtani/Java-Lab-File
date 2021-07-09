interface showtable
{
    void show();
    interface message
    {
        void msg();
    }
}
class interface5 implements showtable.message
{
    public void msg()
    {
        System.out.println("Message");
    }
    public static void main(String args[])
    {
        showtable.message obj = new interface5();
        obj.msg();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" interface4.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" interface4              for CLASS

