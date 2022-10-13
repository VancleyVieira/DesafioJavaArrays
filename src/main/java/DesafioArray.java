//Importando biblioteca para inserir valores no console
import java.util.Scanner;

public class DesafioArray {

   public static void main(String []args){
       Scanner scan = new Scanner(System.in);

       final int numeroDePerguntas = 5;
       final int pontosPorPerguntas = 2;
       char[] gabarito = {'a','c','b','a','c'};
       String[] perguntas = {
               "Qual a maior estrela do nosso sistema solar?",
               "Qual letra fica entre 'D' e 'F' no alfabeto?",
               "4x6 é igual a?",
               "Complete a sequencia: \n2x2 = 4, 3x3 = 9, ____.",
               "Qual é o valor de PI?"
       };
       String[] alternativas = {
               "a) sol  |  b) lua  |  c) marte",
               "a) G  |  b) T  |  c) E",
               "a) 18  |  b) 24  |  c) 26",
               "a) 4x4 = 16  |  b) 3x4 = 12  |  c) 4x4 = 8",
               "a) 14  |  b) 14,3  |  c) 3,14"
       };

       char[] respostas = new char[numeroDePerguntas];
       char resposta;
       int nota = 0;
       String aluno;

       System.out.println("Digite seu nome: ");
       aluno = scan.nextLine();
       for(int i = 0; i < numeroDePerguntas; i++) {
           System.out.println("---------------------------------");
           System.out.printf("Pergunta %d%n", i+1);
           System.out.printf("%s%n",perguntas[i]);
           System.out.printf("%s%n",alternativas[i]);
           resposta = scan.nextLine().charAt(0);
           respostas[i] = resposta;
       }

       System.out.printf("%s%n","Fim da prova, confira o resultado");
       for(int i = 0; i < numeroDePerguntas; i++){
           if(gabarito[i] == respostas[i]){
               nota += pontosPorPerguntas;
           }
       }

       System.out.printf("%s sua nota foi: %d, voce foi %s", aluno,nota,nota >= 6 ? "Aprovado" : "Reprovado");

   }
}
