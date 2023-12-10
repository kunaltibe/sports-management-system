/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.CoachEnterprise.CoachAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class CoachAdminRole extends Role{
    //overriding main panel with police admin work area whenever police admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new CoachAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.CoachAdminRole.getValue();
}

}
