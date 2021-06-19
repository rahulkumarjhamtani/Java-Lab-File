public class minnumber {

        static int min(int a[])
        {
            int min=a[0];
            for(int i=0;i<a.length;i++)
            {
                if(min>a[i])
                {
                    min = a[i];
                }
            }
            return min;
        }
        
        public static void main(String args[])
        {
            int ans;
            int arr[] = {33,40,44,50,52,20,7,18};
            System.out.println("Elements in array : ");
            for(int i:arr)
            {
                System.out.print(i + " ");
            }
            ans = min(arr);
            
            System.out.println("\n Minimum number = " + ans);
        } 
     


}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" secondlargest.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" secondlargest                for CLASS