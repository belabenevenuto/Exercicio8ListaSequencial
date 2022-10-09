import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double valorHora, qtdeHoras, salarioMes;
        Scanner teclado = new Scanner(System.in);
        valorHora = teclado.nextDouble();
        qtdeHoras = teclado.nextDouble();
        salarioMes = valorHora * qtdeHoras;
        System.out.print("O salário do mês será " + salarioMes + " reais");
    }
}