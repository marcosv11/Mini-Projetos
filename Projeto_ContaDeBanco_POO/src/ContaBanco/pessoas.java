package ContaBanco;

public class pessoas {
	public static void main (String[] args) {
		
		conta p1 = new conta();
		p1.setNumConta(11111);
		p1.setDono("Marcos Vinicius");
		p1.abrirConta("CC");
		 
		
		p1.estadoAtual();  
		
		p1.depositar(1302);
		
		p1.estadoAtual();
		
		p1.sacar(890);
		
		p1.estadoAtual();
		
		p1.fecharConta();
		
		p1.sacar(462);
		
		p1.estadoAtual();
		
		p1.fecharConta();
		 
	}
}
