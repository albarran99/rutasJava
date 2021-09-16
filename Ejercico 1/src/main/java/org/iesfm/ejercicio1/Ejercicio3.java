package org.iesfm.ejercicio1;

import java.io.File;
import java.nio.file.Files;

public class Ejercicio3 {
    public static void main(String[] args) {
        File actualUser = new File(".");
        showFiles(actualUser);
    }

    public static void showFiles(File folder) {
        for (File file : folder.listFiles()) {
            if(file.isDirectory()) {
                showFiles(file);
            } else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
