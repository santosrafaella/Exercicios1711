package br.com.generation.exercicios1711;

public class Cachorro extends Animal{

	@Override
	public void nome() {
		System.out.println("Nome do cachorro: Luna");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade do cachorro: 2 anos");
		
	}

	@Override
	public void somE() {
		System.out.println("Som emitido pelo cachorro: auau");
		
	}
	@Override
	public void movimento() {
		System.out.println("Movimentação do cachorro: correndo");
	}

}
