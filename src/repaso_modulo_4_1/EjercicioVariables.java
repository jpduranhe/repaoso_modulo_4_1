package repaso_modulo_4_1;

public class EjercicioVariables {
	
	
	
	
	
	
	public static void main(String[] args) {
		 
		String variableUno = "Holaaa";
		char caracter='h';
		
		boolean variableBooleana=true;
		
		byte variableByte=1;
		short  variableShort=1; //-32.768, 32.767.
		int  variableEntero = 10;
		long variableLong=10; // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
		
		float variableFloat=100.65f;
		double variableDouble=100.0;
		
		
		double num1=17, num2=12,num3=45 ,num4=1,num5=10;
		/*
		int num1=69;
		int num2=58;
		int num3=45;
		*/
		
		/*
		num3= num2+num1; 
		System.out.println(num3);
		
		num3= num2-num1; 
		System.out.println(num3);
		
		num3= num2*num1; 
		System.out.println(num3);
		
		num3= num2/num1; 
		System.out.println(num3);
		*/
		//num4=num4+1;
		System.out.println(num4);
		System.out.println(num4++);
		System.out.println(num4);
		
		//System.out.println(++num4);
		//num4=num4-1;
		//System.out.println(num5--);
		boolean evaluacion =  num2==num2 && num4==num3;
		System.out.println(evaluacion);
		
	
		boolean evaluacion2 = num4==num3 || num2==num2;
		System.out.println(evaluacion2);
		
		
		boolean evaluacion3 = !(num4==num3) ;
		System.out.println(evaluacion3);
		
	}	

}
