package br.com.generation.exercicios1711;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimais t = new TestaAnimais();
		
		t.nomeAnimal(new Cachorro());
		t.idadeAnimal(new Cachorro());
		t.somAnimal(new Cachorro());
		t.movimento(new Cachorro());
		
		System.out.println("-----------------------------------");
		
		t.nomeAnimal(new Cavalo());
		t.idadeAnimal(new Cavalo());
		t.somAnimal(new Cavalo());
		t.movimento(new Cavalo());
		
		System.out.println("-----------------------------------");
		
		t.nomeAnimal(new Preguiça());
		t.idadeAnimal(new Preguiça());
		t.somAnimal(new Preguiça());
		t.movimento(new Preguiça());
		

	}

}
