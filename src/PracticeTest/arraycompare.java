package PracticeTest;

import java.util.Arrays;
import java.util.Comparator;

public class arraycompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  [] [] s1= {{"java", "abc", "xyz"}, {"a1", "a2", "a3"} };
		
		String  [] [] s2= {{"abc", "java", "xyz"}, {"a1", "a2", "a3"} };
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		

   
	Arrays.sort (s1, new Comparator<double[]>() {      
        @Override
        public int compare(double[] s1, double[] s2) {
            return Double.compare(s1[1], s2[1]);
        }
    });
		
		System.out.println (Arrays.deepEquals(s1, s2));
	}
	
	}


