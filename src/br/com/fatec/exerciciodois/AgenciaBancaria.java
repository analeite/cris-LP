package br.com.fatec.exerciciodois;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AgenciaBancaria {

	public static void menu() {
		System.out.println("-----Cadastro de Contas-----");
		System.out.println("------------Menu------------");
		System.out.println("----------------------------");
		System.out.println("1 - Cadastrar Nova Conta");
		System.out.println("2 - Buscar Todas as Contas");
		System.out.println("3 - Apagar Conta");
		System.out.println("4 - Listar Dados da Pessoa");
		System.out.println("0 - Sair");
		System.out.println("Opção: ");
	}	

	static void excluir(ArrayList<Conta> agencia) {
		System.out.println("Você entrou no método Exclui.");
		
		//Digite numero da conta para excluir?
		
		for (Conta conta2 : agencia) {
			if(conta2.getNumeroConta().equals("digitouNumeroConta")){
				agencia.remove(conta2.getNumeroConta());
			}	
		}
		
	}

	static void listarDadosPessoa(ArrayList<Conta> agencia) {
		System.out.println("Você entrou no método Consulta.");
	}

	public static void main(String[] args) {
		
		ArrayList<Conta> agencia = new ArrayList<Conta>();
		
		// Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				incluir(agencia);
				break;

			case 2:
				consultar(agencia);
				break;

			case 3:
				excluir(agencia);
				break;

			case 4:
				listarDadosPessoa(agencia);
				break;

			default:
				System.out.println("Opção Inválida.");
			}
		} while (opcao != 0);
	}
	
	static void incluir(ArrayList<Conta> agencia) {
		System.out.println("Você entrou no método Inclui.");
		
		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		Set<Conta> cpfSet = new HashSet<Conta>();

		Conta conta = new Conta();
		
		System.out.println("Digite o nome do cliente: ");
		conta.setNomePessoa(cons.nextLine());
		System.out.println("Digite o número do CPF do cliente: ");
		conta.setCpfPessoa(cons.nextLine());
		cpfSet.add(conta);
		System.out.println("Digite a data de aniversário do cliente: ");
		conta.setAniversarioPessoa(cons.nextLine());
		System.out.println("Digite o número da nova conta: ");
		conta.setNumeroConta(cons.nextLine());
		System.out.println("Digite o tipo de conta: ");
		conta.setTipoConta(cons.nextLine());
		agencia.add(conta);
		
		System.out.println(conta.getNomePessoa());
		System.out.println(conta.getCpfPessoa());
		System.out.println(conta.getAniversarioPessoa());
		System.out.println(conta.getNumeroConta());
		System.out.println(conta.getTipoConta());
		
		System.out.println("----------------------------");		
		
	}
	
	static void consultar(ArrayList<Conta> agencia) {
		
		for (Conta conta : agencia) {
			System.out.println("Informações de Cliente: \n" + "Nome do Cliente: " + conta.getNomePessoa() + "\n"
					+ "CPF do Cliente: " + conta.getCpfPessoa() + "\n" + "Data de Aniversário do Cliente: "
					+ conta.getAniversarioPessoa() + "\n" + "Número da Conta: " + conta.getNumeroConta() + "\n"
					+ "Tipo de Conta: " + conta.getTipoConta() + "\n");
			
		}

	}

}
