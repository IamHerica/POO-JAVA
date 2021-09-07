import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    public int dia;
    public int mes;
    public int ano;
    public String estacao;
    public String month;

    Date d = new Date();
    Calendar calendar = new GregorianCalendar();



    public Data(int day, int month, int year) {

        if (day <= 31 && day >= 1) {
            this.dia = day;
        } else {
            this.dia = 0;
        }
        if (month >= 1 && month <= 12) {
            this.mes = month;
        } else {
            this.mes = 0;
        }
        this.ano = year;
    }

    public Data() {
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void apresentaData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void avancadata() {

        this.dia += 1;
        if (this.dia > 31) {
            this.mes += 1;
        }
        if (this.dia > 31) {
            this.dia = 1;
        }

    }
    public void apresentarDataCompleta() {
        if (this.mes <= 2 || this.mes == 12) {
            estacao = "verao";
        }
        if (this.mes >= 3 && this.mes <= 5) {
            estacao = "Outono";
        }
        if (this.mes >= 6 && this.mes <= 8) {
            estacao = "Inverno";
        }
        if (this.mes >= 9 && this.mes <= 11) {
            estacao = "Primavera";
        }

        switch (this.mes) {
            case 1 -> month = "janeiro";
            case 2 -> month = "fevereiro";
            case 3 -> month = "marco";
            case 4 -> month = "abril";
            case 5 -> month = "maio";
            case 6 -> month = "junho";
            case 7 -> month = "julho";
            case 8 -> month = "agosto";
            case 9 -> month = "setembro";
            case 10 -> month = "outubro";
            case 11 -> month = "novembro";
            case 12 -> month = "dezembro";
        }

        System.out.println(dia + "-" + month + "-" + ano + "\nEstamos na estacao: " + estacao);
    }
}
