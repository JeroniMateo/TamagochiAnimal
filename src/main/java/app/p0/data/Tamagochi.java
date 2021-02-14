package p0.Abstracto;

import app.p0.Abstracto.IActions;
import app.p0.Abstracto.LifeBeing;
import app.p0.Abstracto.TamaType;
import app.p0.data.Actions;

import java.util.List;

public class Tamagochi extends LifeBeing implements IActions {
    private TamaType tamaType;

    public Tamagochi(TamaType tamaType) {
        this.tamaType = tamaType;
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
    public String doRender(app.p0.Abstracto.RenderType renderType) {
        return null;
    }

    @Override
    public List<Actions> getCurrentActions() {
        return null;
    }

    @Override
    public void getCurrentActions() {

    }

    @Override
    public void doRender(RenderType renderType) {

    }
}

