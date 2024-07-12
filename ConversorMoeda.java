import java.util.Scanner;
public class ConversorMoeda {
    public static void main(String[] args) {
        System.out.println("Digite o valor em reais (R$) que você deseja converter para Dólar (US$) e para Euro (€).");
        Scanner scanner = new Scanner(System.in);
        double valorDouble = scanner.nextDouble();
        scanner.close();
        conversorDolar(valorDouble);
        conversorEuro(valorDouble);
    }
    public static void conversorDolar(Double valorDouble) {
        Double total;
        total = (valorDouble*5.42);
        System.out.println(total);
    }
    public static void conversorEuro(Double valorEuro) {
        Double total;
        total = (valorEuro*5.87);
        System.out.println(total);
    }
}
