package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class Ejecicio6 {

    private static final Logger log = LoggerFactory.getLogger(Ejecicio6.class);

    public static void main(String[] args) {

        if (args.length == 0) {
            log.error("debe haber argumentos");
        } else {
            File folder = new File(args[0]);
            filesInfo(folder);

        }
    }

    public static void filesInfo(File fileCheck) {

        if (fileCheck.exists()) {
            log.info("el nombre es " + fileCheck.getName());

            log.info("Su ruta es " + fileCheck.getAbsolutePath());

            log.info("Tamaño de el archivo " + fileCheck.length());

            if (fileCheck.isDirectory()) {
                log.info("Es un Directorio");

            } else if (fileCheck.isFile()) {
                log.info("Es un Archivo");
            }

            log.info(("Ultima vez modificado " + fileCheck.lastModified()));

            if (fileCheck.canExecute()) {
                log.info("se puede ejecutar");
            } else {
                log.info("no se puede ejecutar");
            }

            if (fileCheck.canRead()) {
                log.info("se puede ver el archivo");
            } else {
                log.info("no se puede ver el archivo");
            }

            if (fileCheck.canWrite()) {
                log.info("se puede modificar el archivo");
            } else {
                log.info("no se puede modificar el archivo");
            }
        } else {
            log.error("no existe el archivo");
        }

    }

}


