import java.util.Scanner;

public class LinerSearch1{
    static int Linear(int arr[],int size, int key){
   
        for(int i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
               return i;
            }
            
               
         
        }
        return 0;
    }
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);

        int arr1[]=new int[100];
        int n;
        int key;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        System.out.println("Enter array elemnts");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the key");
        key=sc.nextInt();
        
       
       
      
        int found=Linear(arr1, n, key);
        System.out.println("element found at position"+ found);
        sc.close();

    }
}