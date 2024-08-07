import java.lang.Math;
import java.util.Scanner;
public class CalculoDeAreas {
    public static void main(String[] args) {
        int menu = 0; 
        Scanner scan = new Scanner(System.in);
        while (menu==0) {
            System.out.println("Selecione a opção correspondente: ");
            System.out.println("\n1 - Área do Círculo.");
            System.out.println("2 - Área do Retângulo.");
            System.out.println("3- Área do Triângulo.");
            System.out.println("4 - Sair.");
            System.out.print("\n->");
            menu = scan.nextInt();
            switch (menu) {
                case 1: circulo(); break;
                case 2: retangulo(); break;
                case 3: triangulo(); break;
                case 4: menu++; break;
                default: System.out.println("Digite uma opção correta. . .\n"); break;
            }
            scan.close();
        }
    }
    public static void circulo() {
        System.out.print("Digite o valor do raio: ");
        Scanner scanout = new Scanner(System.in);
        double raio = scanout.nextDouble();
        scanout.close();
        double resultadoCirculo = Math.PI*(raio*raio);
        System.out.println(resultadoCirculo);
        }
    public static void retangulo() {
        System.out.print("Digite a altura: ");
        Scanner scanout = new Scanner(System.in);
        double altura = scanout.nextDouble();
        System.out.print("Digite a largura: ");
        double largura = scanout.nextDouble();
        scanout.close();
        double resultadoRetangulo = altura*largura;
        System.out.println(resultadoRetangulo);
    }
    public static void triangulo() {
        System.out.print("Digite o tamanho da base do triângulo: ");
        Scanner scanout = new Scanner(System.in);
        double base = scanout.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanout.nextDouble();
        double resultadoTriangulo = (base*altura)/2;
        System.out.println(resultadoTriangulo);
        scanout.close();
    }
}