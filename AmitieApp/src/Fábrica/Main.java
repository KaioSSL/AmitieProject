package Fábrica;

public class Main {
	public static void main(String[] args) {
		
		//Instâncio a fábrica dos DAOs
		ObjectDAO ob = FabricaDAO.geraDAO("documento");
		//Chamo a função do dao que eu instânciei e retornei pela fábcria.
		ob.insert();
		//Segundo teste
		ObjectDAO ob2 = FabricaDAO.geraDAO("contato");
		//Chamo a função do dao que eu instânciei e retornei pela fábcria.
		ob2.delete();
	}
}
