package blackberry.exercise.project01;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 18:51
 * Create By IntelliJ IDEA
 */
public class Project01 {
    public static void main (String[] args) {
        boolean isFlag = true;
        //  details用于记录用户的收入和支出详情
        String details = "收支\t账户金额\t收支金额\t说   明\n";
        //  初始金额
        int balance = 10000;
        while (isFlag) {
            System.out.println ("------------------------家庭收支记账软件-----------------------");
            System.out.println ("                          1 收支明细");
            System.out.println ("                          2 登记收入");
            System.out.println ("                          3 登记支出");
            System.out.println ("                          4 退   出\n");
            System.out.println ("                         请选择（1-4）:");
            //  获取用户的选择1-4
            char selection = Utility.readMenuSelection ();
            switch (selection) {
                case '1':
//                    System.out.println("1、收支明细：");
                    System.out.println ("-----------------------当前收支明细记录--------------------");
                    System.out.println (details);
                    System.out.println ("--------------------------------------------------------");

                    break;
                case '2':
//                    System.out.println("2、登记收入：");
                    System.out.println ("本次收入金额：");
                    //  获取键盘输入的收入金额
                    int income = Utility.readNumber ();
                    System.out.println ("本次收入说明：");
                    //  获取键盘输入的说明信息
                    String info = Utility.readString ();
                    //  修改余额信息
                    balance += income;
                    //  处理获取的details数据
                    details += "收入\t" + balance + "\t" + income + "\t\t" + info + "\n";
                    System.out.println ("--------------登记完成-----------------");
                    break;

                case '3':
//                    System.out.println ("3、登记支出：");
                    System.out.println ("本次支出金额：");
                    int outcome = Utility.readNumber ();
                    System.out.println ("本次支出说明：");
                    String inform = Utility.readString ();
                    //  简单判断支出是否超过
                    if (balance >= outcome) {
                        balance -= outcome;
                    } else {
                        System.out.println ("支出超出账户的余额，支付失败");
                    }
                    details += "支出\t" + balance + "\t" + outcome + "\t\t" + inform + "\n";

                    System.out.println ("--------------登记完成-----------------");
                    break;

                case '4':
//                    System.out.println("4、退出：");
                    System.out.println ("确认是否退出（Y/N）");
                    //  退出功能，当输入Y/N时判断是否退出
                    char isExit = Utility.readConfirmSelection ();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
//                    break;
            }
        }
    }
}
