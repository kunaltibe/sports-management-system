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
import ui.CustomerOrganization.CustomerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class CustomerAdminRole extends Role{
    //overriding main panel with volunteer admin work area whenever volunteer admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new CustomerAdminWorkArea(userProcessContainer,enterprise);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.CustomerAdminRole.getValue();
}

}
