import java.util.Scanner;

public class swapalternate {
    
    public static void main(String args[])
     {  int n;
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }                         // i i+1  i   i+2   i
        for(int i=0;i<n;i+=2)     // 1  2   4   5     7
        {
            if(i+1<n)
            {
              int temp=a[i];
              a[i]=a[i+1];
              a[i+1]=temp; 
             
            }
            
        } 
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]);
        }
        System.out.println();
        
       
        sc.close();

    }
}
