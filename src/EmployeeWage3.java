public class EmployeeWage3 {
    final static int WAGE_PER_HOUR=20;
    final static int TOTAL_HOUR=8;
    final static int PARTTIME_HOUR=4;
    final static int FULL_TIME=2;
    final static int PART_TIME=1;
    //To calculate attendence
    public int empPresent(){
        int attendencecheck = (int) Math.floor((Math.random() * 10) % 3);
        return attendencecheck;
    }
    //To calculate Monthly wage also added days count for fullday,halfday and absent days.
    public int monthlywage(){
        int total_working_days=1;
        int total_hrs=0;
        int monthly_wage=0;
        int count1=0;
        int count2 =0;
        int count3 =0;
        while (total_hrs<=100&&total_working_days<=20) {
            total_working_days++;
            switch (empPresent()) {
                case FULL_TIME:
                    total_hrs+=8;
                    monthly_wage +=WAGE_PER_HOUR * TOTAL_HOUR;
                    count1++;
                    break;
                case PART_TIME:
                    total_hrs+=4;
                    monthly_wage +=WAGE_PER_HOUR * PARTTIME_HOUR;
                    count2++;
                    break;
                case 0:
                    total_hrs+=0;
                    monthly_wage += 0;
                    count3++;
                    break;
            }
        }
        System.out.println("Employee total full days present="+ count1);
        System.out.println("Employee total half days present="+ count2);
        System.out.println("Employee total days absent="+ count3);
        System.out.println("Employee total attendance hrs for the month="+ total_hrs);
        return monthly_wage;
    }
    public static void main(String[] args) {
        EmployeeWage3 employeemonthlywage=new EmployeeWage3();
        System.out.println("Employee Wage for the month="+ employeemonthlywage.monthlywage());
    }
}
