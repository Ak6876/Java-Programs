import java.util.*;
public class merge {
    static void divide(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide(a,low,mid);
            divide(a,mid+1,high);
            mergesort(a,low, mid,high);
        }
    }
    static void mergesort(int a[],int low,int mid ,int high)
    {
        int i=low,j=mid+1,k=low;
        int b[]=new int[50];
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
            {
                b[k++]=a[i++];
            }
            else
            {
                b[k++]=a[j++];
            }
        }
        while(i<=mid)
        {
            b[k++]=a[i++];
        }
        
        while(j<=high)
        {
            b[k++]=a[j++];
        }
        for(k=low;k<=high;k++)
        {
            a[k]=b[k];
        }
    }
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        Random rand=new Random();
        int a[]=new int[500];
        System.out.println("Enter the no of elements: ");
        int n=read.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=rand.nextInt(500);
            System.out.println(a[i]);

        }
        System.out.println();
        long t1=System.nanoTime();
        divide(a,0,n-1);
        long t2=System.nanoTime();
        System.out.println("Total time taken: "+(t2-t1));
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+a[i]);
        }



    }
}
