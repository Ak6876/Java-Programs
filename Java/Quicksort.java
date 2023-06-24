import java.util.*;
public class Quicksort {
   static int partition(int s[],int low,int high)
    {
        int pivot=s[low],i=low+1,j=high;
        while(i<=j)
        {
            while(s[i]<=pivot)
            {
                i++;
            }
            while(s[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                swap(s,i,j);
            }
        }
        swap(s,low,j);
        return j;
    }
    static void swap(int s[],int x,int y)
    {
        int temp=s[x];
        s[x]=s[y];
        s[y]=temp;
    }
    static void divide(int s[],int low,int high)
    {
        if(low<high)
        {
            int j=partition(s,low,high);
            divide(s, low, j-1);
            divide(s,j+1,high);
        }
    }
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        Random n=new Random();
        int s[]=new int[500];
        System.out.println("Enter the no of elements: ");
        int num=read.nextInt();
        for(int i=0;i<num;i++)
        {
            s[i]=n.nextInt(250);
            System.out.println(s[i]);

        }
        System.out.println();
        long t1=System.nanoTime();
        divide(s,0,num-1);
        long t2=System.nanoTime();
        System.out.println("Total time taken: "+(t2-t1));
        for(int i=0;i<num;i++)
        {
            System.out.println(" "+s[i]);
        }

    }

}
