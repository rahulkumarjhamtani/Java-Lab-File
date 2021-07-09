class degree {
    void getdegree() {
        System.out.println("I got a degree");
    }
}

class ug extends degree {
    void getdegree() {
        System.out.println("I am an Undergraduate");
    }
}

class pg extends degree {
    void getdegree() {
        System.out.println("I am a Postgraduate");
    }
}

class print {
    public static void main(String[] args) {
        degree d = new degree();
        ug u = new ug();
        pg p = new pg();
        d.getdegree();
        u.getdegree();
        p.getdegree();
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" singleinheritance4.java     for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" print               for CLASS
