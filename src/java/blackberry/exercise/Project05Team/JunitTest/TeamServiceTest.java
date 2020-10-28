package blackberry.exercise.Project05Team.JunitTest;

import blackberry.exercise.Project05Team.Domain.*;
import blackberry.exercise.Project05Team.Service.NameListService;
import blackberry.exercise.Project05Team.Service.Status;
import blackberry.exercise.Project05Team.Service.TeamException;
import blackberry.exercise.Project05Team.Service.TeamService;
import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/11/20 09:52
 * Create By IntelliJ IDEA
 */
public class TeamServiceTest {
    //    @Test
//    public void test(){
//        TeamService teamService = new TeamService ();
//        Printer p = new Printer ("dd","戴尔");
//        Programmer programmer = new Programmer (1,"马云",30,30000,p);
//        try {
//            teamService.addMember (programmer);
//        } catch (TeamException e) {
//            System.out.println(e.getMessage ());
//        }
//       Programmer[] ps  = teamService.getTeam ();
//        for (int i = 0 ; i < ps.length ; i++) {
//            System.out.println(ps[i].getDetail ());
//        }
//    }
    @Test
    public void testRemove () {
        TeamService teamService = new TeamService ();
        Printer p = new Printer ("dd", "戴尔");
        Programmer programmer = new Programmer (1, "马云", 30, 30000, p);
        try {
            teamService.addMember (programmer);
        } catch (TeamException e) {
            System.out.println (e.getMessage ());
        }
        Programmer[] ps = teamService.getTeam ();
        for (int i = 0 ; i < ps.length ; i++) {
            System.out.println (ps[i].getDetail ());

        }
        try {
            teamService.removeMember (3);
        } catch (TeamException e) {
            System.out.println (e.getMessage ());
        }
    }

    @Test
    public void test () {
        int f = 0;
        for (int i = 0 ; i < 10 ; i++) {
            f = i;
            if (i == 90) {
                System.out.println ("已经到6了");
                break;
            }
        }
        //  如果循环结束还是没找到指定的memberId，此时的position值应该是等于total
        if (f == 9) {
            System.out.println ("到底了");
        }

    }
}
