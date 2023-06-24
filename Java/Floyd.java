import java.util.*;
public class Floyd {
    int n;
    int d[][]=new int[20][20];
    void getdata()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of nodes: ");
        n=s.nextInt();
        System.out.println("Enter the cost matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            d[i][j]=s.nextInt();
        }
    }
    void shortest()
    {
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    d[i][j]=min(d[i][j],d[i][k]+d[k][j]);
                }
            }
        }
    }
    int min(int x,int y)
    {
        if(x<y)
        return x;
        else
        return y;
    }
    void display()
    {
        System.out.println("The Shortest Pair:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+d[i][j]);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyd ob=new Floyd();
        ob.getdata();
        ob.shortest();
        ob.display();
    }
}