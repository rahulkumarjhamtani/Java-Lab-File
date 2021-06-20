class adders {
    static int add(int a, int b)
    {
        return a+b;
    }
    static double add(double d, double e)
    {
        return d+e;
    }
    public static void main(String args[])
    {
        System.out.println(adders.add(10,20));
        System.out.println(adders.add(10.2,20.2));
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" methodoverloading2.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" adders                for CLASS
