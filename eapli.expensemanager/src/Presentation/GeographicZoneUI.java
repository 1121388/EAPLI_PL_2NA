/*
 * @author adaoss <1030066>
 */

package Presentation;

import Controllers.BasicController;
import Controllers.GeographicZoneController;
import eapli.util.Console;

public class GeographicZoneUI extends BasicUI {

    GeographicZoneController pController = new GeographicZoneController();
    
    public GeographicZoneUI() {}
    
    @Override
    public String getTitle() {
        return "Geographic Zones";
    }
        
    @Override
    public BasicController getController() {
        return pController;
    }

    @Override
    public void getBody() {
        System.out.println("Zones available:");
        System.out.println(pController.GeographicZoneList(false));
        DataRequest();
    }
    
    private void DataRequest() {
        while (true) {
            String pDescription = Console.readLine("Description:");
            pController.RegisterGeographicZone(pDescription);
             System.out.println("Geographic zone added!\n");
             break;
                 
        }
    }

}
