/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Coach.CoachDirectory;
import business.Role.CoachRole;
import business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author apoorvdhaygude
 */
public class CoachOrganization extends Organization{
    CoachDirectory policeList;
    //constructor to add police list to police directory
    public CoachOrganization(String name)
    {
        super(Organization.Type.Coach.getValue());
        policeList=new CoachDirectory();
    }


    public CoachDirectory getPoliceList() {
        return policeList;
    }

    public void setPoliceList(CoachDirectory policelist) {
        this.policeList = policelist;
    }
    //hasmap to support police role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new CoachRole());
       return role;
       
    } 
}
