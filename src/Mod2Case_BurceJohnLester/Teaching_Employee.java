package Mod2Case_BurceJohnLester;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teaching_Employee {
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
          
        Scanner input = new Scanner (System.in); 
     
        System.out.println("\n");
        System.out.println("\t============Employees Payroll System============ ");
        System.out.println("\n");
        
        System.out.println("\tEnter Employees ID Number: ");
        long id_no = input.nextLong();
        System.out.println("\n");
                
        System.out.println("\tEnter Employees Name: ");
        String emp_name = input.next();
        System.out.println();
       
        
        System.out.println("\t Press T for Teaching Employee or N for Non-Teaching Employee: ");
        char job_criteria = input.next().charAt(0);
        
        char select = Character.toUpperCase(job_criteria);
         
        System.out.println();
    
        if(select == 'T') {
             
            System.out.println("\t ============ Teaching Employee =========== ");
            System.out.println();
            
            System.out.println("\tEnter Teaching Hours: ");
             int teaching_hours = input.nextInt();
             
            System.out.println("\tEnter Pay Rate: ");
             double pay_rate = input.nextDouble();
             
             System.out.println("\tEnter Basic Pay: ");
             double basic_pay = input.nextInt();
             
            System.out.println("\tEnter Overtime Hours: ");
             int overtime_hours = input.nextInt();
                    
            System.out.println("\tEnter No.Absent Hours: ");
             int noAbsent_hours = input.nextInt();
             
             double allowance = (basic_pay - 0.1);
             double overtime_pay = (overtime_hours * 1.4);
             double deduction = (pay_rate * noAbsent_hours);
             double pay = (teaching_hours * pay_rate + overtime_pay + allowance - deduction );
             
            System.out.println("\t-------------------------------------");              
            
            System.out.println();
            System.out.println("\tEmployees ID: " + id_no);
            System.out.println("\tEmployee Name: " + emp_name );
            System.out.println("\tTeaching Hours: " + teaching_hours);
            System.out.println("\tPay Rate: " + pay_rate);
            System.out.println("\tOvertime Hours: " + overtime_hours);
            System.out.println("\tBasic Pay: " + basic_pay);
            System.out.println("\tOvertime Pay: " + overtime_pay);
            System.out.println("\tAllowance: " + allowance);
            System.out.println("\tNo.Absent of Hours: " + noAbsent_hours );
            System.out.println("\tDeduction: " + deduction);
            
            System.out.println("\t-------------------------------------");
            
            System.out.println("\tPay: " + df2.format(pay));
            System.out.println("\n");
            
        } else if (select == 'N') {
        
         System.out.println("\t // Non-Teaching Employee // ");
         System.out.println();
         
         System.out.println("\tEnter Pay Rate: ");
         double pay_rate = input.nextDouble();
       
         System.out.println("\tEnter No.of Overtime Hours: ");
         int noOvertime_hours = input.nextInt();
         
         System.out.println("\tEnter No.of Hours Absent: ");
         int noHours_absent = input.nextInt();
         
         double overtime_rate = (pay_rate / 30 / 8 * 1.4);
         double overtime_pay = (noOvertime_hours * overtime_rate);
         double allowance = (pay_rate - 0.1);
         double deduction = (noHours_absent * pay_rate / 30 / 8);
         double pay = (pay_rate + overtime_pay + allowance - deduction);
         
          System.out.println("\t-------------------------------------");  
          
           System.out.println("\tEmployee's ID: " + id_no);
           System.out.println("\tEmployee's Name: " + emp_name );
           System.out.println("\tPay Rate: " + pay_rate);
           System.out.println("\tNo.of Overtime Hours: " + noOvertime_hours);
           System.out.println("\tOvertime Rate: " + overtime_rate );
           System.out.println("\tOvertime Pay: " + overtime_pay);
           System.out.println("\tAllowance " + allowance);
           System.out.println("\tNo.of Hours Absent: " + noHours_absent);
           System.out.println("\tDeduction: " + deduction);
           
          System.out.println("\t-------------------------------------");  
       
          System.out.println("\tPay: " + df2.format(pay));
          System.out.println("\n");
    
    } else { 
            System.out.println("\n");
            System.out.println("\tInvalid Option. Please Try Again");
        }
        
        System.out.println("\nEnd of Payroll System");
        System.out.println("Thank You!");
        System.out.println("\n");
        
      }
    
    }
