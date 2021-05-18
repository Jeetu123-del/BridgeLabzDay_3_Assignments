import java.util.Random;
class Emp_PresenceUC1 {
        public static void main (String args[]) {

        System.out.println("Welcome to Employee Wage Computation Program.");

        //Constant
        int Is_Present = 1;
        int Emp_Rate_Per_Hr = 20;
        int Wage_Calculated = 0;
        int Working_Hr = 0;

        //Computation
        Random random = new Random();
        int EmpCheck = random.nextInt(7);

        if (EmpCheck == Is_Present)
        Working_Hr = 8;


        else
        Working_Hr = 0;
        Wage_Calculated = Working_Hr * Emp_Rate_Per_Hr;
        System.out.println("Wage Calulated = " +Wage_Calculated);

        }
}



