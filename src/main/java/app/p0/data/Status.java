package app.p0.data;


/*Genera una clase Status. El status es el estado del LifeBeing, puedes anotar
tantos detalles como quieras, o simplemente un número de puntos. */
public class Status {
    //le aplicamos el numero de puntos. En este caso el tamagochi empezará con 50 Integer points!
    private Integer points=50;

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
    }

}
