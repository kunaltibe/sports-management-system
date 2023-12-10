/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.ProviderOrganization;
import business.UserAccount.UserAccount;
import ui.Provider.ProviderWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sangram
 */
public class ProviderRole extends Role{
    //overriding main panel with provider work area whenever provider role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new ProviderWorkArea(userProcessContainer,account,(ProviderOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.ProviderRole.getValue();
}


}
