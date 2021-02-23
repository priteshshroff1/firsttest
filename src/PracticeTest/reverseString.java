package PracticeTest;

public class reverseString {

	
	public void reversestring(String input)
	{
		String inputStr=input;
		int J=0;
		
		int length= inputStr.length();
		
		char[] charArray = new char[length];
		for (int i=length-1;i>=0;i-- )
		{
			char StrChar= inputStr.charAt(i);
		    charArray [J]= StrChar;
		    System.out.print(StrChar);
		}
		//return input;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseString a1 = new reverseString ();
		a1.reversestring("abc");
		
	}

}
