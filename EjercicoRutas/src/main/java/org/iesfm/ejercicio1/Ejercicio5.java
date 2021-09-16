package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class Ejercicio5 {

    private final static Logger log = LoggerFactory.getLogger(Ejercicio5.class);

    public static void main(String[] args) {
        renameAndMoveFile("/tmp/d1/f11.txt", "/tmp/d1/f12.txt");
        renameAndMoveFile("/tmp/d2/f22.txt", "/tmp/d1/f22.txt");
        deleteFolder("/tmp/d2");
    }

    public static void renameAndMoveFile(String selectedPath, String newPath) {
        File file = new File(selectedPath);
        if (file.exists()) {
            log.info("Moviendo/renombrando " + selectedPath + " a nueva ruta " + newPath);
            file.renameTo(new File(newPath));
        } else {
            log.error("no se pudo mover/renombrar archivo");
        }
    }

    public static void deleteFolder(String selectedPath) {
        File file = new File(selectedPath);
        log.info("Borrando " + selectedPath);
        if(file.exists()) {
            file.delete();
        } else {
            log.info("No se ah podido borrar " + selectedPath);
        }
    }
}
