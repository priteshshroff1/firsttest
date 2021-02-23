package PracticeTest;

public class Test1Constructor {

	
	     private Test1Constructor()
	     {
	          // Private Constructor
	     }
	 
	     void methodOne()
	     {
	          //You can use private constructor inside the class
	    	 Test1Constructor a1 = new Test1Constructor();
	     }
	}
	 
	class MainClass
	{
	     public static void main(String[] args)
	     {
	          //You can't use private constructor ouside the class like this
	          //Test1Constructor a1 = new Test1Constructor();
	     }
	}

