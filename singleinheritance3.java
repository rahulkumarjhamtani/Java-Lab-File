class a {
    int age;

    a(int age)
    {
        this.age = age;
    }
    
    public void getage()
    {
        System.out.println("Age = "+age);
    }
    
}
class b extends a
{
    b(int age)
    {
        super(age);
    }
    
    public static void main(String args[])
    {
        b obj = new b(24);
        obj.getage();
    }

}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" singleinheritance2.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" sub_class                for CLASS

