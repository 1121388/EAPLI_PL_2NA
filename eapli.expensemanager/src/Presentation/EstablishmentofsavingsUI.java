package Presentation;

import Controllers.BasicController;
import Controllers.EstablishmentofsavingsController;
import eapli.util.Console;
import java.util.Date;


public class EstablishmentofsavingsUI extends BasicUI{
    
    private EstablishmentofsavingsController controller = new EstablishmentofsavingsController();

    @Override
    public void getBody() {
        String description = Console.readLine("Description: ");
        double value = Console.readDouble("Amount: ");
        String alias = Console.readLine("Alias: ");
        Date data = new Date();
        
        controller.createsavings(description,value,data,alias);
    }

    @Override
    public String getTitle() {
        return "Establishment Of Saving";
    }

    @Override
    public BasicController getController() {        
        return controller;
    }
    
}
