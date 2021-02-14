package app.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.logging.ErrorManager;

@RestController
public class TamagochiController {


    /**
     * Check it works perfectly
     *
     * @param uuid
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
    @RequestMapping(value = "/rest/do/{IActions}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegisterItem>> getRegisterById(@PathVariable IActions uiid) {
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


    @RequestMapping(value = "/rest/do/{action}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String doAction(@PathVariable String action) {
        return action;
    }

    @RequestMapping(value = "/rest/getCurrentStatus",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCurrentStatus() {
        return "me siento bien, gracias";
    }


   @RequestMapping(value = "/rest/getCurrentStatus")

    @RequestMapping(value = "/rest/getStats")

    @RequestMapping(value = "/rest/render/{mode}")

    @RequestMapping(value = "/rest/new")

    @RequestMapping(value = "/rest/getActions")
*/}