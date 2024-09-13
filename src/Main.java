import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = s.nextInt();
        System.out.println("Digite a primeira nota: ");
        float nota2 = s.nextInt();
        System.out.println("Digite a primeira nota: ");
        float nota3 = s.nextInt();
        float resul = (nota1 + nota1 + nota3) / 3;

        if (resul > 6) {
            System.out.println(" você está aprovado");
        } else if (resul < 6) {
            System.out.println(" você está de recuperação");
        } else {
            System.out.println(" você está de reprovado");
        }
    }
}