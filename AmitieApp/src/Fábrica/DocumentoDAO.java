package Fábrica;

public class DocumentoDAO extends Documento implements ObjectDAO {

	@Override
	public void insert() {
		//Cód de inserção de Documento.
		System.out.printf("Insert Documento Cod: %d Descrição: %s \n",this.getId(),this.getDoc());
	}

	@Override 
	public void update() {
		// Código de update de Documento
		System.out.printf("Update Documento Cod: %d Descrição: %s \n",this.getId(),this.getDoc());
	}

	@Override
	public void delete() {
		// Código de delete de Documento
		System.out.printf("Delete Documento Cod: %d Descrição: %s \n",this.getId(),this.getDoc());
	}

}
