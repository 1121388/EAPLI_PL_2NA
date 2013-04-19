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
                String alias = Console.readLine("Please type the name of the new payment type.");
                String currency = Console.readLine("Please type the currency type.");
                pController.registerCash(alias, currency);
                return;
            case 2:
                String bank_name = Console.readLine("Indique o nome do banco");
                int card_nr = Console.readInteger("Indique o numero do cartão");
                pController.registerCard("Cartão", card_nr, bank_name);
                return;
            case 3:
                String bank_name1 = Console.readLine("Indique o nome do banco");
                pController.registerCheque("Cheque", bank_name1);
                return;
            case 4:
                String user = Console.readLine("Indique o nome do utilizador");
                pController.registerPaypal("Paypal", user);
                return;
            case 0:
                return;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
    
    @Override
    public String getTitle()
    {
        return  "Criar um tipo de Pagamento";
    }

    @Override
    public BasicController getController() 
    {
        return pController;
    }
     
}
