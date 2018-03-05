package com.mycompany.mavenproject1;
import java.util.*;

/**
 *
 * @author Matheus
 * versao 1.0
 */
public class Aluno {
    public static String situacaof;
    public static double p1, trabalho, projetos, frequencia, pf, m1;
    
    /**
     * Teste onde se calcula as notas de um aluno para saber a situação dele, aprovado, reprovado ou prova final
     * No metodo situacao se encontra:
     * frequencia = a frequencia do aluno nas aulas
     * p1 = nota na primeira prova obtida pelo aluno
     * trabalho = nota obtida pelo aluno no trabalho
     * projeto = nota obtida pelo aluno no projeto
     * pf = nota obtida pelo aluno na pf
     * m1 = media das notas obtidas pelo aluno
     */

    
   public String situacao(double frequencia, double p1, double trabalho, double projeto, double pf){
         double m1 = (0.7 * ((p1 + trabalho) / 2)) + (projeto * 0.3);
         String situacao;

        if(frequencia >= 75){
            if(m1 >= 7) 
                situacao= "Aprovado";
            else if (m1 < 3) 
                situacao = "Reprovado";
            else{

                if( ((pf + m1) / 2) >= 5)
                    situacao = "Aprovado";
                else
                    situacao = "Reprovado";
            }
        }else{
            situacao= "Reprovado";
        }

        return situacao;
    }
   

}
