class pattern1  
{  
    public static void main(String[] args)  
    {  
        int i, j, n=8;  
        for (i = 0; i<=n; i++)   
        {   
            for (j = 0; j<= n / 2; j++)   
            {    
                if ((j == 0 || j == n / 2) && i != 0 || i == 0  && j != n / 2 || i == n / 2)   
                    System.out.print("*");  
                else  
                    System.out.print(" ");  
            }  
            System.out.println();  
        }  
    }  
}  

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" pattern1.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" pattern1                for CLASS