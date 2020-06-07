
public class TesteFucionario {

	public static void main(String[] args) {
		
		Funcionario g = new Gerente();
		g.setNome("Gabriel");
		g.setCpf("102.123.000.00");
		g.setSalario(10000.00);
		
		System.out.println(g.getNome());
		System.out.println(g.getSalario());
		System.out.println(g.getBonus());
	}
}
