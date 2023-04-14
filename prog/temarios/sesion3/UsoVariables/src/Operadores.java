
public class Operadores {

	public static void main(String[] args) {
		
		/*operadores
		+ suma y concatenación
		- resta
		* multiplicación
		/ división
		% modulo (resto de la division entera)*/
				
		//Zona declarativa + Inicialización
		int numero1=1234;
		int numero2=3;
		int suma, resta, multiplicacion, division, modulo;
		
		//Zona ejecutiva(resolver el problema)
		System.out.println("----Ejemplos de operadores básicos----\n");
		System.out.println("Ejemplo de suma:");
		suma=numero1+numero2;
		System.out.println("La 'suma' de 'num1 & num2 es: "+suma+"\n");
		
		System.out.println("Ejemplo de resta:");
		resta=numero1-numero2;
		System.out.println("La 'resta' de 'num1 & num2 es: "+resta+"\n");
		
		System.out.println("Ejemplo de multiplicación:");
		multiplicacion=numero1*numero2;
		System.out.println("La 'multiplicación' de 'num1 & num2 es: "+multiplicacion+"\n");
		
		System.out.println("Ejemplo de división:");
		division=numero1/numero2;
		System.out.println("La 'división' de 'num1 & num2 es: "+division+"\n");
		
		System.out.println("Ejemplo de modulo:");
		modulo=numero1%numero2;
		System.out.println("El 'modulo' de 'num1 & num2 es: "+modulo+"\n");
	}

}
