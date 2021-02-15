package app.p0.data;


/*TODO Genera una clase Status. El status es el estado del LifeBeing, puedes anotar
tantos detalles como quieras, o simplemente un número de puntos. */
public class Status extends LifeBeing{
private Integer points;
private Integer initialPoints;
private Integer lvl;
private String happy;
private String normal;
private String illness;
private String dead;
//Implementar el status con un atributos o implementar el estado con enums???'
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getInitialPoints() {
        return initialPoints;
    }

    public void setInitialPoints(Integer initialPoints) {
        this.initialPoints = initialPoints;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public Status(Integer points, Integer initialPoints, Integer lvl) {
        this.points = points;
        this.initialPoints = initialPoints;
        this.lvl = lvl;
    }

    @Override
    public void doFeed() {

    }

    @Override
    public void doCleanIt() {

    }

    @Override
    public void doWalk() {

    }

    @Override
    public void doPlay() {

    }

    @Override
    public void doIllness() {

    }

    @Override
    public void doSex() {

    }

    @Override
    public void doDie() {

    }

    @Override
    public void doSleep() {

    }

    @Override
    public String render(RenderType renderType) {
        return null;
    }

    @Override
    public void getCurrentActions(Actions actions) {

    }

    @Override
    public void doRender(RenderType renderType) {

    }

    @Override
    public void getCurrentActions() {

    }
}
