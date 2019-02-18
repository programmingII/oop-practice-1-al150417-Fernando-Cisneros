//Name: Fernando Cisneros
//Time: 11:07
//Date: 18/02/19
	import java.util.Scanner; 

	public class programa21hoct{ 				
	public static void main (String [ ] args){			
		Scanner num=new Scanner(System.in); 
			int x;

	System.out.println("Introdusca un numero decimal(Entero): "); 
	x=num.nextInt();  

		String hoct1=Integer.toOctalString(x);		

		System.out.println("El numero Octal es: " + hoct1); 
}
}