abstract class message
{
    abstract void show();
}
class first extends message{
    void show()
    {
        System.out.println("Hello");
    }
}
class second extends message{
    void show()
    {
        System.out.println("Hey");
    }
}
class abstractclass4{
    public static void main(String args[])
    {
        message obj = new second();
        obj.show();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" abstractclass4.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" abstractclass4                for CLASS



