/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.SchedulerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.SchedulerManager.SchedulingManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class SchedulingManagerRole extends Role{
    //overriding main panel with NGO Manager work area whenever NGO Manager role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new SchedulingManagerWorkArea(userProcessContainer,account,(SchedulerOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SchedulerManagerRole.getValue();
}

}
