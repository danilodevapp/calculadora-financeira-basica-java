import java.util.Scanner;
import java.util.Locale;

public class CalculadoraFinanceira {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Calcular calcular = new Calcular();

        System.out.println("Onde não houver variável, coloque 0.0");
        
        System.out.println("Digite o valor do capital: ");
        calcular.CapitalInicial = scanner.nextDouble();
        System.out.println("");

        System.out.println("Digite o tempo: ");
        calcular.Tempo = scanner.nextDouble();
        System.out.println("");

        System.out.println("Digite o valor da taxa: ");
        calcular.Taxa = scanner.nextDouble();
        System.out.println("");

        System.out.println("Cálculo dos Juros Simples: ");
        double jurosSimples = calcular.CalcularJurosSimples(0, 0);
        System.out.println(jurosSimples);
        System.out.println("");

        System.out.println("Cálculo de Juros: ");
        double juros = calcular.CalcularJuros(jurosSimples, jurosSimples, jurosSimples);
        System.err.println(juros);
        System.out.println();
        
    }

}
