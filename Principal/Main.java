package Principal;

import Servicos.ValorTotalDeServico;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        try {
            ValorTotalDeServico valorTotal = new ValorTotalDeServico();
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantas horas foram trabalhadas? ");
    
            String resposta = sc.nextLine();
    
            Double horasTrabalhadas = Double.valueOf(resposta);
            valorTotal.setHorasTrabalhadas(horasTrabalhadas);
            valorTotal.setValorHoras(75.00);
    
            System.out.println("Algum gasto com pecas? (S/N)");
            resposta = sc.nextLine().toLowerCase();

            if("s".equals(resposta)){
                String pecaComprada;
                Double ValorPecaComprada;
                Double QuantidadePecaComprada;

                String menu;
                do { 
                    System.out.println("O que foi comprado? ");
                    pecaComprada = sc.nextLine();
                    valorTotal.setPecasCompradas(pecaComprada);
                    
                    System.out.println("Qual o valor da peça? ");
                    ValorPecaComprada = sc.nextDouble();
                    valorTotal.setValorPecasCompradas(ValorPecaComprada);
                    
                    System.out.println("Qual a quantidade comprada? ");
                    QuantidadePecaComprada = sc.nextDouble();
                    valorTotal.setQuantidadeDePecas(QuantidadePecaComprada);

                    System.out.println("Para Encerrar digite 'N', para continuar adicionando digite 'S'");
                    menu = sc.nextLine().toLowerCase();

                } while ("s".equals(menu));
            }
            

            valorTotal.CalculoDoPreco(horasTrabalhadas, valorTotal.getValorHoras(), valorTotal.getValorPecasCompradas(), valorTotal.getQuantidadeDePecas());
            System.out.println(valorTotal);
                
        } catch (Exception e) {
        }
    }
}