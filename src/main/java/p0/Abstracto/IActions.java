package p0.Abstracto;

import p0.data.Actions;

import java.util.List;

public interface IActions {
    public void doFeed();
    public void doCleanIt();
    public void doWalk();
    public void doPlay();
    public void doIllness();
    public void doSex();
    public void doDie();
    public void doSleep();
    public String doRender(RenderType renderType);
    public List<Actions> getCurrentActions();
}
