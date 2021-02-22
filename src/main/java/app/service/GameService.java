package app.service;

import app.p0.data.*;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class GameService{
    //https://www.geeksforgeeks.org/abstract-classes-in-java/
        /* Contendrá un atributo único denominado UserActions que se almacenará
        como una lista de acciones de tipo UserAction.*/
    private static final List<UserAction> userActions=new ArrayList<>();
    public static final Integer MAX_POINTS = 100;

    /*Contendrá un atributo único denominado maxPoints. */
//TODO MAXPOINTS es constante! Tendrá siempre el valor de 100! Darle vueltas! PROBARLO EN TEST PRIMERO!!!!


    /* Contendrá un atributo único denominado currentLifeBeing, que será la
    instancia única a la que los usuarios están interactuando*/
    private static Tamagochi currentLifeBeing;

    /*getUserActions: devuelve un listado de todos los cambios que se han
    intentado hacer desde el inicio del juego */

    public static List<UserAction> getUserActions() {
        return userActions;

    }


    /*doAction(Action): generará un cambio en el status del LifeBeing. Este
    cambio vendrá dado por la lógica que tu consideres.*/

    public static LifeBeing doAction(Actions action){
        UserAction ua = new UserAction();
        //Status s = currentLifeBeing.getStatus();
        //s.getPoints(); es lo mismo que linea 42
        ua.setInitialPoints(currentLifeBeing.getStatus().getPoints());
        if (!getStatus().isDead()){
            if (Actions.CLEAN.equals(action)) {
                currentLifeBeing.doCleanIt();
            }
            if (Actions.SEX.equals(action)) {
                currentLifeBeing.doSex();
            }
            if (Actions.DIE.equals(action)) {
                currentLifeBeing.doDie();
            }
            if (Actions.POOP.equals(action)) {
                currentLifeBeing.doPoop();
            }
            if (Actions.SLEEP.equals(action)) {
                currentLifeBeing.doSleep();
            }
            if (Actions.ILLNESS.equals(action)) {
                currentLifeBeing.doIllness();
            }
            if (Actions.PLAY.equals(action)) {
                currentLifeBeing.doPlay();
            }
            if (Actions.WALK.equals(action)) {
                currentLifeBeing.doWalk();
            }
            if (Actions.FEED.equals(action)) {
                currentLifeBeing.doFeed();
            }
        }

        ua.setCurrentPoints(currentLifeBeing.getStatus().getPoints());
        ua.setLifeBeing(currentLifeBeing);
        ua.setAction(action);

        userActions.add(ua);

        return currentLifeBeing;
    }

    public static LifeBeing newLifeBeing(){
        currentLifeBeing = new Tamagochi();
        currentLifeBeing.getStatus().setPoints(MAX_POINTS);
        return currentLifeBeing;
    }

    /*TODO resetLifeBeing(…): reiniciará el lifeBeing. No modifica las acciones
    realizadas ya que es una nueva accion. Reiniciar reinicia pero creo que falta chicha!? Probarlo en test!!!!!*/
    //
    public static LifeBeing resetLifeBeing(){
            currentLifeBeing = new Tamagochi();
            currentLifeBeing.getStatus().setPoints(MAX_POINTS);
            return currentLifeBeing;
        }

    /*render: devuelve el renderizado del LifeBeing como creas necesario */

    public static String render(RenderType renderType){
        return currentLifeBeing.doRender(renderType);
    }
    /*getStatus: devuelve el status del LifeBeing*/
    public static Status getStatus(){
        return currentLifeBeing.getStatus();
    }
        /*getActions: devuelve un listado de acciones que se pueden hacer en este
    momento. Recuerda que el listado puede variar del momento en el que se
    encuentra el LifeBeing */
    public static Actions[] getActions(){
        return currentLifeBeing.getCurrentActions();
    }

}







