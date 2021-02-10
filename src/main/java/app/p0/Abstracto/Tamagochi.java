package app.p0.Abstracto;

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
    public String render(RenderType renderType) {
        return null;
    }
}
