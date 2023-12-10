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
import ui.ProviderEnterprise.ProviderAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class ProviderAdminRole extends Role{
    //overriding main panel with provier admin work area whenever provider admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new ProviderAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.ProviderAdminRole.getValue();
}
}
