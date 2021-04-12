package Projetob1;

import java.util.ArrayList;
import java.util.List;

public class Livros extends Listas {
	
public Livros() {}
	
	@Override
	public void listaGeneros() {
		System.out.println("\nDigite o c�digo do g�nero desejado:"
				+ "\n1- Autoajuda"
				+ "\n2- Suspense"
				+ "\n3- Romance"
				+ "\n4- Fic��o e Fantasia"
				+ "\n5- Drama"
				+ "\n6- Classicos");
	}
	
	@Override
	public List<String> lista1()
	{
		List<String> listaAutoajuda = new ArrayList<String>();
		listaAutoajuda.add("O Milagre do Amanh�");
		listaAutoajuda.add("O Poder do H�bito");
		listaAutoajuda.add("A Sutil Arte de Ligar o Foda-se");
		listaAutoajuda.add("O Poder do Agora");
		listaAutoajuda.add("Mindset");
		listaAutoajuda.add("O Poder da A��o");
		listaAutoajuda.add("Ansiedade: Como enfrentar o mal do s�culo");
		listaAutoajuda.add("Felicidade");
		listaAutoajuda.add("Antes que eu me esque�a");
		return listaAutoajuda;
	}
	@Override
	public List<String> lista2()
	{
		List<String> listaSuspense = new ArrayList<String>();
		listaSuspense.add("Dr�cula");
		listaSuspense.add("O Gato Preto");
		listaSuspense.add("O Iluminado");
		listaSuspense.add("O Chamado de Cthulhu");
		listaSuspense.add("A Hora do Vampiro");
		listaSuspense.add("A Dan�a da Morte");
		listaSuspense.add("A Maldi��o da Resid�ncia Hill");
		listaSuspense.add("Bird Box");
		return listaSuspense;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Orgulho e Preconceito");
		listaRomance.add("Deixe a Neve Cair");
		listaRomance.add("Cidades de Papel");
		listaRomance.add("A Ultima musica");
		listaRomance.add("A Culpa � das Estrelas");
		listaRomance.add("O Morro dos Ventos Uivantes");
		listaRomance.add("P.S Te Amo");
		listaRomance.add("Simplesmente Acontece");
		
		return listaRomance;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Cronicas de Gelo e Fogo");
		listaFiccaoFantasia.add("Frankestein");	
		listaFiccaoFantasia.add("Viagem ao centro da Terra");
		listaFiccaoFantasia.add("Stardust");
		listaFiccaoFantasia.add("Eragon");
		listaFiccaoFantasia.add("20 mil L�guas Submarinas");
		listaFiccaoFantasia.add("A Guerra dos Mundos");
		listaFiccaoFantasia.add("Fahrenheit 451");
		listaFiccaoFantasia.add("I, Robot");
		listaFiccaoFantasia.add("Android Sonha com Ovelhas");
		return listaFiccaoFantasia;
	}
	@Override
	public List<String> lista5()
	{
		List<String> listaDrama = new ArrayList<String>();
		listaDrama.add("Textos Cru�is demais para serem lidos");
		listaDrama.add("Como eu era antes de voc�");
		listaDrama.add("A Menina que roubava livros");
		listaDrama.add("Um Lugar bem longe daqui");
		listaDrama.add("A Paciente Silenciosa");
		listaDrama.add("O Sol � para todos");
		listaDrama.add("O Ca�ador de Pipas");
		listaDrama.add("Duna");
		listaDrama.add("O Principe Cruel");
		
		return listaDrama;
	}
	@Override
	public List<String> lista6()
	{
		List<String> listaClassicos = new ArrayList<String>();
		listaClassicos.add("Dom Casmurro");
		listaClassicos.add("A Revolu��o dos Bichos");
		listaClassicos.add("Dom quixote");
		listaClassicos.add("Mem�rias P�stumas de Br�s Cubas");
		listaClassicos.add("Odisseia");
		listaClassicos.add("Os Miser�veis");
		listaClassicos.add("Os Lus�adas");
		listaClassicos.add("Madame Bovary");
		listaClassicos.add("O corti�o");
		return listaClassicos;
	}	
}
