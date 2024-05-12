import java.util.Scanner;

public class Contador {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        try{
           contar(num1,num2);

        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }


    }

    static void contar(int num1, int num2) throws  ParametrosInvalidosException {

        if (num1>num2) throw new ParametrosInvalidosException();
        int contagem = num2 - num1;
        System.out.println("Iniciando a contagem...");
        for (int cont = 0 ; cont <= contagem; cont++){
            System.out.println("Numero atual: " + cont);
        }

    }
}
