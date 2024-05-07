import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Entre com o segundo valor: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        if (contagem <= 0){
            throw  new ParametrosInvalidosException();
        } else {
            System.out.println("Primeiro valor: " + parametroUm);
            System.out.println("Segundo valor: " + parametroDois);
            System.out.println("Valor de Contagem: " + (contagem));
            for (int i = 0; i < contagem; i++){
                System.out.println("Loop n° " + (i + 1));
            }
        }
    }
}
