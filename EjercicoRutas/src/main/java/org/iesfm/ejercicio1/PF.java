package org.iesfm.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class PF {

    private static final Logger log = LoggerFactory.getLogger(PF.class);

    public static void main(String[] args) throws IOException {
        File logs = new File(args[0]);

        try {
            FileInputStream fis = new FileInputStream(logs);
            byte[] fileInBytes = fis.readAllBytes();
            String content = new String(fileInBytes, StandardCharsets.UTF_8);
            log.info(content);
            fis.close();
        } catch (IOException e) {
            log.error("hubo un error al leer el archivo", e);

        } catch (FileNotFoundException e) {
            log.error("no se ha encontrado el archivo " + args[0]);
        }

    }
}
