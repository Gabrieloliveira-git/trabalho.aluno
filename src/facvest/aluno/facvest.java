package facvest.aluno;

import java.util.Scanner;

public class facvest {	
		  
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        aluno aluno = new aluno();
	       
		        System.out.print("Informe o nome do aluno: ");
		        aluno.setNome(scanner.nextLine());

		        System.out.print("Informe a matrícula: ");
		        aluno.setMatricula(scanner.nextLine());

		        System.out.print("Informe o sexo: ");
		        aluno.setSexo(scanner.nextLine());

		        System.out.print("Informe a data de nascimento (dd/mm/aaaa): ");
		        aluno.setDataNascimento(scanner.nextLine());

		        System.out.print("Informe o Curso: ");
		        aluno.setCurso(scanner.nextLine());

		        System.out.print("Informe ano de início: ");
		        aluno.setAnoInicio(scanner.nextInt());

		        aluno.setNotaProva1(validarNota(scanner, "informe a Nota da Prova 1"));
		        aluno.setNotaProva2(validarNota(scanner, "informe a Nota da Prova 2"));
		        aluno.setMediaTrabalhos(validarNota(scanner, "Informe a média dos Trabalhos"));

		        
		        boolean aprovado = aluno.estaAprovado();
		        
		        double mediaFinal = aluno.calcularMedia();
		        
		        System.out.println("\n  Resultado do Aluno  ");
		        System.out.println("Nome: " + aluno.getNome());
		        System.out.println("Matrícula: " + aluno.getMatricula());
		        System.out.println("Curso: " + aluno.getCurso());
		        System.out.println("Situação : " + (aprovado ? "aprovado" : "reprovado") + " com uma média de " + mediaFinal);

		        scanner.close();
		    }
		    
		    private static double validarNota(Scanner scanner, String nomeNota) {
		        double nota;
		        do {
		            System.out.print("Digite a " + nomeNota + " (0-10): ");
		            nota = scanner.nextDouble();
		            if (nota < 0 || nota > 10) {
		                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
		            }
		        } while (nota < 0 || nota > 10);
		        return nota;
		    }
		}