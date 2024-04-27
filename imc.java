import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Digite o nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite o gênero (M pra Masculino, F pra Feminino, N pra anônimo): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        if (gender == 'N') {
            gender = 'F';
        }

        System.out.println("Digite a altura (em metros): ");
        double height = scanner.nextDouble();

        System.out.println("Digite o peso (em quilogramas): ");
        double weight = scanner.nextDouble();

        double imc = weight / (height * height);
     
        String classification = getClassification(gender, imc);

        System.out.println("\nNome: " + name);
        System.out.println("Gênero: " + (gender == 'M' ? "Masculino" : "Feminino"));
        System.out.println("Altura: " + height + " metros");
        System.out.println("Peso: " + weight + " kg");
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classification);

        scanner.close();
    }

    public static String getClassification(char gender, double imc) {
        if (gender == 'M') {
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
