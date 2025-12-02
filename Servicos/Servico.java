package Servicos;

import Clientes.Clientes;
import java.util.ArrayList;

// COLOCAR PARAMETRO DE DATA (fazer vincular: cliente, data, descrição servico os valores totais e de peças (caso tenha)).

public class Servico{

        // PARAMETROS
        private int ID;
        private Double valorACobrar;
        private Double HorasTrabalhadas;
        private Double valorHoras;
        private ArrayList<String> PecasCompradas = new ArrayList<>();
        private ArrayList<Double> valorPecasCompradas = new ArrayList<>();
        private ArrayList<Double> QuantidadeDePecas = new ArrayList<>();
        private String DescricaoDoServicoPrestado;
        private Clientes ClienteVisitado;
    
        //Construtores
        public Servico() {
        }
    
        public Servico(Double HorasTrabalhadas, Double valorHoras){
            this.HorasTrabalhadas = HorasTrabalhadas;
            this.valorHoras = valorHoras;
        }
        
        // GETS
        public Double getHorasTrabalhadas() {
            return HorasTrabalhadas;
        }
        public Double getValorHoras() {
            return valorHoras;
        }
        public ArrayList<String> getPecasCompradas() {
            return PecasCompradas;
        }
        public ArrayList<Double> getValorPecasCompradas() {
            return valorPecasCompradas;
        }
        public String getDescricaoDoServicoPrestado() {
            return DescricaoDoServicoPrestado;
        }
        public ArrayList<Double> getQuantidadeDePecas() {
            return QuantidadeDePecas;
        }

        // SETS
        public void setHorasTrabalhadas(Double HorasTrabalhadas) {
            this.HorasTrabalhadas = HorasTrabalhadas;
        }
        public void setValorHoras(Double valorHoras) {
            this.valorHoras = valorHoras;
        }
        public void setPecasCompradas(String pecasCompradas) {
            this.PecasCompradas.add(pecasCompradas);
        }
        public void setValorPecasCompradas(Double valorPecasCompradas) {
            this.valorPecasCompradas.add(valorPecasCompradas);
        }
        public void setDescricaoDoServicoPrestado(String descricaoDoServicoPrestado) {
            this.DescricaoDoServicoPrestado = descricaoDoServicoPrestado;
        }
        public void setQuantidadeDePecas(Double quantidadeDePecas) {
            this.QuantidadeDePecas.add(quantidadeDePecas);
        }
        public void setClienteVisitado(Clientes ClienteVisitado) {
            this.ClienteVisitado = ClienteVisitado;
        }
                

        // MÉTODOS
        public Double CalculoDoPreco(Double qtdHorasTrabalhadas, Double valorDasHoras, ArrayList<Double> valorDasPecasCompradas, ArrayList<Double> quantidadeDePecasCompradas){
            Double resultado = 0.0;
            qtdHorasTrabalhadas = this.HorasTrabalhadas;
            valorDasHoras = this.valorHoras;

            if(!valorDasPecasCompradas.isEmpty() && !quantidadeDePecasCompradas.isEmpty()){
                for(int i = 0; i < valorDasPecasCompradas.size(); i++){
                    resultado += valorDasPecasCompradas.get(i) * quantidadeDePecasCompradas.get(i);
                }
            }
    
            this.valorACobrar =  (qtdHorasTrabalhadas * valorDasHoras) + resultado;
    
            return valorACobrar;
        }

        
        // RETORNO
        @Override
        public String toString() {
        return "Valor total a ser cobrado pelos serviços: R$" + valorACobrar;
        }

    }
    


