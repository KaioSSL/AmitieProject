package F�brica;

public class DocumentoDAO extends Documento implements ObjectDAO {

	@Override
	public void insert() {
		//C�d de inser��o de Documento.
		System.out.printf("Insert Documento Cod: %d Descri��o: %s \n",this.getId(),this.getDoc());
	}

	@Override 
	public void update() {
		// C�digo de update de Documento
		System.out.printf("Update Documento Cod: %d Descri��o: %s \n",this.getId(),this.getDoc());
	}

	@Override
	public void delete() {
		// C�digo de delete de Documento
		System.out.printf("Delete Documento Cod: %d Descri��o: %s \n",this.getId(),this.getDoc());
	}

}
