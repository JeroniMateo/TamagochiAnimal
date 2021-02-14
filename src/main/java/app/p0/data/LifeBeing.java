package app.p0.data;

import app.p0.data.IActions;

import java.util.Date;

public abstract class LifeBeing implements IActions {
    private String soulKind;
    private Integer age;
    private Date bornDate;
    private String name;
    private Double weight;


    public String getSoulKind() {
        return soulKind;
    }

    public void setSoulKind(String soulKind) {
        this.soulKind = soulKind;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
}
