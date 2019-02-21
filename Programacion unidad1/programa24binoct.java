//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 13:06
	import java.util.Scanner; 

	public class programa24binoct{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x,y;
		int z;

		System.out.println("Ingrese el numero binario: ");
		x = num.nextLine(); 
		z = Integer.parseInt(x,2);
		y = Integer.toOctalString(z);

System.out.println("El numero decimal es: " + y); 
}
}