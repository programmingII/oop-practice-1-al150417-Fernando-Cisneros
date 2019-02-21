//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 13:24
	import java.util.Scanner; 

	public class programa27octhex{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x,y;
		int z;
	

		System.out.println("Ingrese el numero octal: ");
		x = num.nextLine(); 
		z = Integer.parseInt(x,8);
		y = Integer.toHexString(z);
		

System.out.println("El numero decimal es: " + y); 
}
}