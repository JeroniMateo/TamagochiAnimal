package p0.Abstracto;

import org.apache.commons.lang3.StringUtils;
import p0.data.Actions;
import p0.data.Status;

import java.util.List;

public class Tamagochi extends LifeBeing implements IActions {
    private TamaType tamaType;
private Status status;
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
    public List<Actions> getCurrentActions() {
        if (status.getCurrentActions().equals(Actions.PLAY));
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
        String rtn = StringUtils.EMPTY;
        switch (renderType){
            case CONSOLE:
                System.out.println(String.format("Tamagochi: %s","Pepito"));
                break;
            case HTML:
                rtn = String.format("<div>%s</div>","Pepito");
                break;
            case JSON:
                rtn = String.format("Tamagochi:","Pepito");
                break;
            default:
                //rtn = JSONObject.toJSONString();
                break;
        }
        return rtn;
    }

    @Override
    public List<Actions> getCurrentActions() {
        return null;
    }
}
