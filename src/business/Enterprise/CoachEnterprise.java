/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.CoachRole;
import business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author kunaltibe
 */
public class CoachEnterprise extends Enterprise{

    public CoachEnterprise(String policeEnterpriseName){
        super(policeEnterpriseName,Enterprise.EnterpriseType.Coach);
    }

    //hash map to for Police role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new CoachRole());
        return role;
    }
}
