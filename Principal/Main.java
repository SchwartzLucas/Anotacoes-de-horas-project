package Principal;

import java.util.Scanner;

import Servicos.ValorTotalDeServico;

public class Main{

    public static void main(String[] args){
        ValorTotalDeServico valorTotal = new ValorTotalDeServico();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas foram trabalhadas? ");
        Double horasTrabalhadas = parseDouble(sc.nextLine());
        valorTotal.setHorasTrabalhadas(horasTrabalhadas);
        
    }
}