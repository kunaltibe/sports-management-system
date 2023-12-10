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
import ui.SchedulerEnterprise.SchedulerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sangram
 */
public class SchedulerAdminRole extends Role{
    //overriding main panel with NGO admin work area whenever NGO admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new SchedulerAdminWorkArea(userProcessContainer,enterprise,system);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.SchedulerAdminRole.getValue();
}

  
}
