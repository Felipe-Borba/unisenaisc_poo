/* Relogio.java
   Classe que representa um relógio com hora, minuto e segundo. */

public class Relogio {
    private int segundos; // número de segundos depois da meia-noite
    
    public Relogio(int hora, int minuto, int segundo) {
	setHora(hora);
	setMinuto(minuto);
	setSegundo(segundo);
    }

    // continua no próximo slide
    /* Acrescenta ao número de segundos a diferença entre a hora armazenada 
       e a nova hora */
    public void setHora(int hora) {
	int h = (hora >= 0 && hora <= 23 ? hora : 0);

	this.segundos += (h - getHora()) * 3600;
    }

    /* Retorna o número de horas completas, fazendo a divisão inteira
       do número de segundos por 3600 (60 minutos * 60 segundos) */
    public int getHora() {
	return this.segundos / 3600;
    }

    // continua no próximo slide
    public void setMinuto(int minuto) {
	int m = (minuto >= 0 && minuto <= 59 ? minuto : 0);

	this.segundos += (m - getMinuto()) * 60;
    }

    public int getMinuto() {
	return (this.segundos % 3600) / 60;
    }

    // continua no próximo slide
    public void setSegundo(int segundo) {
	int s = (segundo >= 0 && segundo <= 59 ? segundo : 0);

	this.segundos += (s - getSegundo());
    }

    public int getSegundo() {
	return (this.segundos % 3600) % 60;
    }

    public String toString() {
	return String.format("%02d:%02d:%02d",
			     getHora(),
			     getMinuto(),
			     getSegundo());
    }
} // fim da classe Relogio
