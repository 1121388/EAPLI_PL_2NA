
package Presentation;

import Controllers.PaymentTypeController;
import eapli.util.Console;

/**
 *
 * @author Iã
 */
public class PaymentTypeUI {
    public void mainLoop(){
        PaymentTypeController pController = new PaymentTypeController();
        while (true) {
        System.out.println("\n Criar um tipo de Pagamento");
        System.out.println("\n 1-Dinheiro");
        System.out.println("\n 2-Cartão de crédito");
        System.out.println("\n 3-Cheque");
        System.out.println("\n 4-Paypal");
        System.out.println("\n 0-Sair");
        int option = Console.readInteger("Please choose a option");
            
        switch(option)
            {
            case 1:
                String currency = Console.readLine("Indique a moeda");
                pController.registerCash("Dinheiro",currency);
                return;
            case 2:
                String bank_name = Console.readLine("Indique o nome do banco");
                int card_nr = Console.readInteger("Indique o numero do cartão");
                pController.registerCard("Cartão",card_nr,bank_name);
                return;
            case 3:
                String bank_name1 = Console.readLine("Indique o nome do banco");
                pController.registerCheque("Cheque",bank_name1);
                return;
            case 4:
                String user = Console.readLine("Indique o nome do utilizador");
                pController.registerPaypal("Paypal",user);
                return;
            case 0:
                return;
            }
        }
    }
        
    
}
