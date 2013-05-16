/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.io.File;
import java.io.FileNotFoundException;
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
        } finally{
            return (RepositoryFactory) repo;
        }
    }

    private static String searchRepo() throws FileNotFoundException {

        Scanner file = new Scanner(new File("config.txt"));
        String linha="";
        while ((linha=file.nextLine()) !=  null) {
            String[] linhas = linha.split(":");
            if (linhas[0].equalsIgnoreCase("BD")) {
                return linhas[1]; 
            }
       }
        file.close();
        return "noconfig";
    }
}
