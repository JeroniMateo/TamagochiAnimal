package app.p0.data;

public class Status extends LiveBeing{
private Integer points;
private Integer initialPoints;
private Integer lvl;

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
}
