import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o gênero (M pra Masculino, F pra Feminino, N pra anônimo): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        if (genero == 'N') {
            genero = 'F';
        }

        System.out.println("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso (em quilogramas): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);
     
        String classificacao = getClassificacao(genero, imc);

        System.out.println("\nNome: " + nome);
        System.out.println("Gênero: " + (genero == 'M' ? "Masculino" : "Feminino"));
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    public static String getClassificacao(char genero, double imc) {
        if (genero == 'M') {
            if (imc < 20) {
                return "Abaixo do normal";
            } else if (imc < 25) {
                return "Normal";
            } else if (imc < 30) {
                return "Obesidade Leve";
            } else if (imc < 40) {
                return "Obesidade Moderada";
            } else {
                return "Obesidade Mórbida";
            }
        } else {
            if (imc < 19) {
                return "Abaixo do normal";
            } else if (imc < 24) {
                return "Normal";
            } else if (imc < 29) {
                return "Obesidade Leve";
            } else if (imc < 39) {
                return "Obesidade Moderada";
            } else {
                return "Obesidade Mórbida";
            }
        }
    }
}
