//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 12:43
	import java.util.Scanner; 

	public class programa22binoct{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x;

		System.out.println("Ingrese el numero binario: ");
		x = num.nextLine(); 

System.out.println("El numero decimal es: " + Integer.parseInt(x,2)); 
}
}