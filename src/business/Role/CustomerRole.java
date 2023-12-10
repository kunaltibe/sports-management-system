/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.CustomerOrganization;
import business.UserAccount.UserAccount;
import ui.CustomerOrganization.DashboardCustomer;
import javax.swing.JPanel;

/**
 *
 * @author sangram
 */
public class CustomerRole extends Role{
    //overriding main panel with volunteer work area whenever volunteer role is called
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system)
        {
            return new DashboardCustomer(userProcessContainer,account,(CustomerOrganization)organization,enterprise,system);
        }   
        @Override
        public String toString()
{
   return Role.RoleType.CustomerRole.getValue();
}
}
