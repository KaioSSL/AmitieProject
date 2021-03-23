package Fábrica;

public class ContatoDAO extends Contato implements ObjectDAO 
{

	@Override
	public void insert() {
		//Cód de inserção de Contato.
		System.out.printf("Insert Contato Cod: %d Tipo: %d Contato: %s \n",this.getId(),this.getTipo(),this.getContato());
	}

	@Override
	public void update() {
		// Código de update de Contato
		System.out.printf("Update Contato Cod: %d Tipo: %d Contato: %s \n",this.getId(),this.getTipo(),this.getContato());
	}

	@Override
	public void delete() {
		// Código de delete de Contato
		System.out.printf("Delete Contato Cod: %d Tipo: %d Contato: %s \n",this.getId(),this.getTipo(),this.getContato());
	}

}
