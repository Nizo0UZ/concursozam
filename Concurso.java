
package concurso;

import java.util.Scanner;

public class Concurso {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      System.out.print("Qual a quantidade de pessoas?:\n");
      int pss = ler.nextInt();
      ler.nextLine();
      
      String[]nome = new String[pss];
      double[]nota1 = new double[pss];
      double[]nota2 = new double[pss];
      double[]medaluno = new double[pss];
      double porc = 0;
      int aprovados = 0;
      double medaprovad = 0;
      String maiormedia = "";
      boolean temAprovados = false;
      double maiorNota;
      
      for(int i=0;i<pss;i++){
          System.out.printf("Digite os dados da %d pessoa:\n", i+1);
          System.out.print("Nome:");
          nome[i] = ler.nextLine();
          System.out.print("Nota Etapa 1:");
          nota1[i] = ler.nextDouble();
          System.out.print("Nota Etapa 2:");
          nota2[i] = ler.nextDouble();
          ler.nextLine();
          medaluno[i] = (nota1[i]+nota2[i])/2;
    }
      System.out.print("\n##TABELA##\n");
      for(int i=0;i<pss;i++){
          System.out.printf("%s, %.2f, %.2f, MEDIA = %.2f\n",nome[i],nota1[i],nota2[i],medaluno[i]);
      }
      System.out.print("\n##APROVADOS##\n");
      for(int i=0;i<pss;i++){
          if(medaluno[i]>=70){
              System.out.printf("%s\n", nome[i]);
              porc ++;
              medaprovad += medaluno[i];
              aprovados ++;
              temAprovados = true;
          }
      } 
      maiorNota = medaluno[0];
      for(int i=0;i<pss;i++){
          if(medaluno[i]>=maiorNota){
              maiorNota = medaluno[i];
              maiormedia = nome[i];
          }
      }
      porc = (porc*100)/pss;
      medaprovad /= aprovados;
      System.out.printf("\nPorcentagem de aprovação: %.2f\n", porc);
      System.out.printf("Maior média: %s\n", maiormedia);
      if(!temAprovados){
          System.out.print("Não há candidatos aprovados\n");
      }else{
           System.out.printf("Nota média dos aprovados: %.2f\n", medaprovad);
      }
    }
    
}
