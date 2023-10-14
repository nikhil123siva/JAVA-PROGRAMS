import java.io.*;
import java.util.*;
class hourglass
{
    int max(int arr[][])
    {
        
        int h[]=new int[100];
        int index=0;
        int sum=0;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                sum=arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                h[index]=sum;
                index++;               
            }
        }
        int max1=h[0];
        for(int i=0;i<16;i++)
        {
            if(max1 < h[i])
            {
                max1=h[i];
            }
        }
        return max1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        int arr[][]=new int [100][100];
        hourglass obj=new hourglass();
        System.out.println("Enter the elements:");
        for(int i=0;i<6;i++)
        for(int j=0;j<6;j++)
        arr[i][j]=sc.nextInt();
        int max=obj.max(arr);
        System.out.println("Max="+max);
    }
}