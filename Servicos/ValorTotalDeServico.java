package Servicos;

import java.util.ArrayList;

public class ValorTotalDeServico{

        // PARAMETROS
        private Double valorACobrar;
        private Double HorasTrabalhadas;
        private Double valorHoras;
        private ArrayList<String> PecasCompradas = new ArrayList<>();
        private ArrayList<Double> valorPecasCompradas = new ArrayList<>();
        private ArrayList<Double> QuantidadeDePecas = new ArrayList<>();
        private String DescricaoDoServicoPrestado;
    
        //Construtores
        public ValorTotalDeServico() {
        }
    
        public ValorTotalDeServico(Double HorasTrabalhadas, Double valorHoras){
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
        public void setValorPecasCompradas(ArrayList<Double> valorPecasCompradas) {
            this.valorPecasCompradas = valorPecasCompradas;
        }
        public void setDescricaoDoServicoPrestado(String descricaoDoServicoPrestado) {
            this.DescricaoDoServicoPrestado = descricaoDoServicoPrestado;
        }
        public void setQuantidadeDePecas(ArrayList<Double> quantidadeDePecas) {
            QuantidadeDePecas = quantidadeDePecas;
        }

        

        // MÉTODOS
        public Double CalculoDoPreco(Double qtdHorasTrabalhadas, Double valorDasHoras, Double[] valorDasPecasCompradas){
            qtdHorasTrabalhadas = this.HorasTrabalhadas;
            valorDasHoras = this.valorHoras;
    
            this.valorACobrar =  qtdHorasTrabalhadas * valorDasHoras;
    
            return valorACobrar;
        }
        
        // RETORNO
        @Override
        public String toString() {
        return "Valor total a ser cobrado pelos serviços: R$" + valorACobrar;
        }
    }
    


