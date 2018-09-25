package application;

import java.util.Date;
import java.util.Scanner;

import entities.Agencia;
import entities.Conta;
import entities.Endereco;
import entities.Movimento;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa pF = new PessoaFisica(5858556, 6968585, new Date().toString(), 50000.0, 1, new Endereco("skdjskdjs", 58058410, "ksjkjs", 104, "joao"));
		Pessoa pJ = new PessoaJuridica(1005852, new Date().toString(), 50000.0, 1, new Endereco("skdjskdjs", 58058410, "ksjkjs", 104, "joao"));
		
		Pessoa p = new Pessoa("Rafael", 5000.0, 1, new Endereco("Sebastião da silva Leal", 58058840,"Mangabeira", 94, "João Pessoa"));
		
		Conta c = new Conta(123, "25/09/2018", "", 1, "1234", 5000.00, p);
		
		Agencia ag = new Agencia(5071); 
		
		
		
		int opc = 1;
		while(opc != 4) {
			
			System.out.println(" ------------------------- \n" 
							+ "| Gerenciamento de Contas | \n"
							+ "| 1- Cadastrar Conta      | \n"
							+ "| 2- Listar Conta         | \n"
							+ "| 3- Acessar Conta        | \n"
							+ "| 4- Sair                 | \n"
							+ "|                         | \n"
							+ " -------------------------");
			
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1:
				System.out.println("Digite numero da sua conta: ");
				int numConta = sc.nextInt();
				sc.nextLine();
				c = new Conta(numConta, new Date().toString(), null, 1, "1234", 5000.00, p);
				ag.cadastrarConta(c);
				break;
			case 2:
				for(Conta c1 : ag.getContas()) {
					System.out.println(c1);
				}
				break;
			case 3:
				
				System.out.print("Digite numero da sua conta: ");
				int minhaConta = sc.nextInt();
				sc.nextLine();
				for(Conta c1 : ag.getContas()) {
					
					if(c1.getNumeroConta() == minhaConta) {
						System.out.println(c1);
						int opcAcessar = 1;
						while(opcAcessar != 5) {
							
							System.out.println(" ---------------------------- \n" 
											+ "| Conta nº: " + c1.getNumeroConta() + "             | \n"
											+ "| 1- Realizar Saque          | \n"
											+ "| 2- Realizar Deposito       | \n"
											+ "| 3- Realizar Transferência  | \n"
											+ "| 4- Extrato Bancário        | \n"
											+ "| 5- Sair                    | \n"
											+ " ----------------------------");
							
							int opc2 = Integer.parseInt(sc.nextLine());
							
							switch (opc2) {
							case 1:
								System.out.println("Deseja sacar informe o valor: ");
								Double valor = Double.parseDouble(sc.nextLine());
								c1.sacar(valor);
								break;
							case 2:
								System.out.println("Deseja realizar um deposito, informe o valor: ");
								Double valorDeposito = Double.parseDouble(sc.nextLine());
								c1.depositar(valorDeposito);
								break;
							case 3:
								System.out.print("Digite o valor de transferência: ");
								Double valorTransf = Double.parseDouble(sc.nextLine());
								
								System.out.print("Digite o número da conta desejada: ");
								
								int contaTransf = sc.nextInt();
								sc.nextLine();
								
								for(Conta c2 : ag.getContas()) {
									
									if(c2.getNumeroConta() == contaTransf) {
										c2.transferir(valorTransf, c2); //adiciona movimento a conta que recebe
									}
								}
								
								//Adiciona movimento a conta que transfere
								if(c1.getSaldo() > valorTransf) {
									c1.movimentar(3, new Date().toString(), new Date().toString(), valorTransf);
								}
								
								
								
								break;
							case 4:
								
								int cont = 0; //Verificar quantos movimentos dentro da lista
								for(Movimento mov : c1.getMovimentos()) {
										System.out.println(mov);
										cont++;
									
								}
								if(cont == 0) {
									System.out.println("Extrato vazio");
								}
								break;
							case 5:
								opcAcessar = 5;
								break;
							default:
								break;
							}
						}
						
						break;
					}
										
				}
				
				break;
			case 4:
				opc = 4;
				System.out.println("Obrigado por utilizar o banco Unipê Bank ");
				break;
			default:
				System.out.println("Opção de Menu inválida");;
			}
		}
		
		sc.close();

	}

}
