package Modelo;

public class UnSegundo {

    private int horas, minutos, segundos;

    public UnSegundo() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void unSegundo(int h, int m, int s) {
        horas = h;
        minutos = m;
        segundos = s;
        if (horas == 23 && minutos == 59 && segundos == 59) {
            horas = minutos = segundos = 0;
        } else {
            if (minutos == 59 && segundos == 59) {
                horas += 1;
                minutos = 0;
                segundos = 0;
            } else {
                if (segundos == 59) {
                    minutos = minutos + 1;
                    segundos = 0;
                } else {
                    segundos++;
                }
            }
        }
    }
}
