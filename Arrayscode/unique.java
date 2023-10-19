import java.util.Scanner;

public class unique {
    public static void main(String args[]) {

        int n;
        int uq=0;
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }  
        for(int j=0;j<n;j++)
        {
         uq=uq^a[j];
        }
        System.out.println(uq);                 
        
    }
}
