import java.util.*;
public class reverse {
    static int swapValuesUsingXOROperator(int m, int n)
    {
        // Logic of XOR operator
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        return m;
        
    }

   static void reverse1(int arr1[],int n){
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            swapValuesUsingXOROperator(arr1[start],arr1[end]);
            start++;
            end--;
        }
        System.out.println(arr1);
    }
    public static void main(String args[]) {
        int arr[]=new int[100];
        int n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        n1=sc.nextInt();
        System.out.println("enter array elements");
        for(int i=0;i<n1;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        reverse1(arr,n1);
     sc.close();   
    }
    
}
