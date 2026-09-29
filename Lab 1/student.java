import java.util.*;
class student1{
	String name;
	int usn;
public void accept(){
	Scanner sc=new Scanner(System.in);
	usn=sc.nextInt();
	name=sc.next();
}
public void display(){
	System.out.println("USN:"+usn);
	System.out.println("Name:"+name);
}
}
public class student
{
	public static void main(String[] args){
		student1 s1=new student1();
		student1 s2=new student1();
		s1.accept();
		s1.display();
		s2.accept();
		s2.display();
	}
}
