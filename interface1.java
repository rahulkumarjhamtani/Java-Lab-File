interface printtable
{
    void print();
}
class interface1 implements printtable
{
    public void print()
    {
        System.out.print("Hello");
    }
    public static void main(String args[])
    {
        interface1 obj = new interface1();
        obj.print();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" interface1.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" interface1                for CLASS
