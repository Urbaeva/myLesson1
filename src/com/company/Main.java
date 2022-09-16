package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Random;

public class Main {
        public  static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            double gpa = gpa();
            Student student = new Student("Student" + (i+1), random.nextInt(15,26), gpa);
            arrayList.add(student);
        }

        Company company = new Company();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getAge() > 18 && arrayList.get(i).getGpa() > 2.55){
                company.addStudent(arrayList.get(i));
            }
        }
        System.out.println("-----------------GPA top 5---------------------");
        company.gpaTop5();
        System.out.println("\n-----------All students in company-------------");
        company.printEmployees();
    }

    public static double gpa(){
        double gpa = random.nextDouble(1,4.0);
        DecimalFormatSymbols ds = new DecimalFormatSymbols();
        ds.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#,##0.00", ds);

        return Double.parseDouble(df.format(gpa));
    }
}
