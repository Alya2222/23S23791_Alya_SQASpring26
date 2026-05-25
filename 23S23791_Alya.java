
package jobmarkettrendanalysis;
import java.util.Scanner;
public class JobMarketTrendAnalysis {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int sectorChoice;
      int vacancies;
      System.out.println("Job Market Trend Analysis system");
      System.out.println("1. IT Sector");
      System.out.println("2. Healthcare Sector");
      System.out.println("3. Education Sector");
      
      System.out.println("Enter sector choice: ");
      sectorChoice= input.nextInt();
      
      System.out.println("Enter number of vacancies: ");
      vacancies= input.nextInt();
      switch (sectorChoice){
          case 1:
              if (vacancies >= 150){
                 System.out.println("Very high demand in IT sector "); 
              } else {
                  System.out.println("Low demad in IT sector");
              }
              break;
          case 2:
              if (vacancies >= 80){
                 System.out.println("Hight demand in Healthcare sector "); 
              } else {
                  System.out.println("Low demad in Healthcare sector");
              }
              break;
           case 3:
              if (vacancies >= 60){
                 System.out.println("Hight demand in Education sector "); 
              } else {
                  System.out.println("Low demad in Education sector");
              }
              break;
           default:
              System.out.println("Invalid sector choice");        
      }
      input.close();
    }
    
}
