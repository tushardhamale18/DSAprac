import java.util.Scanner;

public class sumofelements {
 public static void main(String[] args) {
    int n;
    int sum=0;
    int arr[]=new int[10];
    System.out.println("Enter the size of array");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
    System.out.println(sum);
    sc.close();
        
    }
    
}
