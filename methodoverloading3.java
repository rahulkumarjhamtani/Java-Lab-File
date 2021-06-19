class addr {
    static int add(int a, int b)
    {
        return a+b;
    }
    static double add(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println(addr.add(10,20));
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" methodoverloading3.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" addr                for CLASS

