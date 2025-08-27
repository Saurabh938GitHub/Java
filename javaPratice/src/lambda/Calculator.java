package lambda;

public class Calculator {

	public static void main(String[] args) {
		int x= 20;
		int y= 10;
		
		MathOperation add= (a,b) -> (a+b);
		MathOperation sub= (a,b) -> (a-b);
		MathOperation multiply= (a,b) -> (a*b);
		MathOperation division= (a,b) -> (a/b);
		
		System.out.println(add.operate(x, y));
		System.out.println(sub.operate(x, y));
		System.out.println(multiply.operate(x, y));
		System.out.println(division.operate(x, y));

	}

}
