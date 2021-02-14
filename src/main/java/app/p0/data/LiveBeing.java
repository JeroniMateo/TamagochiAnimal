package app.p0.data;

public abstract class LiveBeing {
    public abstract void doFeed();

    public abstract void doCleanIt();

    public abstract void doWalk();

    public abstract void doPlay();

    public abstract void doIllness();

    public abstract void doSex();

    public abstract void doDie();

    public abstract void doSleep();

    public abstract String render(RenderType renderType);
}
