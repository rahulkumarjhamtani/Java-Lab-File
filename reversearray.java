public class reversearray {

        static void func(int a[])
        {
            int i,j,temp;
            int n=a.length-1;
            System.out.println("Elements in array : ");
            for(int x:a)
            {
                System.out.print(x + " ");
            }

            System.out.println("\n Reversed Elements : ");
            for(i=0,j=n;i<(a.length)/2;i++,j--)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            for(int k=0;k<a.length;k++)
            {
                System.out.print(a[k] + " ");

            }
        }

        public static void main(String args[])
        {
            func(new int[] {10,20,30,40,50,60});
        } 
     
}

// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" secondlargest.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" secondlargest                for CLASS