
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Guilherme");
		g1.setSalario(5000.0);
		
		Programador p = new Programador();
		p.setSalario(2500);
		
		Diretor d = new Diretor();
		d.setSalario(8000.0);
		
		ControleBonus controle = new ControleBonus();
		controle.registra(g1);
		controle.registra(p);
		controle.registra(d);
		System.out.println(controle.getSoma());
	}
}
