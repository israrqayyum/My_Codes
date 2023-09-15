class error2
{
public static void main(String arg[])
{
	int a=10;
	 int b=5;
	 int c=5;
	 int x,y; 
	 x = 0;
	try
  { 
	 x=a/(b-c);
  }
 catch (RuntimeException e)
 {
	System.out.println("___Division by Zero___");
 }
  y=a/(b);
  System.out.println("y = " + y);
}
}
