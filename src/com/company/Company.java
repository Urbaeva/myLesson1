package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Company implements CompanyInterface{
    ArrayList<Student> arrayList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        arrayList.add(student);
    }

    @Override
    public void printEmployees() {
        TreeSet<Student> treeSet = new TreeSet<>(arrayList);
        TreeSet<Student> treeSetDes = (TreeSet<Student>) treeSet.descendingSet();
        for (Student i: treeSetDes) {
            System.out.println(i);
        }
    }

    @Override
    public void gpaTop5() {
        arrayList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
