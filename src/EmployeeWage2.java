public class EmployeeWage2 {
    final static int WAGE_PER_HOUR=20;
    final static int TOTAL_HOUR=8;
    final static int PARTTIME_HOUR=4;
    final static int FULL_TIME=2;
    final static int PART_TIME=1;
    //To get attendence
    public int empPresent(){
        int attendencecheck = (int) Math.floor((Math.random() * 10) % 3);
        return attendencecheck;
    }
    //To calculate daily wages including part time working
    public int dailywage(){
        int daily_wage=0;
        int attendence=empPresent();
        switch (attendence)
        {
            case FULL_TIME:
                System.out.println("Today Employee is present full day");
                daily_wage= WAGE_PER_HOUR*TOTAL_HOUR;
                break;
            case PART_TIME:
                System.out.println("Today Employee is present for halfday");
                daily_wage= WAGE_PER_HOUR*PARTTIME_HOUR;
                break;
            case 0:
                System.out.println("Today Employee is absent");
                daily_wage= 0;
                break;
        }
        return daily_wage;
    }
    public static void main(String[] args) {
        EmployeeWage2 employeedailywage=new EmployeeWage2();
        System.out.println("Employee Wage for the day="+ employeedailywage.dailywage());
    }
}
