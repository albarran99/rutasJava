package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;



public class Ejercicio4 {

    private static Logger log = LoggerFactory.getLogger(Ejercicio4.class);

    private static void crateTmpDir(String dir) {
        File folder = new File("/tmp/" + dir);
        folder.mkdir();
    }

    public  static void createTmpFile(String dir, String fileName) throws IOException {
        File file = new File("/tmp/" + dir + fileName);
        file.createNewFile();
    }

    public static void main(String[] args) throws IOException {
        try {
            log.info("creando directorio d1... ");
            crateTmpDir("d1");
            log.info("Creando fichero f11.txt....");
            createTmpFile("d1", "f11.txt");
            log.info("creando directorio d2... ");
            crateTmpDir("d2");
            log.info("Creando fichero f22.txt....");
            createTmpFile("d2", "f22.txt");
        }catch (IOException e) {
            log.error("ha habid un error al intertar crea una carpeta o archivo", e);
        }



    }


}
