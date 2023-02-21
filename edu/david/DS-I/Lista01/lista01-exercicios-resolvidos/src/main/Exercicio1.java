
package main;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        
        Scanner grava = new Scanner(System.in);
        double nota1, nota2, nota3, media=0; 
        String nome;
           
        System.out.println("informe o nome do aluno: ");  
            nome = grava.next();
        System.out.println("Informe a primeira nota -> ");
            nota1 = grava.nextDouble();
        System.out.println("Informe a segunda nota -> ");
            nota2 = grava.nextDouble();
        System.out.println("Informe a terceira nota -> ");
            nota3 = grava.nextDouble();
           media = (nota1+nota2+nota3)/3;
           
            System.out.format("O aluno " + nome + "teve a media %.2f", media);     
    }
    
}
