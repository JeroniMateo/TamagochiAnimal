package app.p0.data;

import java.lang.reflect.Type;

public class UserAction {
    private String username;
    private Integer startPoints;
    private Integer points;
    private Type tamagochi;

    public UserAction(Integer startPoints, Type tamagochi) {
        this.startPoints = startPoints;
        this.tamagochi = tamagochi;
    }
    public Type getTamagochi() {
        return tamagochi;
    }

    public void setTamagochi(Type tamagochi) {
        this.tamagochi = tamagochi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getStartPoints() {
        return startPoints;
    }

    public void setStartPoints(Integer startPoints) {
        startPoints = startPoints;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
