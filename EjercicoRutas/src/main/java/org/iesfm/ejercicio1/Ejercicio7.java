package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class Ejercicio7 {

    private static final Logger log = LoggerFactory.getLogger(Ejercicio7.class);

    public static void main(String[] args) {
        File file = new File(args[0]);

        readPermits(file);
        modifyPermits(file);
    }

    public static void readPermits(File checkFile) {

        if(checkFile.canRead() && checkFile.canExecute()) {
            log.info("si tiene permisos de ejecucion");
            log.info("si tiene permisos de lectura");
        } else {
            log.info("no tiene permisos de ejecucion ni de lectura");
        }
    }

    public static void modifyPermits(File checkFile) {
        log.info("Cambiando permiso de ejecucion" + checkFile.setExecutable(false));
        log.info("Cambiando permiso de lectura" + checkFile.setReadable(false));

    }
}
