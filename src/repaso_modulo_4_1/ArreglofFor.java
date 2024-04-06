package repaso_modulo_4_1;

public class ArreglofFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arregloNombre= new String[3];
		arregloNombre[0]="Isaura";
		arregloNombre[1]="Loreto";
		arregloNombre[2]="Gaston";
		//System.out.println(arregloNombre[0]);
		//System.out.println(arregloNombre[1]);
		
		for(int n=0; n< arregloNombre.length; n++) {
			//System.out.println(i);
			System.out.println(arregloNombre[n]);	
		}
		System.out.println("------foreach ---------");
		for(String nombre : arregloNombre) {
			System.out.println(nombre);
		}
		
	}

}
