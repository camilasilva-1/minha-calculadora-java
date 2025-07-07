import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Calculadora Simples--");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case '+':
            resultado = num1 + num2;
            break;
            case '-': 
            resultado = num1 - num2;
            break;
            case '*':
            resultado = num1 * num2;
            break;
            case '/':
            resultado = num1 / num2;
        if (num2 !=0){
            resultado = num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            resultado = Double.NaN;
        }
        break;
    default: 
        System.out.println("Operação inválida. Por favor, use +, -, * ou /.");
        resultado = Double.NaN;
 }
        if (!Double.isNaN(resultado)) {
            System.out.println("resultado: " + resultado);
        }
scanner.close();
    }


}
