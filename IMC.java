package IMC;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, alt, imc;
        System.out.print("Peso..:");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Altura..:");
        alt = Double.parseDouble(sc.nextLine());
        imc = peso / (alt * alt);
        System.out.println("IMC..:" + imc);

        // Analisando o resultado de IMC
        if (imc < 18.5) {
            System.out.println("--- Abaixo do Peso ---");
        } else if (imc < 25) {
            System.out.println("--- Peso Normal ---");
        } else if (imc < 30) {
            System.out.println("--- Sobrepeso ---");
        } else if (imc < 35) {
            System.out.println("--- Obesidade Grau 1 ---");
        } else if (imc < 40) {
            System.out.println("--- Obesidade Grau 2 ---");
        } else {
            System.out.println("--- Obesidade Grau 3 ---");
        }
    }
}
