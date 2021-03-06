package ictgradschool.industry.introtojava.sortnumbers;

/**
 * Programming for Industry - Introduction to Java
 * Sorting Numbers
 * 
 * Note: Put your answers in between the "// Answer here //" comments. Do not modify other parts of the class.
 */
public class SortNumbers {
	
	/**
	 * Sorting numbers in order.
	 */
	public void sortNumberByAscending(int number1, int number2, int number3, int number4) {
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		// Answer here
		first = number1;
		second = number2;
		third = number3;
		fourth = number4;
		//
		System.out.println("The numbers are: " + first + ", " + second + ", " + third + ", " + fourth);
	}

	/**
	 * Don't edit this - but read/use this for testing if you like.
	 */
	public static void main(String[] args) {
		SortNumbers cr = new SortNumbers();
		
		cr.sortNumberByAscending(35, -4, 7, 6); // The numbers are: -4, 6, 7, 35
		cr.sortNumberByAscending(-1, 0, 18, -10); // The numbers are: -10, -1, 0, 18
		cr.sortNumberByAscending(1, 2, 3, 4); // The numbers are: 1, 2, 3, 4
	}

}
