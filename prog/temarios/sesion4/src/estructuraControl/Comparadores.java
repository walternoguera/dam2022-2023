package estructuraControl;

public class Comparadores {

	public static void main(String[] args) {
		/*
		 Comparadores:
		 == comprobacion
		 >
		 <
		 >=
		 <=
		 != distinto de 
		 */
		//zona declarativa
		int operando1=31;
		int operando2=300;
		int operando3=400;
		
		//zona ejecutiva
		/*System.out.println(operando1==operando2);
		System.out.println(operando1>operando2);
		System.out.println(operando1<operando2);
		System.out.println(operando1>=operando2);
		System.out.println(operando1<=operando2);
		System.out.println(operando1!=operando2);*/
		
		//numero mayor o iguales
		
		if(operando1>operando2) {
			System.out.println("El mayor es: "+operando1);
		}else{
			if(operando1==operando2) {
				System.out.println("Son iguales");
			}else{
				System.out.println("El mayor es: "+operando2);
			}
		}
		//si son distintos
		if(operando1!=operando2) {
			System.out.println("son distintos");
		}
		
		//tenemos 3 numeros, ver el mayor, comparamos 1 y 2, el mayor con el 3
		if(operando1>operando2) {
			System.out.println("El mayor es: "+operando1);
		}else {
			if(operando1>operando3) {
				System.out.println("El mayor es: "+operando1);
			}else {
				System.out.println("es menor");
			}
		}
	}
}
