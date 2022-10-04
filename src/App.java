import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Requisito 01: Peça uma medida em mt
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();

        //Requisito 02: Converter em cm e imprimir
        double centimetros = metros * 100;
        System.out.println(metros + " metros, corresponde à " + centimetros + " centímetros.");

    }
}
