class student {
    int id;
    String name;

    void display()
    {
        System.out.println(id + " " + name);
    }
    public static void main(String args[])
    {
        student s1 = new student();        
        student s2 = new student();
        
        s1.display();
        s2.display();

    }
    
}

 // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" defaultconstructor2.java     for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" student               for CLASS
