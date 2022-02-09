package ca1;
// Admin number P2100043  
//Name :NG MING XUAN
//Class :DIT / 1B01

public class Student {

    private String course, adminNum, name;
    private double gpa;
    private Module[] module;

    public Student(String course, String adminNum, String name, double gpa, Module[] module) {

        this.course = course;
        this.adminNum = adminNum;
        this.name = name;
        this.gpa = gpa;
        this.module = module;
    }

    public Module[] getModules() {

        return module;
    }
    

    public String getCourse() {

        return course;
    }

    public String getAdmin() {
        return adminNum;

    }

    public String getname() {

        return name;
    }

    public double getgpa() {
        double gpa = 0;

        double tc = 0;
        double tp = 0;
        double p = 0;
        double div = 0;
        double credit = 0;
        double tdiv = 0;

        for (int n = 0; n < getModules().length; n++) {

            if (getModules()[n].getmark() >= 80) {
                div = 4;
                credit = getModules()[n].getcredit();
                p = div * credit;

            } else if (getModules()[n].getmark() >= 70) {
                div = 3;
                credit = getModules()[n].getcredit();
                p = div * credit;

            } else if (getModules()[n].getmark() >= 60) {
                div = 2;
                credit = getModules()[n].getcredit();
                p = div * credit;

            } else if (getModules()[n].getmark() >= 50) {
                div = 1;
                credit = getModules()[n].getcredit();
                p = div * credit;

            } else {
                div = 0;
                credit = getModules()[n].getcredit();
                p = div * credit;

            }
            tp = p + tp;
            tdiv = div + tdiv;
            tc = tc + credit;

            gpa = tp / tc;
        }

        return gpa;
    }

}
