package ec.edu.epn.tdd.reporte;

public class ReporteTurno {
    public int calcularEfectivo(int cien, int cincuenta, int veinte, int diez, int cinco, int uno) {
        return cien*100 + cincuenta*50 + veinte*20 + diez*10 + cinco*5 + uno*1;
    }

    public double calcularMonedas(int uno, int cincuenta, int veinticinco, int diez, int cinco, int centavo) {
        return uno*1 + cincuenta*0.5 + veinticinco*0.25 + diez*0.1 + cinco*0.05 + centavo*0.01;
    }
}
