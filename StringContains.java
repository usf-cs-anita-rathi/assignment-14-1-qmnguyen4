public class StringContains
{
	public static boolean contains(String haystack, String needle)
	{

		if(haystack.length() < needle.length())
		{
			return false;
		}
		else
		{
			boolean containsFlag=false;
			for(int x = 0; x < needle.length(); x++)
			{
				if(haystack.charAt(x) != needle.charAt(x))
				if((x + 1) == needle.length())
				{
					containsFlag = false;
					break;
				}
				else
					break;
				else
				if((x + 1) == needle.length())
				{
					containsFlag = true;
					break;
				}
				else
					continue;
				}
			char[] charStack = new char[(haystack.length()-1)];
//conver stack to char array
			for(int y = 1; y < charStack .length; y++)
			{
				charStack[y - 1] = haystack.charAt(y);
			}

			String newHaystack = new String(charStack);//convert char array to string

			if(containsFlag == false)
				return contains(newHaystack, needle);//call recursivly
			else
				return true;
			}
			}
public static void main(String args[])
{
	System.out.println("Java Programming contains ogr is "+contains("Java programming", "ogr"));
	System.out.println("Java Programming contains grammy is "+contains("Java programming", "grammy"));
	System.out.println("Java Programming contains mmings is "+contains("Java programming", "mmings"));
}
  
}