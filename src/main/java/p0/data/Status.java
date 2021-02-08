package p0.data;

import p0.Abstracto.IActions;
import p0.Abstracto.LifeBeing;
import p0.Abstracto.RenderType;


public class Status extends LifeBeing implements IActions {
private Integer healthPoints;
private Integer points;
private Actions currentAction;

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Actions getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(Actions currentAction) {
        this.currentAction = currentAction;
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
    public String doRender(RenderType renderType) {
        return null;
    }

    }

