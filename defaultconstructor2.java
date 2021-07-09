class student2 {
    int id;
    String name;

    void display()
    {
        System.out.println(id + " " + name);
    }
    public static void main(String args[])
    {
        student2 s1 = new student2();        
        student2 s2 = new student2();
        
        s1.display();
        s2.display();

    }
    
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" defaultconstructor2.java     for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" student2               for CLASS
