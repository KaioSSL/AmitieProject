package F�brica;

public class ContatoDAO extends Contato implements ObjectDAO 
{

	@Override
	public void insert() {
		//C�d de inser��o de Contato.
		System.out.printf("Insert Contato Cod: %d Tipo: %d Contato: %s \n",this.getId(),this.getTipo(),this.getContato());
	}

	@Override
	public void update() {
		// C�digo de update de Contato
		System.out.printf("Update Contato Cod: %d Tipo: %d Contato: %s \n",this.getId(),this.getTipo(),this.getContato());
	}

	@Override
	public void delete() {
		// C�digo de delete de Contato
		System.out.printf("Delete Contato Cod: %d Tipo: %d Contato: %s \n",this.getId(),this.getTipo(),this.getContato());
	}

}
