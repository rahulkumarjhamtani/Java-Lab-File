class bubblesort {
        static void bs(int[] arr) {  
            int n = arr.length;  
            int temp = 0;  
             for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++){  
                              if(arr[j-1] > arr[j]){  
                                     //swap elements  
                                     temp = arr[j-1];  
                                     arr[j-1] = arr[j];  
                                     arr[j] = temp;  
                             }  
                              
                     }  
             }  
      
        }  
        public static void main(String[] args) {  
                    int arr[] ={10,2,33,21,3,40,6};  
                     
                    System.out.println("Array Before Bubble Sort");  
                    for(int i=0; i < arr.length; i++){  
                            System.out.print(arr[i] + " ");  
                    }  
                    System.out.println();  
                      
                    bs(arr);//sorting array elements using bubble sort  
                     
                    System.out.println("Array After Bubble Sort");  
                    for(int i=0; i < arr.length; i++){  
                            System.out.print(arr[i] + " ");  
                    }  
       
            }  
    
}


// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\javac" bubblesort.java          for JAVA file
// & "C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin\java" bubblesort                for CLASS
