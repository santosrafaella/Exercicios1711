package br.com.generation.exercicios1711;

public class Cavalo extends Animal {

	@Override
	public void nome() {
		System.out.println("Nome do cavalo: Pegasus");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade do cavalo: 3 anos");
		
	}

	@Override
	public void somE() {
		System.out.println("Som emitido pelo cavalo: irrriiií");
		
	}
	@Override
	public void movimento() {
		System.out.println("Movimentação do cavalo: correndo");
	}

}
