/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.GeneralPractRole;
import java.util.ArrayList;

/**
 *
 * @author Tejaswini
 */
public class GenPracOrganization extends Organization{
    public GenPracOrganization() {
        super(Organization.Type.GeneralPractitioner.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GeneralPractRole());
        return roles;
    }
}
