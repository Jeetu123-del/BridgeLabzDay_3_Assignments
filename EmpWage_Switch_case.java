import java.util.Random;
public class EmpWage_Switch_case {
         public static final int IS_FULL_TIME = 1;
         public static final int IS_PART_TIME = 2;
         public static final int Emp_Rate_Per_Hr = 20;


        public static void main (String args[]) {

        System.out.println("Welcome to Employee Wage Computation Program.");

        //variables
        int Wage_Calculated = 0;
        int Working_Hr = 0;

        //Computation
        Random random = new Random();
        int EmpCheck = (int) random.nextInt(3);

        switch (EmpCheck) {
                case IS_FULL_TIME:
                Working_Hr = 8;
                break;

        case IS_PART_TIME:
                Working_Hr = 4;
                break;

        default:
                Working_Hr = 0;
                }

        Wage_Calculated = Working_Hr * Emp_Rate_Per_Hr;
        System.out.println("Wage Calulated = " +Wage_Calculated);

        }
}
