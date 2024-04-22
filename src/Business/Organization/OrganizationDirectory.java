/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Tejaswini
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;

        if (type.getValue().equals(Type.Nutrition.getValue())){
            organization = new NutritionOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.WeightTraining.getValue())){
            organization = new OrgWeightTraining();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.FitnessTraining.getValue())){
            organization = new OrgFitnessTraining();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Physiotherapist.getValue())){
            organization = new PhysioOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.GeneralPractitioner.getValue())){
            organization = new GenPracOrganization();
            organizationList.add(organization);
        }
      
        return organization;
    }
}