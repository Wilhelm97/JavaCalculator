package application;

public class Modal {
	public double Calculate(double number1, double number2, String operator) {
			System.out.println("Running switch");
		switch (operator) {
			
			case "+":
				return number1 + number2;
			case "-":
				return number1 - number2;
			case "*":
				return number1 * number2;
//			case "%":
//				return number1 % number2;
			case "/":
				if(number2 == 0)
					return 0;
				else
					return number1 / number2;
//			case ".":
//				return number1 . number2;
				default: return 0;
		
			}
		
	}
}
