import java.util.*;

class Newstack
{
    int s[]=new int[20];
    int top;
    int size;
    Newstack()
    {
        top=-1;
        size=4;
    }
    void push(int item)
    {
        if(top==size-1)
        System.out.println("Stack overflow");
        else
        {
            s[++top]=item;
        } 
    }
    void pop()
    {
        if(top==-1)
        System.out.println("Stack underflow");
        else
        {
            System.out.println("Item Delted :"+s[top--]);
        }
        
    }
    void display()
    {
        
        if(top==-1)
        System.out.println("Stack underflow");
        else{System.out.println("Stack Details: ");
        for(int i=top;i>=0;i--)
        {
            System.out.println(" "+s[i]);
        }
    }
}
}
public class stack 
{

    public static void main(String []args)
    {
        
        Newstack st=new Newstack();
        Scanner read=new Scanner(System.in);
   
        for(;;)
        {
           
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.Exit");
            int ch;
            System.out.println("Enter your choice: ");
            ch=read.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the item: ");
                int num=read.nextInt();
                st.push(num);
                break;
                case 2:System.out.println("Deletion: ");
                st.pop();
                break;            
                case 3:st.display();
                break;
                case 4:System.exit(0);
                 default: System.out.println("wrong choice!!");
                // return;
            }
        }
        
    }
}
