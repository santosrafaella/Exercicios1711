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
		
		t.nomeAnimal(new Pregui�a());
		t.idadeAnimal(new Pregui�a());
		t.somAnimal(new Pregui�a());
		t.movimento(new Pregui�a());
		

	}

}
