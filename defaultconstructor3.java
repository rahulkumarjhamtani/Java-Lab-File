class student3 {
    String name;

    student3(String s)
    {
        name=s;
    }
    student3()
    {
        name="Unknown";
    }
    public static void main(String args[])
    {
        student3 s1 = new student3("Rahul");        
        student3 s2 = new student3();
        
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
    
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" defaultconstructor3.java     for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" student3               for CLASS

