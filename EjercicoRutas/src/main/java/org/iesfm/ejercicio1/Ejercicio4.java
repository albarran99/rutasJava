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
        crateTmpDir("d1");
        createTmpFile("d1", "f11");
        createTmpFile("d2", "f22");
        crateTmpDir("d2");
    }


}
