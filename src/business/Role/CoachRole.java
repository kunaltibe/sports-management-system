/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.CoachOrganization;
import business.UserAccount.UserAccount;
import ui.CoachWorkArea.CoachWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sangram
 */
public class CoachRole extends Role{
    //overriding main panel with police work area whenever police role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new CoachWorkArea(userProcessContainer,account,(CoachOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.CoachRole.getValue();
}

}
