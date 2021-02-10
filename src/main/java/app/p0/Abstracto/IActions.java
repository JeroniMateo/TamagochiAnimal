package app.p0.Abstracto;

public interface IActions {
    public void doFeed();
    public void doCleanIt();
    public void doWalk();
    public void doPlay();
    public void doIllness();
    public void doSex();
    public void doDie();
    public void doSleep();
    public String render(RenderType renderType);
}
