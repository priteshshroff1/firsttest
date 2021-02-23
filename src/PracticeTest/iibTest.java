package PracticeTest;

public class iibTest {

	//int i;
	

		int i=10;
        int b=11;
		int c=12;


		//System.out.println("I am in IIB");
	
	
	
	iibTest(int j)
	{
		//this();
		//System.out.println("I am in D"+i);
		i=j;
		System.out.println(i);
	}
	
	iibTest()
	{
		System.out.println("I am in Default"+i);
	}
}

class MainClass1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		iibTest a1= new iibTest(20);
		
	}

}
