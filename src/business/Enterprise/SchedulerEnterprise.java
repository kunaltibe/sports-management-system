/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.SchedulingManagerRole;
import business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author apoorvdhaygude
 */
public class SchedulerEnterprise extends Enterprise {

	public SchedulerEnterprise(String ngoName){
        super(ngoName,Enterprise.EnterpriseType.scheduler);
    }
 
    //hash map to for NGO role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SchedulingManagerRole());
        return role;
    }
}
