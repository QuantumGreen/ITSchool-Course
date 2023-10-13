package session12.challenge.construction_management_system;

public class Admin extends User{

    public Admin() {
        hasTeamStructureAccess = true;
        hasAdminAccess = true;
    }
}
