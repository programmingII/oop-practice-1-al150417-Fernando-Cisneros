// Fernando Joel Cisneros 
// Time   12:25
// Date   14/02/19

import java.util.Scanner; //importamos una libreria para escanear numeros

	class programa12grande{
	 
		public static void main(String[] args){     		//Empezamos el programa

		   Scanner in = new Scanner(System.in);
			System.out.println("Dame el primer numero");
			int num1 = in.nextInt();
			
			System.out.println("Dame el segundo numero");
			int num2 = in.nextInt();

			System.out.println("Dame el tercer numero");
			int num3 = in.nextInt();
		
			System.out.println("Dame el cuarto numero");
			int num4 = in.nextInt();

			System.out.println("Dame el quinto numero");
			int num5 = in.nextInt();
			
			System.out.println("El promedio es:" + (num1+num2+num3+num4+num5)/5); //Aqui terminamos el programa imprimiendo un resultado
}
}