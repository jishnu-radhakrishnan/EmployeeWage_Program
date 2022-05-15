public class EmployeeWage {
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
    public static void main(String[] args) {
        EmployeeWage employeeattendence=new EmployeeWage();
        boolean attendence= employeeattendence.empPresent();
        if(attendence)
            System.out.println("Today Employee is present");
        else
            System.out.println("Today Employee is absent");
    }
}
