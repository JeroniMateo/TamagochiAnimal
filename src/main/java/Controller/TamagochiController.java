package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import p0.Abstracto.IActions;

public class TamagochiController {
    /**
     * Check it works perfectly
     *
     * @param uuid
     * @rel Logg = LoggerFactory.getLogger(this.getClass());
     * /*
     */
    @RequestMapping(value = "/get/{uuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegisterItem>> getRegisterById(@PathVariable IActions uuid) {
        try {
            return new ResponseEntity<>(analysisService.getDataRegisterById(uuid), HttpStatus.OK);
        } catch (Exception e) {
            log.error("register:get/", e);
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = /rest/do/{IActions})

    @RequestMapping(value = /rest/getCurrentStatus)

    @RequestMapping(value = /rest/getStats)

    @RequestMapping(value = /rest/render/{mode})

    @RequestMapping(value = /rest/new)

    @RequestMapping(value = /rest/getActions)
}