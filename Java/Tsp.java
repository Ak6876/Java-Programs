import java.util.*;
public class Tsp {
    int n,sum;
    int visited[]=new int[20];
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
        for(int i=0;i<n;i++)
        {
            visited[i]=0;
        }
    }
    void travel(int u)
    {
        int v;
        sum=0;
        visited[u]=1;
        v=nearest(u);
        System.out.print(u+"--");
        if(v==-1)
        {
            System.out.print(0);
            sum=sum+d[u][0];
            return;
        }
        sum=sum+d[u][v];
        travel(v);
    }
    int nearest(int u)
    {
        int v=-1;
        int min=999;
        for(int i=0;i<n;i++)
        {
            if(d[u][i]<min && visited[i]==0)
            {
                min=d[u][i];
                v=i;
            }
        }
        return v;
    }
    void display()
    {
        System.out.println("cost of tsp="+sum);

    }
    public static void main(String[] args) {
        Tsp ob=new Tsp();
        ob.getdata();
        ob.travel(0);
        ob.display();
    }
}

