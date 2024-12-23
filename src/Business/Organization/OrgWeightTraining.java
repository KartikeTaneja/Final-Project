/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Role;
import Business.Role.WeightTrainerRole;
import java.util.ArrayList;

/**
 *
 * @author Tejaswini
 */
public class OrgWeightTraining extends Organization {

    public OrgWeightTraining() {
        super(Organization.Type.WeightTraining.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WeightTrainerRole());
        return roles;
    }
    
}
