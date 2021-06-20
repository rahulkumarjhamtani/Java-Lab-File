class super_class {
    int num=20;

    public void display()
    {
        System.out.println("This is the display method of superclass");
    }
}
class sub_class extends super_class
{
    int num=10;
    
    public void display()
    {
        System.out.println("This is the display method of subclass");
    }
    public void my_method()
    {
        sub_class sub = new sub_class();
        super_class sup = new super_class();
        sub.display();
        sup.display();
        System.out.println("Value = "+ sub.num);
        System.out.println("Value = "+ sup.num);
    }
    public static void main(String args[])
    {
        sub_class obj = new sub_class();
        obj.my_method();
    }

}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" singleinheritance2.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" sub_class                for CLASS
