package enums;

public enum Prioridade {

	MIN(50), NORMAL(60), MAX(70);

	private int valor;

	Prioridade(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

}
