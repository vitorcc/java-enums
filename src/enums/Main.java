package enums;

public class Main {
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		t.setPriority(Thread.MAX_PRIORITY);
		
		Prioridade prioridade = Prioridade.MAX;
		Prioridade prioridade2 = Prioridade.MIN;
		
		System.out.println(prioridade.name());
		System.out.println(prioridade.ordinal());
		
		
		System.out.println(prioridade2.getValor());
	}

}
