package p0.Abstracto;

public class Tamagochi extends LifeBeing implements IActions {
    private TamaType tamaType;

    public Tamagochi(TamaType tamaType) {
        this.tamaType = tamaType;
    }

    public TamaType getTamaType() {
        return tamaType;
    }

    public void setTamaType(TamaType tamaType) {
        this.tamaType = tamaType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
