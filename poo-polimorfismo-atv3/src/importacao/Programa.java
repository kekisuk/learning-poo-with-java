package importacao;

public class Programa {

	public static void main(String[] args) {
		
		ProdutoImportado prodImp = new ProdutoImportado();
		prodImp.setNome("iPhone");
		prodImp.setPreco(5000.00);
		prodImp.calculaFrete();
		System.out.println(prodImp.toString());
		
		System.out.println();
		
		ProdutoNacional prodNac = new ProdutoNacional();
		prodNac.setNome("Moto G");
		prodNac.setPreco(1000.00);
		prodNac.calculaFrete();
		System.out.println(prodNac.toString());
	}

}
