package app.unittesting;

import app.p0.data.Actions;
import app.service.GameService;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
public class TamagochiTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    //PRIMER Y SEGUNDO TEST FUNCIONAN.
    @Test
    void addAction() {
        GameService gameService = new GameService();
        GameService.doAction(Actions.CLEAN);
        log.info(gameService.toString());
        GameService.doAction(Actions.FEED);
        log.info(gameService.toString());
        Assert.notNull(gameService, "La acción es nula!");
    }

    @Test
    void enumActions() {
        Actions actions = Actions.CLEAN;
        log.info(String.format("El valor del enum es %s", actions));
        String txt = "FEED";
        Actions.valueOf(txt);
        Assert.notNull(actions, "Accion Incorrecta");

    }
    //revisar test

    //random name //https://www.baeldung.com/java-random-string
    @Test
    public void givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect() {
        String generatedString = RandomStringUtils.randomAlphabetic(10);
        System.out.println(generatedString);
    }


}


