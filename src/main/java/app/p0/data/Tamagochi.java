package app.p0.data;

/*Genera una clase que implemente LifeBeing y contenga un status en su
interior además de los atributos necesarios. Esta clase gestionará, según las
acciones y en el estado en el que está el número de acciones posibles.*/

public class Tamagochi extends LifeBeing implements IActions {
    private TamaGender tamaGender;

    public TamaGender getTamaGender() {
        return tamaGender;
    }

    public void setTamaGender(TamaGender tamaGender) {
        this.tamaGender = tamaGender;
    }

    /*Probabilidad en el enum para el genero
     https://www.lawebdelprogramador.com/foros/Java/1199856-Programa-de-probabilidad-de-java.html
     50% de probabilidades de que nuestro Tamagochi sea macho o Female...
      */
    public Tamagochi() {

        if (Math.random()<0.5){
            this.tamaGender=TamaGender.FEMALE;
        }else
            this.tamaGender= TamaGender.MALE;
    }

    public void doFeed() {
        getStatus().operarPuntos(20);
    }

    public void doCleanIt() {
        getStatus().operarPuntos(10);
    }

    public void doWalk() {
        getStatus().operarPuntos(10);
    }

    public void doPlay() {
        getStatus().operarPuntos(10);
    }

    public void doIllness() {
        getStatus().operarPuntos(-50);
    }

    public void doSex() {
        getStatus().operarPuntos(100);
    }

    public void doDie() {
        getStatus().operarPuntos(-100);
    }


    public void doSleep() {
        getStatus().operarPuntos(10);
    }

    public void doPoop() {
        getStatus().operarPuntos(-30);
    }

    //nos devolverá todas las acciones en un array!
    public Actions[] getCurrentActions() {
        return Actions.values();

    }


}
