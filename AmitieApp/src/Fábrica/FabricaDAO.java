package Fábrica;

public class FabricaDAO {
	public static ObjectDAO geraDAO(String txt) {
		ObjectDAO ob = null;
		if(txt.equalsIgnoreCase("documento")) {
			ob = new DocumentoDAO();
		}else if(txt.equalsIgnoreCase("contato")) {
			ob = new ContatoDAO();
		}
		return ob;
	}
}
