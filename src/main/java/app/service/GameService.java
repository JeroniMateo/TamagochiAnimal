package app.service;

import app.p0.data.LifeBeing;
import app.p0.data.Tamagochi;
import app.p0.data.UserAction;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    /* Contendrá un atributo único denominado UserActions que se almacenará
como una lista de acciones de tipo UserAction.*/
private static final List<UserAction> userActions= new ArrayList<>();
/*Contendrá un atributo único denominado maxPoints. */
private Integer MaxPoints;
/*TODO Contendrá un atributo único denominado currentLifeBeing, que será la
instancia única a la que los usuarios están interactuando*/
LifeBeing currentLifeBeing=new Tamagochi();

/*TODO doAction(Action): generará una cambio en el status del LifeBeing. Este
cambio vendrá dado por la lógica que tu consideres.*/

public void doAction(Action action){}

/*resetLifeBeing(…): reiniciará el lifeBeing. No modifica las acciones
realizadas ya que es una nueva accion Aqui podemos poner: if tamagochi die, revivir*/

public void reseLifeBeing(){}

/*TODO render: devuelve el renderizado del LifeBeing como creas necesario */

/*todo getStatus: devuelve el status del LifeBeing*/

/*todo getActions: devuelve un listado de acciones que se pueden hacer en este
momento. Recuerda que el listado puede variar del momento en el que se
encuentra el LifeBeing */

/*todo getUserActions: devuelve un listado de todos los cambios que se han
intentado hacer desde el inicio del juego */

}
