class adder {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        System.out.println(adder.add(10,20));
        System.out.println(adder.add(10,20,30));
    }
  
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" methodoverloading.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" adder                for CLASS
