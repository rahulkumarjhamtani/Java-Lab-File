public class binarysearch {
    public static void main(String args[])
    {
        int a [] = {11,22,33,44,55,66,77,88,99};
        int key = 77;
        System.out.println("Key = "+ key);
        int f = 0;
        int l = a.length - 1;
        int mid = (f + l)/2;
        while(f<=l)
        {
            if(a[mid] == key)
            {
                System.out.print("Position = "+ (mid + 1));
                break;
            }    
                
            else if(a[mid]<key)
                f = mid + 1;
            else
                l = mid - 1;
            mid = (f + l)/2;
        }
    }
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" binarysearch.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" binarysearch                for CLASS
