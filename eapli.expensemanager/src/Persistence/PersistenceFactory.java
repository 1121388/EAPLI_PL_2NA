/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.*;
import java.util.Scanner;

public class PersistenceFactory {

    private PersistenceFactory() {
    }

    public static RepositoryFactory buildPersistenceFactory() {

        Object repo = null;

        try {
            String name = searchRepo();
            Class clazz = Class.forName(name);
            repo = clazz.newInstance();

        } catch (FileNotFoundException ex) {
            System.out.println("Error:Config File not found!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error:Class do not exist!");
        } catch (InstantiationException ex) {
            System.out.println("Error: Instantiation attempted failed");
        } catch (IllegalAccessException ex) {
            System.out.println("Error:IllegalAccess");
        }
        return (RepositoryFactory) repo;
    }

    private static String searchRepo() throws FileNotFoundException {

        Scanner file = new Scanner(new File("config.txt"));
        String aux = "noconfig";
        while ((aux = file.nextLine()) != null) {
            String[] linhas = aux.split(":");
            if (linhas[0].equalsIgnoreCase("BD")) {
                aux = linhas[1];
            }
        }
        file.close();
        return aux;
    }
}
