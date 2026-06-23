import java.util.*;

public class EmployeeSkillAssignment {

    static void findTeams(int[] skills, int target,
                          List<Integer> team,
                          int index, int sum) {

        if (sum == target) {
            System.out.println(team);
            return;
        }

        if (sum > target || index == skills.length)
            return;

        team.add(skills[index]);
        findTeams(skills, target, team,
                index + 1, sum + skills[index]);

        team.remove(team.size() - 1);
        findTeams(skills, target, team,
                index + 1, sum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, target,
                new ArrayList<>(), 0, 0);
    }
}