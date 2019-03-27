package lista1;
import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in); 
			System.out.println("Enter first number: ");
			double number1 = s.nextDouble();
			System.out.println("Enter operation (\"+\",\"-\",\"*\",\"/\") :");
			char operation = s.next().charAt(0);
			System.out.println("Enter second number: ");
			double number2 = s.nextDouble();
			double result = 0;
			Calculadora calculadora = new Calculadora();
			switch (operation){
				case '+':
					result = calculadora.somar(number1,number2);
					System.out.println("The result is: " + result);
					break;
				case '-':
					result = calculadora.subtrair(number1,number2);
					System.out.println("The result is: " + result);
					break;
				case '*':
					result = calculadora.multiplicar(number1,number2);
					System.out.println("The result is: " + result);
					break;
				case '/':
					result = calculadora.dividir(number1,number2);
					System.out.println("The result is: " + result);
					break;
				default:
					System.out.println("Invalid operation");
			}
			s.close();
	}
	
	public static class Calculadora {
		public double somar(double number1, double number2) {
			return number1 + number2;
		}	
		
		public  double subtrair(double number1, double number2) {
			return number1 - number2;
		}
		
		public  double multiplicar(double number1, double number2) {
			return number1*number2;
		}
		
		public  double dividir(double number1, double number2) {
			return number1/number2;
		}
	}

}