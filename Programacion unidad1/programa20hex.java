//Nombre: Fernando Cisneros
//Time: 10:50
//Date: 18/02/19
		
	import java.util.Scanner;

	public class programa20hex{ 				
		public static void main (String [ ] args){			

		Scanner num=new Scanner(System.in); 
		int x;     

		System.out.println("Capture un numero decimal: "); 
		x=num.nextInt();  

		String num1=Integer.toHexString(x);		

	System.out.println("El numero Hexadecimal es: " + num1); 
}
}