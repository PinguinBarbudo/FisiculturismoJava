package fisiculturismo.secao28.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao {
	//Método para serializar os contato
	private static void serializarContatos(List<Contato> listaContatos) throws IOException{
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))){
			outputStream.writeObject(listaContatos);
		}
		
	}//end of serializarContatos
	
	private static void desserializarContatos() throws IOException, ClassNotFoundException{
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))){
			List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
			for(Contato contato : contatosLidos) {
				System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone() + "\n-----------------------------------");
			}
		}
	}//end of desserializarContato
	
	public static void main(String[] args) {
		Contato contato1 = new Contato("Daniela Ilka de Menezes Lira", "(81) 9 9173-8604");
		Contato contato2 = new Contato("Heitor Menezes Oliveira", "(81) 9 9313-2536");
		Contato contato3 = new Contato("Nikolas Menezes Oliveira", "(81) 9 9313-2536");
		Contato contato4 = new Contato("Fabio Henrique Oliveira", "(81) 9 9313-2536");
		Contato contato5 = new Contato("Maria Alcineide", "(81) 9 9273-0917");
		Contato contato6 = new Contato("", "");
		Contato contato7 = new Contato("Abraão Henrique Oliveira", "(81) 9 9123-2345");
		
		List<Contato> listaContatos = new ArrayList<>();
		listaContatos.add(contato1);
		listaContatos.add(contato2);
		listaContatos.add(contato3);
		listaContatos.add(contato4);
		listaContatos.add(contato5);
		listaContatos.add(contato6);
		
		try {
			serializarContatos(listaContatos);
			desserializarContatos();
		}catch(Exception e) {
			System.out.println("Erro:\n" + e.getMessage());
		}
		
	}//end of main
}//end of class