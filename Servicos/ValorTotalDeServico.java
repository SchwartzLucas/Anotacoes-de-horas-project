package Servicos;

public class ValorTotalDeServico{
        private Double valorACobrar;
        private Double HorasTrabalhadas;
        private  Double valorHoras;
    
        public ValorTotalDeServico() {
        }
    
        public ValorTotalDeServico(Double HorasTrabalhadas, Double valorHoras){
            this.HorasTrabalhadas = HorasTrabalhadas;
            this.valorHoras = valorHoras;
        }
    
        public Double getHorasTrabalhadas() {
            return HorasTrabalhadas;
        }
        public Double getValorHoras() {
            return valorHoras;
        }
    
        public void setHorasTrabalhadas(Double HorasTrabalhadas) {
            this.HorasTrabalhadas = HorasTrabalhadas;
        }
        public void setValorHoras(Double valorHoras) {
            this.valorHoras = valorHoras;
        }
    
        public Double CalculoDoPreco(){
            Double qtdServico = this.HorasTrabalhadas;
            Double valorHoras = this.valorHoras;
    
            this.valorACobrar =  qtdServico * valorHoras;
    
            return valorACobrar;
        }    
    }
    


