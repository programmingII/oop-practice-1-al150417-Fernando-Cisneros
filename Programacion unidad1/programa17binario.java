//Nombre:Fernando Cisneros 
//Time: 18/02/2019
//Date: 10:02
	import java.util.Scanner;
		class programa17binarios{
		public static void main(String[]args){
		String x,y;
		Scanner num = new Scanner(System.in);
			System.out.println("Dame El primer numero binario");
			x = num.nextLine();
			System.out.println("Dame el segundo numero binario");
			y = num.nextLine();
			System.out.println("El resultado es: "+(Integer.toBinaryString(Integer.parseInt(x,2)+Integer.parseInt(y,2))));

}
}
