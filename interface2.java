interface drawtable
{
    void draw();
}
class root1 implements drawtable
{
    public void draw()
    {
        System.out.print("Hello");
    }
}
class root2 implements drawtable
{
    public void draw()
    {
        System.out.print("Hi");
    }
}
class interface2
{
    public static void main(String args[])
    {
        drawtable obj = new root2();
        obj.draw();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" interface2.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" interface2               for CLASS
