//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 13:30
	import java.util.Scanner; 

	public class programa30hexoct{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x,y;
		int z;
	

		System.out.println("Ingrese el numero hexadecimal: ");
		x = num.nextLine(); 
		z = Integer.parseInt(x,16);
		y = Integer.toOctalString(z);

System.out.println("El numero decimal es: " + y); 
}
}