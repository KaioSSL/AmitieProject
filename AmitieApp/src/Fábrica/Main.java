package F�brica;

public class Main {
	public static void main(String[] args) {
		
		//Inst�ncio a f�brica dos DAOs
		ObjectDAO ob = FabricaDAO.geraDAO("documento");
		//Chamo a fun��o do dao que eu inst�nciei e retornei pela f�bcria.
		ob.insert();
		//Segundo teste
		ObjectDAO ob2 = FabricaDAO.geraDAO("contato");
		//Chamo a fun��o do dao que eu inst�nciei e retornei pela f�bcria.
		ob2.delete();
	}
}
