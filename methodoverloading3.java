class overloading_main {
    public static void main(String args[])
    {
        System.out.println("Main with args array");
        overloading_main.main("abc");
        overloading_main.main();
    }
    public static void main(String args)
    {
        System.out.println("Main with args");
    }
    public static void main()
    {
        System.out.println("Main without arguments");
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" methodoverloading4.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" overloading_main                for CLASS

