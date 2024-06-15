import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
		}
		scanner.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException ("O Segundo parametro deve ser maior do que o primeiro");
        }
        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo número " + (i+1));
        
        }
        
    }
}
		//realizar o for para imprimir os números com base na variável contagem
	