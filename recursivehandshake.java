import java.util.*;
public class recursivehandshake
{
	public static void main(String[] args)
   	{
   	int num;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the number of people in the room number: ");
	num=in.nextInt();
 	while(num<1)
    {
    	System.out.println("Must be at least 1 person in the room");
        System.out.print("Enter the number of people in the room number: ");
        num=in.nextInt();
    }
   	System.out.println("There will be "+hands(num)+" handshakes");
}
public static int hands(int n)
{
	if(n<3)
    return n-1;
else
     return (n-1+hands(n-1));

}
}