// Fernando Joel Cisneros 
// Time   13:02
// Date   12/02/19

import java.util.Scanner;

	class programa6escaner2{
	 
		public static void main(String[] args){

		   Scanner in = new Scanner(System.in);
			System.out.println("Dame el primer numero a multiplicar");
			int num1 = in.nextInt();
			
			System.out.println("Dame el segundo numero a multiplicar");
			int num2 = in.nextInt();

			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			System.out.println(num1 + "*" + num2 + "=" + num1*num2);
			System.out.println(num1 + "/" + num2 + "=" + num1/num2);
			System.out.println(num1 + "mod" + num2 + "=" + num1%num2);

}
}


