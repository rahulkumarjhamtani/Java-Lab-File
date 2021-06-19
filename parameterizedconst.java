class student {
    int id;
    String name;

    student(int i, String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id + " " + name);
    }
    public static void main(String args[])
    {
        student s1 = new student(111,"Rahul");
        student s2 = new student(132,"Himanshu");

        s1.display();
        s2.display();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" parameterizedconst.java     for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" student               for CLASS
