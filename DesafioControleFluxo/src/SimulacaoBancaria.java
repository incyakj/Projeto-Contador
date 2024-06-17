import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        System.out.println("Digite: 1 - Depositar | 2 - Sacar | 3 Consultar o Saldo | 0 - Encerrar");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDepositado = scanner.nextDouble();
                    saldo = saldo + valorDepositado;
                    System.out.println("O saldo atual é: "+ saldo +" R$");
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    
                    if(valorSaque > saldo){
                      System.out.println("Saldo insuficiente");
                    } else {
                      saldo = saldo - valorSaque;
                      System.out.println("Saque realizado com sucesso!");
                      System.out.println("O saldo atual da conta é " + saldo +"R$");
                      
                    }
                      
                      break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("O saldo atual da conta é de: " + saldo + "R$");
                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}