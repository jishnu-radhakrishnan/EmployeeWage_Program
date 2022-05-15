public class EmployeeWage1 {
    private static int WAGE_PER_HOUR=20;
    private static int TOTAL_HOUR=8;
    //To calculate Employee attendence
    public boolean empPresent(){
        boolean ifempPres=false;
        double random_value= Math.random();
        if (random_value>0 && random_value<=0.5){
            ifempPres =false;
        }
        if (random_value>0.5 && random_value<=1){
            ifempPres =true;
        }
        return ifempPres;
    }
    //To calculate daily wage
    public int dailywage(){
        int daily_wage=0;
        boolean attendence=empPresent();
        if (attendence){
            System.out.println("Today Employee is present");
            daily_wage= WAGE_PER_HOUR*TOTAL_HOUR;
        }else{
            System.out.println("Today Employee is absent");
            daily_wage=0;
        }
        return daily_wage;
    }
    public static void main(String[] args) {
        EmployeeWage1 employeedailywage=new EmployeeWage1();
        System.out.println("Employee Wage for the day="+ employeedailywage.dailywage());
    }
}
