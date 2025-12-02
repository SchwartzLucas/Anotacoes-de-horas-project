package Principal;

import Servicos.Servico;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        try {
            Servico valorTotal = new Servico();
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantas horas foram trabalhadas? ");
    
            String resposta = sc.nextLine();
    
            Double horasTrabalhadas = Double.valueOf(resposta);
            valorTotal.setHorasTrabalhadas(horasTrabalhadas);
            valorTotal.setValorHoras(75.00);
    
            System.out.println("Algum gasto com pecas? (S/N)");
            resposta = sc.nextLine().toLowerCase();

            if("s".equals(resposta)){

                String menu = "s";
                while ("s".equals(menu.toLowerCase())){
                    System.out.println("O que foi comprado? ");
                    valorTotal.setPecasCompradas(sc.nextLine());
                    
                    System.out.println("Qual o valor da peça? ");
                    valorTotal.setValorPecasCompradas(Double.parseDouble(sc.nextLine()));
                    System.out.println("Valor das peças: " + valorTotal.getValorPecasCompradas());
                    
                    System.out.println("Qual a quantidade comprada? ");
                    valorTotal.setQuantidadeDePecas(Double.parseDouble(sc.nextLine()));
                    System.out.println("Quantidade de peças: " + valorTotal.getQuantidadeDePecas());

                    System.out.println("Para Encerrar digite 'N', para continuar adicionando digite 'S'");
                    menu = sc.nextLine();
                }
            }
            

            valorTotal.CalculoDoPreco(horasTrabalhadas, valorTotal.getValorHoras(), valorTotal.getValorPecasCompradas(), valorTotal.getQuantidadeDePecas());
            System.out.println(valorTotal);
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}