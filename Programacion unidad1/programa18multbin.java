//Fernando Cisneros
//Time: 10:20
//Date: 18/02/19


		import java.util.Scanner; 

		public class programa18multbin{ 
  		  public static void main (String [ ] args){

	Scanner in=new Scanner(System.in); 

		System.out.println("Deme un numero binario: "); 
			String number1=in.nextLine(); 

		System.out.println("Deme otro numero binario: "); 
			String number2=in.nextLine(); 
	
				int binario1=Integer.parseInt(number1,2); 
				int binario2=Integer.parseInt(number2,2);
		
			int result=(binario1*binario2);

		String resultado=Integer.toString(result,2);
			System.out.println("El resultado es:" + resultado); 
}
}