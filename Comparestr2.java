import java.util.Scanner;
public class Comparestr2 {

	public static void main(String[] args) {
		String s1,s2;
Scanner c=new Scanner(System.in);
s1=c.next();
s2=c.next();
if(s1.length()==s2.length())
{
	System.out.println(s1);
}
else if(s1.length()>=s2.length())
{
	System.out.println(s1);
}
else
{
	System.out.println(s2);
}
	}

}
