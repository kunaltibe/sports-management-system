/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.PlayerOrganization;
import business.UserAccount.UserAccount;
import ui.EventSeekerWorkArea.EventSeekerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class PlayerRole extends Role{
    //overriding main panel with victim work area whenever victim role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventSeekerWorkArea(userProcessContainer,account,(PlayerOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Player.getValue();
}

}
