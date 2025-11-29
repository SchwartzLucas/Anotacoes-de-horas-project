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

            if(resposta == "s"){
                String pecaComprada;
                String ValorPecaComprada;
                String QuantidadePecaComprada;
                do { 
                    System.out.println("O que foi comprado? ");
                    pecaComprada = sc.nextLine();
                    valorTotal.setPecasCompradas();
                } while (true);
            }
            
            Double[] var = {2.3,1.0};

            valorTotal.CalculoDoPreco(horasTrabalhadas, valorTotal.getValorHoras(), var);
            System.out.println(valorTotal);
                
        } catch (Exception e) {
        }
    }
}