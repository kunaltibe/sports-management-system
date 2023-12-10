/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.ProviderManagerRole;
import business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author apoorvdhaygude
 */
public class ProviderEnterprise extends Enterprise{

    public ProviderEnterprise(String providerEnterpriseName){
        super(providerEnterpriseName, Enterprise.EnterpriseType.Provider);
        
    }

    //hash map to for Provider role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        new ProviderManagerRole();
        return role;
    }
}
