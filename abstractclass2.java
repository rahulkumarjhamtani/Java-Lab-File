abstract class shape
{
    abstract void draw();
}
class rectangle extends shape{
    void draw()
    {
        System.out.println("Drawing rectangle");
    }
}
class circle extends shape{
    void draw()
    {
        System.out.println("Drawing circle");
    }
}
class abstractclass2{
    public static void main(String args[])
    {
        shape obj = new circle();
        obj.draw();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" abstractclass2.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" abstractclass2                for CLASS

