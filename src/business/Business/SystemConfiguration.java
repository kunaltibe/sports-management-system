/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Business;

import business.Person.Person;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author sangram
 */
public class SystemConfiguration {
    public static MainSystem configureSystem(){
    MainSystem system= MainSystem.getInstance();
   
     Person person = system.getEmployeeDirectory().createPerson("SYSTEM ADMIN");
     //making defualt username, password for application admin role
     UserAccount ua= system.getUserAccountDirectory().createUserAccount("admin","admin", person, new SystemAdminRole());
    
    return system;
    }
}
