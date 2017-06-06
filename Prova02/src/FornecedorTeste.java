public class FornecedorTeste {

	public static void main(String[] args) {
		
		Fornecedor fe = new Fornecedor();
		
		fe.setNome("Jefferson");
		fe.setCredimax(1500);
		fe.setValoremdv(500);
		
		System.out.println("Fornecedor=====> Nome: "  + fe.getNome() + " Credito maximo "  + fe.getCredimax() +" Valor em divida " 
		+ fe.getValoremdv());
	
	
	
	}

	}


