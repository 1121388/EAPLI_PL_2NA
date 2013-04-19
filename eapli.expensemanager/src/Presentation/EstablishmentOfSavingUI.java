/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.EstablishmentOfSavingController;

/**
 *
 * @author Hugo Silva
 */
public class EstablishmentOfSavingUI extends BasicUI {
    
    private EstablishmentOfSavingController initBalanceControl = new EstablishmentOfSavingController();
    
    @Override
    public void getBody() {
    
    }
    
    @Override
    public BasicController getController() {
        return initBalanceControl;
    }

    @Override
    public String getTitle() {
        return "Establishment Of Saving";
    }

}
