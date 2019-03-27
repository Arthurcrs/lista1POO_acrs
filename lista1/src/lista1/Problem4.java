package lista1;
import java.lang.Math.*;
import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the highest value: ");
		int maiorValor = s.nextInt();
		Estatistica estatistica = new Estatistica(maiorValor);
		System.out.println(estatistica.sumOfValues());
		System.out.println(estatistica.avg());
		System.out.println(estatistica.standardDeviation());
		estatistica.printFromZeroToHighest();
		s.close();
	}
	
	public static class Estatistica {
		
		private int maiorValor;

		public void setMaiorValor(int maiorValor) {
			this.maiorValor = maiorValor;
		}

		Estatistica(int maiorValor){
			this.setMaiorValor(maiorValor);
		}
		
		
		public double sumOfValues(){
			int sum = 0; //do-while loop is here
			int i = 0;
			do {
				sum = sum + i;
				i++; 
			} while(i <= this.maiorValor);
			return sum;
		}
		
		public double avg() {			
			return this.sumOfValues()/( this.maiorValor + 1 );
		}
		
		public double standardDeviation() {
			double squareSd;
			double sum = 0;
			int i = 0;
			while(i <= this.maiorValor) { //while loop here
				sum = sum + Math.pow(i - this.avg(),2) ;
				i++;
			}
			squareSd = sum/this.maiorValor;
			
			return Math.sqrt(squareSd);
		}
		
		public void printFromZeroToHighest() {
			for(int i = 0; i <= this.maiorValor; i++) { //for loop here
				System.out.print(i);
				if (i%2 == 0) {
					System.out.println(" é par");
				}else {
					System.out.println(" é impar");
				}
			}
		}
	}
}
