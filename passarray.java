public class passarray {

        static int[] get()
        {
            return new int [] {10,20,30,40,50};
        }
        
        public static void main(String args[])
        {
            int arr[] = get();
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        } 

    }
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" passarray.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" passarray                for CLASS
    