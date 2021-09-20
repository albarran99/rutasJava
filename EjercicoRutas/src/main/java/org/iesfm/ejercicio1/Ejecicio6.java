package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class Ejecicio6 {

    private static final Logger log = LoggerFactory.getLogger(Ejecicio6.class);

    public static void main(String[] args) {
        File file = new File(args[0]);

        filesInfo(file);
    }

    public static void filesInfo(File fileCheck) {

        log.info(fileCheck.getName());

        log.info(fileCheck.getAbsolutePath());

        fileCheck.length();

        if(fileCheck.isDirectory()) {
            System.out.println("Es un Directorio");
        } else {
            fileCheck.isFile();
            System.out.println("Es un Archivo");
        }

        if(fileCheck.canExecute()) {
            log.info("se puede ejecutar");
        } else {
            log.info("no se puede ejecutar");
        }

        if(fileCheck.canRead()) {
            log.info("se puede ver el archivo");
        }else {
            log.info("no se puede ver el archivo");
        }

        if(fileCheck.canWrite()) {
            log.info("se puede modificar el archivo");
        } else {
            log.info("no se puede modificar el archivo");
        }
    }

}
