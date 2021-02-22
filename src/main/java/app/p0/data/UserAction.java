package app.p0.data;


/*TODO Genera una clase UserAction
Esta clase representa un registro del momento en el que se ha ejecutado la action,
el tipo de juguete sobre el que se ha realizado, los puntos de inicio, y los puntos
conseguidos */


import java.util.Date;

public class UserAction {
    private Date date;
    private LifeBeing lifeBeing;
    private Integer initialPoints;
    private Integer currentPoints;
    private Actions action;

    public Actions getAction() {
        return action;
    }

    public void setAction(Actions action) {
        this.action = action;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LifeBeing getLifeBeing() {
        return lifeBeing;
    }

    public void setLifeBeing(LifeBeing lifeBeing) {
        this.lifeBeing = lifeBeing;
    }

    public Integer getInitialPoints() {
        return initialPoints;
    }

    public void setInitialPoints(Integer initialPoints) {
        this.initialPoints = initialPoints;
    }

    public Integer getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

    //con Date nos dará un registro del momento en el que se ha ejecutado la acción.
    public UserAction() {
        date = new Date();
    }
}
