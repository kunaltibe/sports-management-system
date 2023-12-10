/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.PhysicianOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.PhysicianWorkArea.PhysicianWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class PhysicianRole extends Role{
 
	//overriding main panel with doctore work area whenever doctor role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new PhysicianWorkArea(userProcessContainer,account,(PhysicianOrganization)organization,enterprise,system);
    }

    @Override
    public String toString()
    {
    	return Role.RoleType.Physician.getValue();
    }
}