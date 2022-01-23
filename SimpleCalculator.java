import java.util.*;
public class SimpleCalculator{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number");
		Double num1 = Double.parseDouble(scan.next());
		System.out.println("enter 2nd number");
		Double num2 = Double.parseDouble(scan.next());
		Double result = num1 + num2;
		System.out.println("sum of "+ num1 + " and " + num2 +" is = " + result);
	}
}