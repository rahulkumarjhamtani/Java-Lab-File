interface printtable2
{
    void print();
}
interface drawtable2
{
    void draw();
}
class interface3 implements printtable2,drawtable2
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void draw()
    {
        System.out.println("Hi");
    }
    public static void main(String args[])
    {
        interface3 obj = new interface3();
        obj.print();
        obj.draw();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" interface3.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" interface3               for CLASS

