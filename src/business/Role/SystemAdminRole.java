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
import  ui.SystemAdmin.SystemAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class SystemAdminRole extends Role {
    //overriding main panel with system admin work area whenever system admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
       return new SystemAdminWorkArea(userProcessContainer,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SystemAdmin.getValue();
}
}

