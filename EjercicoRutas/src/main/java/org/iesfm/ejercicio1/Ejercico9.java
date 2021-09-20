package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class Ejercico9 {

    private static final Logger log = LoggerFactory.getLogger(Ejercicio7.class);

    public static void main(String[] args) {
        File file = new File(args[0]);

        readFile(file);
    }

    public static void readFile(File folder) {
        for (File file : folder.listFiles()) {
            log.info("el nombre es " + file.getName());
            if (file.isDirectory()) {
                log.info("es un directorio");
            } else if (file.isFile()) {
                log.info("es un archivo");
            }
            log.info("el tamaño de el archivo " + file.length());
        }
    }
}
