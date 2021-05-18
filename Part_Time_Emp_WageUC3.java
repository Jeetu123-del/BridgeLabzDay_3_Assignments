import java.util.Random;
class Emp_Part_Time_WageUC3 {
        public static void main (String args[]) {

        System.out.println("Welcome to Employee Wage Computation Program.");

        //Constant
        int Is_Full_Time = 1;
        int Is_Part_Time = 2;
        int Emp_Rate_Per_Hr = 20;
        int Wage_Calculated = 0;
        int Working_Hr = 0;

        //Computation
        Random random = new Random();
        int EmpCheck = random.nextInt(7);

        if (EmpCheck == Is_Full_Time)
        Working_Hr = 8;

        else if (EmpCheck == Is_Part_Time)
        Working_Hr = 4;

        else
        Working_Hr = 0;
        Wage_Calculated = Working_Hr * Emp_Rate_Per_Hr;
        System.out.println("Wage Calulated = " +Wage_Calculated);

        }
}

