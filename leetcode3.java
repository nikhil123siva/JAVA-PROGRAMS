//longest substring
import java.io.*;
import java.util.*;
class leetcode3
{
    public static void main(String[] args) {
        String s=" ";
        int maxlen=0;
        int temp=0;
        int n=s.length();
        int flag=1;
        if(n==0)
        {
            maxlen=0;
            System.out.println(maxlen);
        }

        else if(n==0)
        {
            System.out.println("maxlen");
        }
        int charArr[]=new int[n];
        int left=0;
        for(int right=0;right<n;right++)
        {
            char currentChar=s.charAt(right);
            left=s.indexOf(currentChar,right+1);
            System.out.println("left="+left);
            if(left!=-1)
            {
                temp=left-right+1;
                if(temp > maxlen)
                maxlen=temp;
                flag=0;
            }
        }
        if(flag==1)
        {
            maxlen=n;
        }
        System.out.println(maxlen);
    }
}