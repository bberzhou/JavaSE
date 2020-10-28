package blackberry.exercise.Project05Team.JunitTest;

import blackberry.exercise.Project05Team.Domain.Employee;
import blackberry.exercise.Project05Team.Service.NameListService;
import blackberry.exercise.Project05Team.Service.TeamException;
import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/4/20 18:13
 * Create By IntelliJ IDEA
 */
public class NameListServiceTest {
    /**
     * 测试NameListService
     * 获取所有员工的信息
     */

    @Test
    public void testGetAllEmployees () {
        NameListService nameListService = new NameListService ();
        Employee[] employees = nameListService.getAllEmployees ();
        for (int i = 0 ; i < employees.length ; i++) {
            System.out.println (employees[i]);
        }
    }

    @Test
    public void testGetEmployee () {
        NameListService nameListService = new NameListService ();
        try {
            Employee employee = nameListService.getEmployee (5);
            System.out.println (employee.toString ());
        } catch (TeamException e) {
            e.printStackTrace ();
        }
    }


}
