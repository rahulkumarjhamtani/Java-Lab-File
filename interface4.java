interface drawtable3
{
    void draw();
    default void msg()
    {
        System.out.println("Default method");
    }
}
class rect implements drawtable3
{
    public void draw()
    {
        System.out.println("Rectangle");
    }
}
class interface4
{
    public static void main(String args[])
    {
        drawtable3 obj = new rect();
        obj.draw();
        obj.msg();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" interface4.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" interface4              for CLASS

