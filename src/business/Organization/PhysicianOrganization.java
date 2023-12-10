/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Physician.PhysicianDirectory;
import business.Role.PhysicianRole;
import business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author apoorvdhaygude
 */
public class PhysicianOrganization extends Organization{
    PhysicianDirectory doctorList;
    //constructor to add doctor list to hospital directory
    public PhysicianOrganization()
    {
        super(Organization.Type.Physician.getValue());
        doctorList= new PhysicianDirectory();
    }

    public PhysicianDirectory getHospitallist() {
        return doctorList;
    }

    public void setHospitallist(PhysicianDirectory doctorList) {
        this.doctorList = doctorList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new PhysicianRole());
       return role;
    }
    
}
