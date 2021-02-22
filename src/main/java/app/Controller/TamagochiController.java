package app.Controller;

import app.p0.data.*;
import app.service.GameService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TamagochiController {


    /**
     * Check it works perfectly
     *
     * @param
     * @rel Logg = LoggerFactory.getLogger(this.getClass());
     * https://www.codejava.net/frameworks/spring-boot/spring-boot-hello-world-restful-web-services-tutorial GUIA DEFINITIVA
     * tacata
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