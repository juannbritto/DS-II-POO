package atividade_data;


public class Data {
    int dia, mes, ano;

    public void setData(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }else{
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
        }
}
    
    public boolean dataValida(int dia, int mes, int ano){
        if (ano < 1 || ano > 9999){
            return false;
        }
        if (mes <1 || mes > 12){
            return false;
        }
        
        int diaLimiteMes = 0;
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            diaLimiteMes=30;
        }else{
            if (mes == 2){
                if (ano % 4 == 0 && ano % 100 != 100){
                    diaLimiteMes=28;
                }else{
                    diaLimiteMes=29;
                }
            }else{
                diaLimiteMes=31;
            }
        }
        
        
        return !(dia < 1 || dia > diaLimiteMes);
    }
}
