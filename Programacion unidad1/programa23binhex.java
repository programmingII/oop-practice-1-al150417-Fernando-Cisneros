//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 12:53
	import java.util.Scanner; 

	public class programa23binhex{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x,y;
		int z;

		System.out.println("Ingrese el numero binario: ");
		x = num.nextLine(); 
		z = Integer.parseInt(x,2);
		y = Integer.toHexString(z);

System.out.println("El numero decimal es: " + y); 
}
}