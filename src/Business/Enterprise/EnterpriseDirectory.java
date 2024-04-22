/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author kartik
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.DietUnit){
            enterprise=new DietEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.TrainerUnit){
            enterprise=new TrainerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.DoctorUnit){
            enterprise=new DoctorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
