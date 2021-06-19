public class secondlargest {
        public static void main(String args[])
        {
            int arr[] = {33,40,44,50,52,20,7,18};
            System.out.println("Elements in array ");
            for(int i:arr)
            {
                System.out.print(" "+i);

            }

            for(int j=0;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    int temp;
                    if(arr[j] > arr[k])
                    {
                        temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
            
            System.out.println("\n");
            System.out.println("Second Largest = "+arr[arr.length - 2]);
        }  
    }
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" secondlargest.java          for JAVA file
    // & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" secondlargest                for CLASS
