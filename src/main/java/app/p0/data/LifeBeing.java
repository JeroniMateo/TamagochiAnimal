package app.p0.data;

import app.p0.data.IActions;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/*Genera una clase abstracta LifeBeing. al juguete de tu aplicación será
un LifeBeing, así podrás conectar tantos tipos de figuras como quieras:
Tamagochi, Pokemo, Gijoe.. Tu Lifebeing debe extender la interfaz IActions
y contener un status. También debe extender la interfaz IRender. Puede
implementar los métodos que consideres.*/

public abstract class LifeBeing implements IActions, IRender {
    private Date bornDate;
    private String name;
    //Status es como Bank de los ejercicios
    private Status status;


    //Constructor que te da un nuevo status y nueva fecha de nacimiento del LifeBeing
    public LifeBeing() {
        status = new Status();
        bornDate = new Date();
        name=getName();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


//TODO generamos un nombre aleatorio FALTA QUE NO SE REPITA SI SIGUE VIVO!!!!
    public String getName() {
        name = RandomStringUtils.randomAlphabetic(6);
        return name;
    }

//No lo hemos utilizado
    public void setName(String name) {
        this.name = name;
    }



    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
//Por tema herencia no sería necesario aplicar en tamagochi los metodos de la interfaz a no ser que tengamos mas bichos....

    public void doFeed() {
        status.operarPuntos(20);
    }

    public void doCleanIt() {
        status.operarPuntos(10);
    }

    public void doWalk() {
        status.operarPuntos(10);
    }

    public void doPlay() {
        status.operarPuntos(10);
    }

    public void doIllness() {
        status.operarPuntos(-50);
    }

    public void doSex() {
        status.operarPuntos(100);
    }

    public void doDie() {
        status.operarPuntos(-100);
    }


    public void doSleep() {
        status.operarPuntos(10);
    }

    public void doPoop() {
        status.operarPuntos(-30);
    }
//render de consola y otras cosas ESTA EN POKEMON!
   public String doRender(RenderType renderType) {
        String rtn = StringUtils.EMPTY;
        switch (renderType) {
            case CONSOLE:
                System.out.println(String.format(
                        "Born:" + bornDate.toString() +
                                "Points:" + status.getPoints() +
                                "Name: " + getName()));
                break;
            case HTML:
                rtn= String.format("<html>" +
                        "<body>" +
                        "<p>Name:" + getName() + "</p>" +
                        "<p>Points:" + status.getPoints() + "</p>" +
                        "<p>Born:" + bornDate.toString() + "</p>" +
                        "</body>" +
                        "</html>");
            break;
            default:
                //creo un JSON con nombre, puntos y born por defecto
               rtn= String.format(
                       "{" +
                               "name:" + getName() + "," +
                               "points:" + status.getPoints() + "," +
                               "born:" + bornDate.toString() +
                               "}");
            break;
        }

return rtn;
    }
}



