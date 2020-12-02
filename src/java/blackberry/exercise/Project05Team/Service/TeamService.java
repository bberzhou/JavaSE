package blackberry.exercise.Project05Team.Service;

import blackberry.exercise.Project05Team.Domain.Architect;
import blackberry.exercise.Project05Team.Domain.Designer;
import blackberry.exercise.Project05Team.Domain.Employee;
import blackberry.exercise.Project05Team.Domain.Programmer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/5/20 16:17
 * Create By IntelliJ IDEA
 */
public class TeamService {
    /**
     * 功能：关于开发团队成员的管理：添加、删除等操作
     * 说明：
     * counter为静态变量，用来为开发团度新增成员自动生成团队中的唯一ID，即memberId
     * MAX_MEMBER:表示开发团队中最大成员数
     * team数组：用来保存当前团队中的各成员对象
     * total:记录团队成员的实际人数
     */
    private static int counter = 1;    //  给memberId赋值使用的
    private final int MAX_MEMBER = 5;   //  限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER]; //  保存开发团队成员
    private int total = 0;  //  记录开发团队实际的人数

    //  空参构造器
    public TeamService () {
        super ();
    }

    //  获取开发团队中的成员
    public Programmer[] getTeam () {
//        return team;  不能直接return 一个team因为，这个数组里面可能有空的元素
        Programmer[] t = new Programmer[total];
        for (int i = 0 ; i < t.length ; i++) {
//            t[i] = team[i];
            t[i] = team[i];
        }
        //  返回局部数组t，
        return t;
    }

    //  添加指定员工
    public void addMember (Employee e) throws TeamException {
        /**
         *  成员已满，无法添加
         *  该成员不是开发人员，无法添加，
         *  该员工已在本开发团队中
         *  该员工已是某团队成员
         *  该员工正在休假，无法添加
         *  团队中至多只能有一名架构师
         *  团队中至多只能有两名设计师
         *  团队中至多只能有三名程序员
         */
        if (total >= MAX_MEMBER) {
            throw new TeamException ("成员已满，无法添加");
        }
        //  该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException ("该成员不是开发人员，无法添加");
        }

//        for (int i = 0 ; i <total; i++) {
//            //  比较添加员工的id
//            if (e.getId () == team[i].getId ()){
//                //  存在返回true
//                return;
//            }
//
//
//        }
        //  判断该员工是否在本开发团队中
        if (isExit (e)) {
            throw new TeamException ("该员工已在本开发团队中");
        }

        //  该员工已是某团队成员
        //  该成员正在休假，无法添加，  这两个都用status这个属性来判断

        //  因为status是programmer类里面的属性，所以需要对对传入的对象e进行一个强转
        Programmer p = (Programmer) e;  // 强转
//        p.getStatus ().getNAME ().equals ("BUSY");下面那样写更容易防止空指针

        //  这是不采用枚举类的写法
//        if ("BUSY".equals (p.getStatus ().getNAME ())) {
//            throw new TeamException ("已经是某团队的成员");
//        } else if ("VACATION".equals (p.getStatus ().getNAME ())) {
//            throw new TeamException ("该人员正在休假，无法添加");
//        }


        //  采用枚举类型写法
        switch (p.getStatus ()) {
            case BUSY:
                throw new TeamException ("已经是某团队的成员");
            case VOCATION:
                throw new TeamException ("该人员正在休假，无法添加");

        }

        // 团队中至多只能有一名架构师
        // 团队中至多只能有两名设计师
        // 团队中至多只能有三名程序员

        //  首先获取已有成员中的人数，需要先判断team中已经有的架构师、程序员、设计师的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        //  由小到大的判断
        for (int i = 0 ; i < total ; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
//        if (p instanceof Architect && numOfArch >= 1) {
//            throw new TeamException ("团队中至多只能有一名架构师");
//        } else if (p instanceof Designer && numOfDes >= 2) {
//            throw new TeamException ("团队中至多只能有两名设计师");
//        } else if (p instanceof Programmer && numOfPro >= 3 ){
//            throw new TeamException ("团队中至多只能有三名程序员");
//        }
        //  注意上面那个写法和下面这个写法逻辑是不一样的，上面那种有可能出现错误
        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException ("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException ("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException ("团队中至多只能有三名程序员");
            }

        }

        //  上面如果全部都是false，则需要将p或者(e)添加到现有的team中
//        team[total + 1] = p;  //  直接添加到对象数组中去
        team[total] = p;
        total++;
        //  添加之后同时给p的一些属性赋值
        p.setStatus ((Status.BUSY));
        p.setMemberId (counter++);


    }

    //  删除指定员工

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 从团队中删除成员
     * @Date 20:01 10/10/20
     * @Param 传入被删除员工的memberId
     */
    //  这种写法有问题
//    public void removeMember (int memberId) throws TeamException {
//        int flag = 0;
//        for (int i = 0 ; i < total ; i++) {
//            flag = i ;
//            if (team[i].getMemberId () == memberId) {
//                //  如果团队中有这个成员，删除时需要修改他的status,并直接跳出循环,并将找到的位置赋值给position
//                team[i].setStatus (Status.FREE);
//                break;
//            }
//        }
//        //  如果循环结束还是没找到指定的memberId，此时的position值应该是等于total
//        if ( flag == total) {
//            throw new TeamException ("找不到指定memberId的员工，删除失败");
//        }
//
//        //  后一个元素覆盖前一个元素，实现删除操作
////        for (int i = position ; i <total-1  ; i++) {
////            team[i] = team[i+1];
////        }
//        for (int i = flag + 1 ; i < total ; i++) {
//            team[i - 1] = team[i];
//        }
//        //  最后一个元素置为空，并把数组长度减1
//        team[total-1] = null;
//        total--;
//        //  写法二
////        team[--total] = null;
//
//
//    }
    public void removeMember (int memberId) throws TeamException {
        int i = 0;
        for ( ; i < total ; i++) {
            if (team[i].getMemberId () == memberId) {
                team[i].setStatus (Status.FREE);
                break;
            }
        }
        if (i == total) {
            throw new TeamException ("找不到指定memberId的员工，删除失败");
        }
        //  后一个元素覆盖前一个元素，实现删除操作
        for (int j = i + 1 ; j < total ; j++) {
            team[j - 1] = team[j];
        }
        team[total - 1] = null;
        total--;

    }

    /**
     * @return
     * @Author bberzhou@gmail.com
     * @Description 判断指定的员工是否存在现有的开发团队中
     * @Date 21:51 10/5/20
     * @Param e
     */

    private boolean isExit (Employee e) {
        //  比较id如果已经存在就返回true
        //  这里也可以通过memberId来判断，因为第57行已经进行了判断是否为programmer，
        for (int i = 0 ; i < total ; i++) {
            if (team[i].getId () == e.getId ()) {
                //  通过memberId也可以进行判断
                return true;
            }
        }
        //  如果没有就返回false
        return false;
    }
}
