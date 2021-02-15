package app.p0.data;

import app.p0.data.IActions;

import java.util.Date;

/*TODO Genera una clase abstracta LifeBeing. all juguete de tu aplicación será
un LifeBeing, así podrás conectar tantos tipos de figuras como quieras:
Tamagochi, Pokemo, Gijoe.. Tu Lifebeing debe extender la interfaz IActions
y contener un status. También debe extender la interfaz IRender. Puede
implementar los métodos que consideres.*/

public abstract class LifeBeing implements IActions,IRender {
    private String soulKind;
    private Integer age;
    private Date bornDate;
    private String name;
    private Double weight;
//debe contener un status extendemos de status?

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

    public abstract void getCurrentActions();
}
