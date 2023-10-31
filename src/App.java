import java.util.Scanner;

import uniderp.poo.escola.Servico.ProfessorServico;
import uniderp.poo.escola.Servico.AlunoServico;

public class App {
 
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            AlunoServico alunoServico = new AlunoServico();
            ProfessorServico professorServico = new ProfessorServico();

            int opcao;
            do {
                System.out.println(".............MENU..............");
                System.out.println("1- PROFESSORES.................");
                System.out.println("2- ALUNOS......................");
                System.out.println("3- SAIR........................");
                opcao = scanner.nextInt();
        
            switch(opcao) {
                 case 1:
                 menuProfessor(professorServico, scanner);
                 break;
                 case 2:
                 menuAluno(alunoServico, scanner);
                 break;
                 case 3:
                 System.out.println("ENCERRANDO!!!!!");
                 default:
                 System.out.println("DIGITE UMA OPÇÃO VALIDA!!!!!!");
                 break;
            } 
            } while(opcao != 3);
            
        }
        private static void menuProfessor(ProfessorServico professorServico, Scanner scanner){
            int option;

            do{
                System.out.println("1- LISTA DE TURMAS DO PROFESSOR");
                System.out.println(); 
                System.out.println(); 
                option = scanner.nextInt();
                
            } while(option != 3);

        }

        private static void menuAluno(AlunoServico alunoServico, Scanner scanner){
            int option;

            do{
                System.out.println("1- LISTA DE TURMAS DO PROFESSOR");
                System.out.println("2- LISTAR ALUNOS DAS TURMAS"); 
                System.out.println("3- NOTAS DOS ALUNOS");
                System.out.println("4- VOLTAR AO MENU PRINCIPAL");
                option = scanner.nextInt();
            }
            
            while(option != 4);
        }

    }