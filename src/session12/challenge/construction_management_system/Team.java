package session12.challenge.construction_management_system;

import java.util.List;

public class Team {

    private Employee leader;
    private List<Employee> members;

    public void changeLeader(User User, Employee newLeader) {
        if(!User.hasTeamStructureAccess){
            System.out.println("User doesn't have access to modify team structure");
            return;
        }
        leader = newLeader;
        if (!members.contains(newLeader)) {
            members.add(newLeader);
        }
    }
    public void assignEmployeeMember(Employee employee){
        if(!members.contains(employee)){
            members.add(employee);
        }
    }
    public boolean removeEmployeeMember(Employee employee){
        return members.remove(employee);
    }
}
