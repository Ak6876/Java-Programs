import java.util.Scanner;

public class Kruskal {
    int n,ne,sum;
    int d[][]=new int[20][20];
    int parent[]=new int[20];
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
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }

    }
    void spantree()
    {
        ne=0;sum=0;
        int i,j,min,u=0,v=0;
        while(ne!=n-1)
        {
            min=999;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(d[i][j]<min)
                    {
                        min=d[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            if(find(u)!=find(v))
            {
                System.out.println(u+"-"+v+"="+d[u][v]);
                ne++;
                parent[v]=u;
                sum=sum+d[u][v];
             }
             d[u][v]=d[v][u]=999;
        }
        System.out.println("The minimum spanning tree cost="+sum);
    }
    int find(int x)
    {
        while(x!=parent[x])
        {
            x=parent[x];
        }
        return x;
    }
    public static void main(String[] args) {
        Kruskal ob=new Kruskal();
        ob.getdata();
        System.out.println("Minimum spanning Tree: ");

        ob.spantree();
    }
}
