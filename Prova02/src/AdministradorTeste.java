		
public class AdministradorTeste {

	public static void main(String[] args) {
		
		Administrador a = new Administrador();
		a.setNome("Jefferson");
		a.setSalario(1000);
		a.obterlucro();
		System.out.println("Funcionario ====> Nome: " + a.getNome() + " Salario: " + a.getSalario());
		
	}
	
}
