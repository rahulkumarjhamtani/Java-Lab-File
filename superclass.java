class A {
    String s = "Class A";
}
class B extends A{
    String s = "Class B";
    {
        System.out.println(super.s);
    }
}
class C extends B {
    String s = "Class C";
    {
        System.out.println(super.s);
    }
}
class superclass{
    public static void main(String args[])
    {
        C obj = new C();
        System.out.println(obj.s);
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" superclass.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" superclass                for CLASS
