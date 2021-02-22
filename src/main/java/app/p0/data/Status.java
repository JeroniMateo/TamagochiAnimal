package app.p0.data;


/*Genera una clase Status. El status es el estado del LifeBeing, puedes anotar
tantos detalles como quieras, o simplemente un número de puntos. */
public class Status {

    private Integer points;
    private boolean dead = false;

//getters y setters
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    //Aquí se sumarán o se restarán los puntos con el metodo operarPuntos
    public void operarPuntos(Integer add) {
        this.points += add;
        if (this.points <= 0 ) {
            points = 0;
            dead = true;
        }
        if (this.points >= 100){
            points = 100;
        }
    }

    public boolean isDead(){
        return this.dead;
    }

}
