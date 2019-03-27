package lista1;

public class Problem3 {

	public static void main(String[] args) {
		Medidas medida1 = new Medidas("mi",100,"lb",100,"C",100);
		Medidas medida2 = new Medidas("km",5,"kg",5,"F",5);
		ConversorDeMedidas conversorDeMedidas = new ConversorDeMedidas();
		System.out.println(conversorDeMedidas.converterMassa(medida1, medida2));
		System.out.println(conversorDeMedidas.converterDistancia(medida1, medida2));
		System.out.println(conversorDeMedidas.converterTemperatura(medida1,medida2));
	}
	
	public static class Medidas {
		
		private String unidadeDeDistancia;
		private double distancia;
		private String unidadeDeMassa;
		private double massa;
		private String unidadeDeTemperatura;
		private int temperatura;
		
		public String getUnidadeDeDistancia() {
			return unidadeDeDistancia;
		}
		
		public void setUnidadeDeDistancia(String unidadeDeDistancia) {
			this.unidadeDeDistancia = unidadeDeDistancia;
		}
		
		public double getDistancia() {
			return distancia;
		}
		
		public void setDistancia(double distancia) {
			this.distancia = distancia;
		}
		
		public String getUnidadeDeMassa() {
			return unidadeDeMassa;
		}
		
		public void setUnidadeDeMassa(String unidadeDeMassa) {
			this.unidadeDeMassa = unidadeDeMassa;
		}
		
		public double getMassa() {
			return massa;
		}
		
		public void setMassa(double massa) {
			this.massa = massa;
		}
		
		public String getUnidadeDeTemperatura() {
			return unidadeDeTemperatura;
		}
		
		public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
			this.unidadeDeTemperatura = unidadeDeTemperatura;
		}
		
		public int getTemperatura() {
			return temperatura;
		}
		
		public void setTemperatura(int temperatura) {
			this.temperatura = temperatura;
		}
		
		Medidas(){
		}
		
		Medidas(String unidadeDeDistancia, double distancia, String unidadeDeMassa, double massa, String unidadeDeTemperatura ,int temperatura){
			this.setUnidadeDeDistancia(unidadeDeDistancia);
			this.setDistancia(distancia);
			this.setUnidadeDeMassa(unidadeDeMassa);
			this.setMassa(massa);
			this.setUnidadeDeTemperatura(unidadeDeTemperatura);
			this.setTemperatura(temperatura);
		}
		
	}
	
	public static class ConversorDeMedidas {
		
		public String converterMassa(Medidas medida1, Medidas medida2) {
			double result = 0;
			
			if (medida1.getUnidadeDeMassa() == medida2.getUnidadeDeMassa()) {
				return "Convertion was not possible : both measurement units are the same";
			}
			
			switch (medida2.getUnidadeDeMassa()){
				case "lb":
					result = medida1.getMassa() * 2.2046;  
					break;
				case "kg":
					result = medida1.getMassa() / 2.2046;
					break;
				default:
					return "Convertion was not possible : invalid measurement unit";
			}
			
			return result + medida2.getUnidadeDeMassa();
		}
		
		public String converterDistancia(Medidas medida1, Medidas medida2) {
			double result = 0;
			if (medida1.getUnidadeDeDistancia() == medida2.getUnidadeDeDistancia()) {
				return "Convertion was not possible : both measurement units are the same";
			}
			
			switch (medida2.getUnidadeDeDistancia()){
			case "mi":
				result = medida1.getDistancia() / 1.609;  
				break;
			case "km":
				result = medida1.getDistancia() * 1.609;
				break;
			default:
				return "Convertion was not possible : invalid measurement unit";
			}
			
			return result + medida2.getUnidadeDeDistancia();
		}
		
		public String converterTemperatura(Medidas medida1, Medidas medida2) {
			double result = 0;
			
			if (medida1.getUnidadeDeTemperatura() == medida2.getUnidadeDeTemperatura()) {
				return "Convertion was not possible : both measurement units are the same";
			}
			
			switch (medida2.getUnidadeDeTemperatura()){
			case "C":
				result = ( medida1.getTemperatura() - 32 ) * 1.609;  
				break;
			case "F":
				result = medida1.getTemperatura() * 1.8 + 32;
				break;
			default:
				return "Convertion was not possible : invalid measurement unit";
			}
			
			return result + medida2.getUnidadeDeTemperatura();	
		}
	}
}
