/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.EventSeeker.EventSeekerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class PlayerAdminRole extends Role{
    //overriding main panel with victim admin work area whenever victim admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventSeekerAdminWorkArea(userProcessContainer,enterprise);
    }
        @Override
        public String toString()
{
   return Role.RoleType.PlayerAdmin.getValue();
}

}
