class complex {
    double real;
    double img;

    complex()
    {
        real = 0;
        img = 0;
    }
    // complex(double r)
    // {
    //     real = r;
    // }
    complex(double r, double i)
    {
        real = r;
        img = i;
    }
    void display()
    {
        System.out.println(real + " + " + img + "i");

    }
    // void sum(double real, double imaginary)
    // {
    //     System.out.println("Sum = "+ real + " + " + imaginary + "i");
    // }
    void sum(complex x, complex y)
    {
        real = x.real + y.real;
        img = x.img + y.img;
        System.out.println("Sum = "+ real + " + " + img + "i");
    }
    public static void main(String args[])
    {
        // complex c1 = new complex(1.1);
        complex c1 = new complex(1.6,3.3);
        System.out.print("a = ");
        c1.display();
        complex c2 = new complex(2,7.5);
        System.out.print("b = ");
        c2.display();
        complex c3 = new complex();
        c3.sum(c1,c2);
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" constructor2.java     for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" complex               for CLASS

