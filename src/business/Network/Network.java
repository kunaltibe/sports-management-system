/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;

import business.Enterprise.EnterpriseDirectory;

/*
@author kunaltibe
*/

public class Network {
    private String networkName;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network()
    {
     enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String name) {
        this.networkName = name;
    }
    
    @Override
    public String toString()
    {
        return networkName;
    }
}

