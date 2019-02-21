//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 13:26
	import java.util.Scanner; 

	public class programa28hexdec{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x;
		int z;
	

		System.out.println("Ingrese el numero hexadecimal: ");
		x = num.nextLine(); 
		z = Integer.parseInt(x,16);
		
		

System.out.println("El numero decimal es: " + z); 
}
}