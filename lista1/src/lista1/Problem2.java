package lista1;
import java.util.*;

public class Problem2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int int1 = s.nextInt();
		System.out.println("Enter second value: ");
		int int2 = s.nextInt();
		System.out.println("Enter third value: ");
		int int3 = s.nextInt();
		Comparador comparador = new Comparador(int1,int2,int3);
		System.out.println("The highest value is: " + comparador.getMaior());
		s.close();
	}
	
	public static class Comparador {
		private int int1;
		private int int2;
		private int int3;
		
		public int getInt1() {
			return int1;
		}
		
		public int getInt2() {
			return int2;
		}
		
		public int getInt3() {
			return int3;
		}
		
		public void setInt1(int int1) {
			this.int1 = int1;
		}
		
		public void setInt2(int int2) {
			this.int2 = int2;
		}
		
		public void setInt3(int int3) {
			this.int3 = int3;
		}
		
		Comparador(int int1,int int2, int int3){
			setInt1(int1);
			setInt2(int2);
			setInt3(int3);
		}
		
		public int getMaior() {
			if ((this.int1 > this.int2) && (this.int1 > this.int3)){
				return int1;
			}
			if ((this.int2 > this.int3) && (this.int2 > this.int1)) {
				return int2;
			} 
			return int3;
		}
	}
}
