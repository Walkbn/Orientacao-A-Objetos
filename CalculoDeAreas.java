import java.util.Scanner;
public class CalculoDeAreas {
    public static void main(String[] args) {
        int menu = 0; double areaRetangulo = 0, areaCirculo = 0, areaTriangulo = 0, raioRetangulo = 0, raioCirculo = 0, raioTriangulo = 0;
        Scanner scan = new Scanner(System.in);
        while (menu==0) {
            System.out.println("Selecione a opção correspondente: ");
            System.out.println("\n1 - Área do Círculo.");
            System.out.println("2 - Área do Retângulo.");
            System.out.println("3- Área do Triângulo.");
            System.out.println("4 - Sair.");
            System.out.println("\n->");
            switch (menu) {
                case 1: 
                circulo(areaCirculo, raioCirculo);
                case 2:
                retangulo(areaRetangulo, areaRetangulo);
                case 3:
                triangulo(areaTriangulo, areaTriangulo);
                default: System.out.println("Digite uma opção coerente: ");
            }
            scan.close();
        }
    }
    public static double circulo(double areaCirculo, double raioCirculo) {

        }
    public static double retangulo(double areaRetangulo, double raioRetangulo) {

    }
    public static double triangulo(double areaTriangulo, double raioTriangulo) {

    }
}