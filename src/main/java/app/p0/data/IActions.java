package app.p0.data;

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

    public default void getCurrentActions(IActions actions) {

    }
}
