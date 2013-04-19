package Presentation;

import Controllers.BasicController;
import Controllers.PaymentTypeController;
import eapli.util.Console;

/**
 * @author Iã
 * @modifications Nuno Tomé, Duarte Pina
 */
public class PaymentTypeUI extends BasicUI{

    private PaymentTypeController pController = new PaymentTypeController();
    private String alias, bank_name;
    
    @Override
    public void getBody()
    {
        
        System.out.println(" 1-Cash");
        System.out.println(" 2-Credit/Debit Card");
        System.out.println(" 3-Cheque");
        System.out.println(" 4-Paypal");
        System.out.println(" 0-Exit \n");
        int option = Console.readInteger("Please choose a option");

        switch (option) 
        {
            case 1:
                alias = Console.readLine("Please type the name of the new payment type.");
                String currency = Console.readLine("Please type the currency type.");
                pController.registerCash(alias, currency);
                return;
            case 2:
                alias = Console.readLine("Please type the name of the new payment type.");
                bank_name = Console.readLine("Please type the name of the bank.");
                int card_nr = Console.readInteger("Please type the number of the card.");
                pController.registerCard(alias, card_nr, bank_name);
                return;
            case 3:
                alias = Console.readLine("Please type the name of the new payment type.");
                bank_name = Console.readLine("Please type the name of the bank.");
                pController.registerCheque(alias, bank_name);
                return;
            case 4:
                alias = Console.readLine("Please type the name of the new payment type.");
                String user = Console.readLine("Please type the name of the user.");
                pController.registerPaypal(alias, user);
                return;
            case 0:
                return;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
    
    @Override
    public String getTitle()
    {
        return  "Create new payment type";
    }

    @Override
    public BasicController getController() 
    {
        return pController;
    }
     
}
