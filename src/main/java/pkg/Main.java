package pkg;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.error("This is an ERROR message");
        Logger.warn("This is a WARN message");
        Logger.info("This is an INFO message");
        Logger.debug("This is an DEBUG message");
        Logger.trace("This is a TRACE message");
        Logger.info("User's name is {}", System.getProperty("user.name"));//paraméteres modszer az ajánlott
       // Logger.info("User's name is" + System.getProperty("user.name"));//költséges,mert a konkatenációnál objektum példányosítás törénik
        Logger.error(new RuntimeException("Oops"), "Something is wrong");
    }

}
