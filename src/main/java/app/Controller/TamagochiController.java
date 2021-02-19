package app.Controller;

import app.p0.data.*;
import app.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ErrorManager;

@RestController
public class TamagochiController {


    /**
     * Check it works perfectly
     *
     * @param
     * @rel Logg = LoggerFactory.getLogger(this.getClass());
     * /*
     */
    /*  RequestMapping localhost/get/yelmetodo lo que hará este request mapping es coger el metodo
    * y devolvernos los datos.
    * List: Tiene elementos unicos. ArrayList: Una lista de elementos.
    * LinkedList: Es una lista que apunta a su elemento anterior y posterior.
    * OrderedList: Una lista ordenada.
    * SET: es una "bolsa" que puede haber objetos duplicados.
    * */
 /*
    @RequestMapping(value = "/rest/do/{uiid}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegisterItem>> getRegisterById(@PathVariable Actions uiid) {
        try {
            return new ResponseEntity<>(analysisService.getDataRegisterById(uuid), HttpStatus.OK);
        } catch (Exception e) {
            log.error("register:get/", e);
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    Para entender mejor el restController:
Como podemos ver tenemos un parametro que se llama action, si cambiamos la accion, cambiará, además se le pasa un render json
*/


/*Nos devuelve el do action de gameService */
    @RequestMapping(value = "/rest/do/{action}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LifeBeing doAction(@PathVariable Actions action) {
        return GameService.doAction(action);
    }

    @RequestMapping(value = "/rest/getCurrentStatus",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Status getCurrentStatus() {
        return GameService.getStatus();
    }

    @RequestMapping(value = "/rest/getStats")
    public List<UserAction> getStats() {
        return GameService.getUserActions();
    }

    @RequestMapping(value = "/rest/render/{renderType}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String render(@PathVariable RenderType renderType) {
        return GameService.render(renderType);
    }

    //Crearemos un nuevo lifebeing
    @RequestMapping(value = "/rest/new")
    public LifeBeing newLifeBeing() {
        return GameService.newLifeBeing();
    }

    @RequestMapping(value = "/rest/reset")
    public LifeBeing resetLifeBeing() {
        return GameService.resetLifeBeing();
    }

    @GetMapping("/getUserActions")
    public List<UserAction> getUserActions() {
        return GameService.getUserActions();
    }

    @GetMapping("/getActions")
    public Actions[] getActions() {
        return GameService.getActions();
    }
}