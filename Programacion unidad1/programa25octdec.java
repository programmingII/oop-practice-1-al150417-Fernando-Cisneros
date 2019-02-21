//Name: Fernando Cisneros
//Date: 21/02/19
//Hour: 13:06
	import java.util.Scanner; 

	public class programa25octdec{ 				
		public static void main (String [] args){			

		Scanner num=new Scanner(System.in);
		String x;
		int z;
	

		System.out.println("Ingrese el numero octal: ");
		x = num.nextLine(); 
		z = Integer.parseInt(x,8);
		

System.out.println("El numero decimal es: " + z); 
}
}