import java.util.Scanner;

public class Kanpsack {
    int n,m;
    int w[]=new int [20];
    int p[]=new int [20];
    int v[][]=new int [20][20];
     void getdata()
    {   Scanner read=new Scanner(System.in);
        System.out.println("Enter no of items: ");
        n=read.nextInt();
        System.out.println("Enter the weight of each items: ");
        for(int i=0;i<n;i++)
        {
            w[i]=read.nextInt();
        }
        System.out.println("Enter the profit of each items: ");
        for(int i=0;i<n;i++)
        {
            p[i]=read.nextInt();
        }
        System.out.println("Enter the max cpacity: ");
            m=read.nextInt();
        
    }
    int max(int x,int y)
    {
        if(x>y)
        return x;
        else{
            return y;
        }
    }
    void optimal()
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                {
                    v[i][j]=0;
                }
                else if(w[i]>j)
                {
                    v[i][j]=v[i-1][j];
                }
                else{
                    v[i][j]=max(v[i-1][j], p[i]+v[i-1][j-w[i]]);
                }
            }
        }
    }
    void display()
    {
        System.out.println("************");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.print(" "+v[i][j]);
            }
            System.out.println();
        }
        System.out.println(" The optimal solution is:"+v[n][m]);

    }
    public static void main(String args[]) {
        Kanpsack s=new Kanpsack();
        s.getdata();
        s.optimal();
        s.display();
        
    }
}