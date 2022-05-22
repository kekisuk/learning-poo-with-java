package Garrafa;

public class Programa {

	public static void main(String[] args) {
		Garrafa garrafa1 = new Garrafa();
		System.out.println("Garrafa 1");
		garrafa1.mostrarconteudo();
		
		System.out.println();
		
		Garrafa garrafa2 = new Garrafa(2);
		System.out.println("Garrafa 2");
		garrafa2.mostrarconteudo();
		
		System.out.println();
		
		Garrafa garrafa3 = new Garrafa("Plastico");
		System.out.println("Garrafa 3");
		garrafa3.mostrarconteudo();
		
		System.out.println();
		
		Garrafa garrafa4 = new Garrafa("Vidro", 1);
		System.out.println("Garrafa 4");
		garrafa4.mostrarconteudo();
		
		
	}

}
