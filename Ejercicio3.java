import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lecturas = 0;
        double temperatura;
        while (true) {
            System.out.print("Ingrese temperatura: ");
            temperatura = sc.nextDouble();
            lecturas++;
            if (temperatura > 95) {
                System.out.println("Temperatura critica: " + temperatura);
                break;
            }
        }
        System.out.println("Lecturas realizadas: " + lecturas);
        sc.close();
    }
}