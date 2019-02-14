// Fernando Joel Cisneros 
// Time   13:02
// Date   14/02/19



	class programa15cambio{
	 
		public static void main(String[] args){     		//Empezamos el programa
			int x, y, z;
			x = 15;
			y = 20;

			  System.out.println("Valores antes del cambio:" + x + "," + y); 
				z = x;
				x = y;
				y = z;
			  System.out.println("Valores despues del intercambio:" + x + "," + y);
}
}