/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NetworkLocation;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Tejaswini
 */
public class NetworkLocation {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public NetworkLocation(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
