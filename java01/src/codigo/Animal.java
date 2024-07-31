package codigo;

public class Animal {
	
	public String especie;
	public int idade;
	public String alimentacao;
	
	public Animal (String especieDoAnimal, String alimentacaoDoAnimal) {
		this.especie = especieDoAnimal;
		this.alimentacao = alimentacaoDoAnimal;
	}
		
	public void comer() {
		System.out.println("Animal comendo");
	}
		
	public void acordar() {
		
	}
}
