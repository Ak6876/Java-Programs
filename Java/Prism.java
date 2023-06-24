import java.util.*;
public class Prism {
    int n,ne,sum;
    int d[][]=new int[20][20];
    int visited[]=new int[20];
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
    void spantree()
    {
        ne=0;sum=0;
        int i,j,min,u=0,v=0;
        visited[0]=1;
        while(ne!=n-1)
        {
            min=999;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(d[i][j]<min)
                    {
                        if(visited[i]==1 && visited[j]==0)
                        {
                            min=d[i][j];
                            u=i;
                            v=j;
                        }
                    }
                }
            }
            System.out.println(u+"-"+v+"="+d[u][v]);
            sum=sum+d[u][v];
            ne++;
            visited[v]=1;
        }
        System.out.println("Cost of the spanning tree: "+sum);
    }
    public static void main(String[] args) {
        Prism ob1=new Prism();
        ob1.getdata();
        System.out.println("Minimum spanning Tree: ");
        ob1.spantree();
    }
}                     