package org.iesfm.ejercicio1;

import java.io.File;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        File userFlder = new File("/home/raulalbarran");

        File[] files = userFlder.listFiles();

        File userFile = null;
        for (int i = 0; i < files.length; i++) {
            userFile = files[i];

            System.out.println(userFile);
        }
    }
}
