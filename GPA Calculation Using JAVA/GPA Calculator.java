/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classwork;
import java.util.Scanner; 

/**
 *
 * @author DELL
 */
public class Classwork {

    /**
     * @param args the command line arguments
     */
    public String getGrade(double score){
        String grade = ""; 
        if(score >= 70 && score <= 100){
            grade = "A"; 
        }
        else if (score >= 60 && score <=69){
            grade = "B"; 
        }
        else if (score >= 50 && score <=59){
            grade = "C";
        }
        else if (score >= 45 && score <=49){
            grade = "D";
        }
        else if (score >= 40 && score <=44){
            grade = "E";
        }
        else{
            grade = "F";
        }
        return grade;
    }
    
   public int getPoint(String grade){
       int point = 0;
       switch(grade){
           case "A": 
               point = 5; 
               break; 
           case "B": 
               point = 4; 
               break;
           case "C": 
               point = 3; 
               break; 
           case "D": 
               point = 2; 
               break; 
           case "E":
               point = 1; 
               break; 
           case "F": 
               point = 0; 
               break; 
       }
       return point; 
   }
    public static void displayCourseInfo(String course, int gradeUnit, String grade, int point) {
    System.out.printf("| %-16s | %-15d | %-14s | %-16d |\n", course, gradeUnit, grade, point);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SIMPLE GRADING SYSTEM");
        
        Scanner i = new Scanner (System.in); 
        //course1
        System.out.println("Enter Course 1: ");
        String course1 = i.nextLine(); 
        
        System.out.println("Enter" + course1 + "grade: ");
        int gradeunit1 = i.nextInt(); 
        
        System.out.println("Enter" + course1 + "score: ");
        double score1 = i.nextDouble(); 
        i.nextLine();
        
        //course2
        System.out.println("Enter Course 2: ");
        String course2 = i.nextLine(); 
        
        System.out.println("Enter" + course2 + "grade: ");
        int gradeunit2 = i.nextInt(); 
        
        System.out.println("Enter" + course2 + "score: ");
        double score2 = i.nextDouble();
        i.nextLine();
        
        //course3
        System.out.println("Enter Course 3: ");
        String course3 = i.nextLine(); 
        
        System.out.println("Enter" + course3 + "grade: ");
        int gradeunit3 = i.nextInt(); 
        
        System.out.println("Enter" + course3 + "score: ");
        double score3 = i.nextDouble();
        i.nextLine();
        
        //course 4
        System.out.println("Enter Course 4: ");
        String course4 = i.nextLine(); 
        
        System.out.println("Enter" + course4 + "grade: ");
        int gradeunit4 = i.nextInt(); 
        
        System.out.println("Enter" + course4 + "score: ");
        double score4 = i.nextDouble();
        i.nextLine();
        
        //course 5
        System.out.println("Enter Course 5: ");
        String course5 = i.nextLine(); 
        
        System.out.println("Enter" + course5 + "grade: ");
        int gradeunit5 = i.nextInt(); 
        
        System.out.println("Enter" + course5 + "score: ");
        double score5 = i.nextDouble();
        i.nextLine();
        
        
        //score
        Classwork st = new Classwork(); 
        
        String grade1 = st.getGrade(score1);
        String grade2 = st.getGrade(score2);
        String grade3 = st.getGrade(score3);
        String grade4 = st.getGrade(score4);
        String grade5 = st.getGrade(score5);
        
        int point1 = st.getPoint(grade1); 
        int point2 = st.getPoint(grade2); 
        int point3 = st.getPoint(grade3); 
        int point4 = st.getPoint(grade4); 
        int point5 = st.getPoint(grade5); 
        
       System.out.println("|------------------|-----------------|----------------|------------------|");
       System.out.println("|COURSE & CODE     | COURSE UNIT     | GRADE          | GRADE-UNIT       |");
       System.out.println("|------------------|-----------------|----------------|------------------|");
        
        int totalGradeUnit = point1+point2+point3+point4+point5;
        int totalQualityPoint = gradeunit1*point1; 
            totalQualityPoint += gradeunit2*point2; 
            totalQualityPoint += gradeunit3*point3; 
            totalQualityPoint += gradeunit4*point4; 
            totalQualityPoint += gradeunit5*point5; 
      double cgpa = (double) totalQualityPoint / totalGradeUnit;
     // float cgpa = (float) totalQualityPoint / totalGradeUnit;
    
    displayCourseInfo(course1, gradeunit1, grade1, point1);
    displayCourseInfo(course2, gradeunit2, grade2, point2);
    displayCourseInfo(course3, gradeunit3, grade3, point3);
    displayCourseInfo(course4, gradeunit4, grade4, point4);
    displayCourseInfo(course5, gradeunit5, grade5, point5);
    System.out.println("|------------------|-----------------|----------------|------------------|");

            
    System.out.println("Total Grade Units: " + totalGradeUnit);
    System.out.println("Total Quality Points: " + totalQualityPoint);
    System.out.printf("CGPA: %.2f\n", cgpa);
 // System.out.println("CGPA: " + cgpa);
            
             
        
        
        
      
    }
    
    
    
}  
