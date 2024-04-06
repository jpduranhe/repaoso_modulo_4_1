package repaso_modulo_4_1;

public class EjerciciosIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edadMinima=18;
		int miEdad=39;
		
		if(miEdad>edadMinima){
		//	System.out.println("MAyor de Edad");
		}else {
		//	System.out.println("Menor de Edad");
		}
		String nombreIngresado="Thor";
		String nombrePermitido="Thor";
		String clave="beachBoys";
		String clave2="beachBoys";
		
		if(nombrePermitido.equals(nombreIngresado)) {
			if(clave.equals(clave2)) {
		//		System.out.println("entras");
			}else {
		//		System.out.println("NOp");
			}
		}
		
		int diaSemana=1;
		switch(diaSemana) {
		case 1: 
			System.out.println("lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		default:
			System.out.println("Numero fuera de rango");			
		}
		
		int numeroDias=2;
		switch(numeroDias) {
		case 11: 			
		case 4: 
			System.out.println("30 dias");
			break;
			
		case 3: 
		case 12: 
			System.out.println("31 dias");
			break;
			
		case 2: 
			System.out.println("28 dias");
			break;	
			
		default:
			System.out.println("Numero fuera de rango");			
		}
	}

}
