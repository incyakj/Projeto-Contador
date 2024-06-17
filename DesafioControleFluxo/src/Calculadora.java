import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double resultado;
        Boolean continuar= true;
        
        
        
        System.out.println("Digite 1 - Soma | 2 - Subtração | 3 - Divisão | 4 - Multiplicação");
        while(continuar){
                int opcao = scanner.nextInt();
                Double numeroUm;
                    Double numeroDois;

                switch(opcao){
                    case 1: 
                    System.out.println("Digite os números que deseja somar: ");
                     numeroUm = scanner.nextDouble();
                     numeroDois = scanner.nextDouble();
                    resultado = numeroUm + numeroDois;
                    System.out.println("O resultado é: " + resultado);
                    break;

                    case 2:

                    System.out.println("Digite os números que deseja subtrair: ");
                    numeroUm = scanner.nextDouble();
                    numeroDois = scanner.nextDouble();
                    resultado = numeroUm - numeroDois;
                    System.out.println("O resultado é: " + resultado);
                    break;

                    case 3:

                    System.out.println("Digite os números que deseja dividir: ");
                    numeroUm = scanner.nextDouble();
                    numeroDois = scanner.nextDouble();
                    resultado = numeroUm / numeroDois;
                    System.out.println("O resultado é: " + resultado);
                    break;

                    case 4:

                    System.out.println("Digite os números que deseja multiplicar: ");
                    numeroUm = scanner.nextDouble();
                    numeroDois = scanner.nextDouble();
                    resultado = numeroUm * numeroDois;
                    System.out.println("O resultado é: " + resultado);
                    break;

                    default:
                    System.out.println("Opção Invalida, tente novamente.");
                



                }

                }
                

                    scanner.close();

            
        }



        
    }

