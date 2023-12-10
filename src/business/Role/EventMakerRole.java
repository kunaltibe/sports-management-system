/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Business.MainSystem;
import business.Enterprise.Enterprise;
import business.Organization.EventMakerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.EventMakerWorkArea.EventMakerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class EventMakerRole extends Role{
 
	//overriding main panel with event maker work area whenever event maker role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventMakerWorkArea(userProcessContainer,account,(EventMakerOrganization)organization,enterprise,system);
    }

    @Override
    public String toString()
    {
    	return Role.RoleType.EventMaker.getValue();
    }
}