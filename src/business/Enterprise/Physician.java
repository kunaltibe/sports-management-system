/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.PhysicianRole;
import business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author apoorvdhaygude
 */
public class Physician extends Enterprise{

    public Physician(String hospitalName){
        super(hospitalName,Enterprise.EnterpriseType.Physician);
    }

    //hash map to for Doctor role addition
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new PhysicianRole());
     
        return role;
    }
}
