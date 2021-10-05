package introduction;

import java.util.logging.Logger;

public class HelloWorld {

    public static Logger log = Logger.getLogger("name");

    public static void main(String [ ] args) {
        System.out.println("Hello! Witaj!");

        log.info("message");

    }
}