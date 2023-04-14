
public class DatosPrimitivos {

	public static void main(String[] args) {
		
		//ENTEROS ENTEROS
		 byte numeroByte=100;
		 short numeroShort=20000;
		 int numeroInt=100000;
		 long numeroLong=1000000;
		 
		 System.out.println("Números enteros:");
		 System.out.println("El número byte es: "+numeroByte);
		 System.out.println("El número short es: "+numeroShort);
		 System.out.println("El número int es: "+numeroInt);
		 System.out.println("El número long es: "+numeroLong+"\n");
		 
		//DECIMALES
		 float numeroFloat=1.5f;
		 double numeroDouble=1002.45666;
		 
		 System.out.println("Números decimales:");
		 System.out.println("El número float es: "+numeroFloat);
		 System.out.println("El número double es: "+numeroDouble+"\n");
		//CARACTERES
		 char letra='F';
		 String palabra="Hola mundo";
		
		 System.out.println("Caracteres:");
		 System.out.println("'char' es un tipo de dato primitivo que representa un solo carácter en Unicode. Los valores char se escriben entre comillas simples (' '), y solo pueden contener un carácter a la vez. Ejemplo: char letra="+letra+";");
		 System.out.println("'String' se escriben entre comillas dobles (\" \"), y pueden contener uno o más caracteres. Ejemplo: palabra="+palabra+";");
		//BOOLEANO
		 boolean valorTrue=true;
		 boolean valorFalse=false;
		 
		 System.out.println("Booleano:");
		 System.out.println("El valor de True es:"+valorTrue);
		 System.out.println("El valor de False es:"+valorFalse);
	}
}
