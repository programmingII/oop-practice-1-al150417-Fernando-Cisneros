//Nombre:Fernando Cisneros
//Time:10:30
//Date:18/02/19

		import java.util.Scanner;

	public class programa19entbin{
		public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("Dame el numero decimal a transformar:");
		int x = in.nextInt();

		String convierte1 = Integer.toString(x,2);

		System.out.println("Numero binario: "+ convierte1);

}
}
