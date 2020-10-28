package blackberry.exercise.Project05Team.View;

import blackberry.exercise.Project05Team.Domain.Employee;
import blackberry.exercise.Project05Team.Domain.Programmer;
import blackberry.exercise.Project05Team.Service.NameListService;
import blackberry.exercise.Project05Team.Service.TeamException;
import blackberry.exercise.Project05Team.Service.TeamService;
import blackberry.exercise.Project05Team.Util.TSUtility;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/10/20 20:24
 * Create By IntelliJ IDEA
 */
public class TeamView {
    /**
     * listSvc和teamSvc属性：供类中的方法使用
     * enterMainMenu()方法：主界面显示及控制方法
     * 下面几个方法只允许enterMainMenu()方法调用
     * listAllEmployees()方法：以表格形式列出公司所有成员
     * getTeam()方法：显示团队成员列表操作
     * addMember()方法：实现添加成员操作
     * deleteMember()方法：实现删除成员操作
     */
    private NameListService listService = new NameListService ();

    private TeamService teamService = new TeamService ();

    public void enterMainMenu () {
        //  用一个flag来做判断
        boolean loopFlag = true;
        char menu = 0;
        //  调用此方法时，首先listAllEmployees
        while (loopFlag) {
            //  在菜单选择的时候如果选择1就不执行listAllEmployees
            if (menu != '1') {

                listAllEmployees ();
            }
            System.out.print ("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出  请选择（1-4）:");
            menu = TSUtility.readMenuSelection ();
            switch (menu) {
                case '1':
                    getTeam ();
                    break;
                case '2':
                    addMember ();
                    break;
                case '3':
                    deleteMember ();
                    break;
                case '4':
                    System.out.println ("确认是否退出(Y/N)");
                    char isExit = TSUtility.readConfirmSelection ();
                    if (isExit == 'Y') {
                        //  如果确认退出，就把loopFlag置为false，退出while循环
                        loopFlag = false;
                    }
                    break;
            }

        }


    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 显示所有的员工信息
     * @Date 21:12 10/10/20
     * @Param
     */
    private void listAllEmployees () {
//        System.out.println("显示所有员工信息");
        System.out.println ("-------------------------开发团队调度软件---------------------------\n");
        Employee[] employees = listService.getAllEmployees ();
        //  先判断数组里面是否有元素
        if (employees == null || employees.length == 0) {
            System.out.println ("公司中没有任何员工信息");
        } else {
            System.out.println ("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            // 有员工就for循环展示信息
            for (int i = 0 ; i < employees.length ; i++) {
                System.out.println (employees[i]);
            }
        }
        System.out.println ("------------------------------------------------------------");

    }

    private void getTeam () {
//        System.out.println ("查看开发团队情况");
        System.out.println ("-------------团队成员列表-----------------\n");
        Programmer[] team = teamService.getTeam ();
        //  首先判断一下team数组里面是否有元素
        if (team == null || team.length == 0) {
            System.out.println ("开发团队中没有成员");
        } else {
            System.out.println ("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0 ; i < team.length ; i++) {
                //  这里会自动根据team[i]的对象调用自己对应的getDetailForTeam方法
                System.out.println (team[i].getDetailForTeam ());
            }
        }

        System.out.println ("--------------------------------------------");
    }

    private void addMember () {
//        System.out.println ("添加团队成员");
        System.out.println ("----------------------添加成员--------------------");
        System.out.print ("请输入要添加成员的ID：");
        int id = TSUtility.readInt ();
        try {
            Employee employee = listService.getEmployee (id);
            teamService.addMember (employee);
            System.out.println ("添加成功");
        } catch (TeamException e) {
            System.out.println ("添加失败，原因:" + e.getMessage ());
        }
        //  按回车键继续.....
        TSUtility.readReturn ();


    }

    private void deleteMember () {
        System.out.println ("-----------------------删除成员--------------------");
        System.out.print ("请输入要删除员工的TID：");
        int tid = TSUtility.readInt ();
        System.out.println ("确认是否删除（Y/N）");
        char confirm = TSUtility.readConfirmSelection ();
        if (confirm == 'N') {
            return;
        }
        try {
            teamService.removeMember (tid);
            System.out.println ("删除成功！");
        } catch (TeamException e) {
            System.out.println ("删除失败，原因是：" + e.getMessage ());
        }

        //  按回车继续
        TSUtility.readReturn ();

    }


    //  程序入口
    public static void main (String[] args) {
        TeamView teamView = new TeamView ();
        //  对象调用enterMainMenu方法进入主界面
        teamView.enterMainMenu ();
    }
}
