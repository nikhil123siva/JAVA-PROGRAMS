import java.io.*;
import java.util.*;
class leetcode11
{
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int water=0;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                temp=arr[i]*(j-i);
                else
                temp=arr[j]*(j-i);
                if(temp>water)
                water=temp;
            }
        }
        System.out.print("water="+water);
    }
}