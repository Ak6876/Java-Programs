import java.util.*;
public class Dijlstra {
    public static int min(int a,int b)
    {
    if(a<b)
    return a;
    else
    return b;
    }
    public static boolean check(int[] v,int n)
    {
    for(int i=1;i<n+1;i++)
    {
    if(v[i]!=1)
    return
    true;
    }
    return false;
    }
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of nodes in graph");
    int n=s.nextInt();
    int i,j;
    int graph[][]=new int[n+1][n+1];
    int visited[]=new int[n+1];
    int d[]=new int[n+1];
    TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
    System.out.println("enter cost adajency matrix for graph,if 2 nodes are not connected enter 999");
    for(i=1;i<n+1;i++)
    {
    for(j=1;j<n+1;j++)
    graph[i][j]=s.nextInt();
    }
    for(i=1;i<n+1;i++)
    {
    visited[i]=0;
    d[i]=999;
    }
    System.out.println("enter the source vertsx");
    int source=s.nextInt();
    visited[source]=1;
    d[source]=0;
    int u=source;
    int v;
    do
    {
    for(v=1;v<n+1;v++)
    {
    if(graph[u][v]!=999 && visited[v]!=1 && graph[u][v]!=0)
    {
    d[v]=min(d[v],(d[u]+graph[u][v]));
    map.put(d[v],v);
    }
    }
    u=map.firstEntry().getValue();
    visited[u]=1;
    map.clear();;
    }
    while(check(visited,n));
    for(i=1;i<n+1;i++)
    System.out.println("distance from source to "+i+" is"+d[i]);
    }
}
