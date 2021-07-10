class students {
    int id;
    String name;

    students(int i, String n)
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
        students s1 = new students(111,"Rahul");
        students s2 = new students(132,"Himanshu");

        s1.display();
        s2.display();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" parameterizedconst.java     for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" students              for CLASS
