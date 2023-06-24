import java.util.*;
class STUDENT
{
String usn;
String name;
String branch;
long phno;
public void getdata()
{
 Scanner read=new Scanner(System.in);
 System.out. println("Enter USN,Name,Branch,PhNo");
 usn=read.next();
 name=read.next();
 branch=read.next();
 phno=read.nextLong();
}
public void display()
{
System.out. println("***************");
System.out .println("Student USN="+usn);
System.out .println("Student Name="+name);
System.out. println("Student Branch="+branch);
System.out .println("Student PhNo="+phno);
}
}

public class PROGRAMA1 {
    public static void main(String args[])
 {
 int n;
 Scanner read=new Scanner(System.in);
 System.out. println("Enter no of students");
 n=read.nextInt();
 STUDENT s[]= new STUDENT[n];
 System.out.println("Enter the student deails");
 for(int i=0;i<n;i++)
 {
 s[i]=new STUDENT();
 s[i].getdata();
 }
 System.out.println(".....Student Details.....");
 for(int i=0;i<n;i++)
 {
 s[i].display();
 System.out.println();
 }
 }
}
