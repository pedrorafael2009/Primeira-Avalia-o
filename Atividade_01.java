import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a 1ª nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double nota3 = entrada.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        double nota4 = entrada.nextDouble();
        System.out.print("Digite a 5ª nota: ");
        double nota5 = entrada.nextDouble();
        System.out.print("Digite a 6ª nota: ");
        double nota6 = entrada.nextDouble();
        System.out.print("Digite a 7ª nota: ");
        double nota7 = entrada.nextDouble();
        System.out.print("Digite a 8ª nota: ");
        double nota8 = entrada.nextDouble();
        
        double bimestre1 = (nota1 + nota2) / 2;
        double bimestre2 = (nota3 + nota4) / 2;
        double semestre1 = (bimestre1 + bimestre2) / 2;

        double bimestre3 = (nota5 + nota6) / 2;
        double bimestre4 = (nota7 + nota8) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        double mediaFinal = (semestre1 + semestre2) / 2;


        System.out.println("1º Bimestre: " + bimestre1);
        System.out.println("2º Bimestre: " + bimestre2);
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("-------------------------");

        System.out.println("3º Bimestre: " + bimestre3);
        System.out.println("4º Bimestre: " + bimestre4);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("-------------------------");
        
        System.out.println("Média Final: " + mediaFinal);
    }
}
