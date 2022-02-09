package ca1;
// Admin number P2100043  
//Name :NG MING XUAN
//Class :DIT / 1B01


import javax.swing.JOptionPane;

public class StudentManagement {
// CASE 1 PART 

    public String getques() {
        String x = JOptionPane.showInputDialog(null, "Enter your option:\n"
                + "\n"
                + "1. Display all students\n"
                + "2. Seach Student by Name\n"
                + "3. Seach Module by Name\n"
                + "4. Print Statistic\n"
                + "5. Exit\n"
                + "\n",
                "Mini Student System", JOptionPane.QUESTION_MESSAGE);
 
      
        return x;
    
    }

    public String getmsg() {
        String msg = null;
        JOptionPane.showMessageDialog(null,
                getdisplayAll(),
                "All Students", JOptionPane.INFORMATION_MESSAGE);
        return msg;
    }

    public String getdisplayAll() {

        String y = "";

        for (int i = 1; std.length >= i; i++) {
            y = y + "Student " + i + ": \nCourse Admin # " + "NAME" + "\n"
                    +std[i-1].getname()+ "   " + std[i - 1].getAdmin() + "   " + std[i - 1].getCourse() + "\n"
                    
                    + "Modules taken:\n" + getmodulemsg(i) + "\n" + "\n";

        }
        return y;
    }

    public String getmodulemsg(int y) {
        System.out.print(y);
        int count = y - 1;
        String msg = "";
        for (int i = 0; std[count].getModules().length > i; i++) {
            msg = msg + i + "." + std[count].getModules()[i].getmcode() + "/" + std[count].getModules()[i].getmname() + "/" + std[count].getModules()[i].getcredit() + "  " + std[count].getModules()[i].getmark() + "\n";
        }

        return msg;
    }

    //END CASE 1 PART 
    //CASE 2 PART 
    public String getSeachStudent() {
        String SName = "";

        SName = JOptionPane.showInputDialog(null, "Enter the Student name to seach :", "Input", JOptionPane.QUESTION_MESSAGE);

        String err = "Cannot find the student'" + SName + "!!";
        for (int i = 0; std.length > i; i++) {

            if (SName.equalsIgnoreCase(std[i].getname())) {

                JOptionPane.showMessageDialog(null, "Course Admin # " + "NAME" + "\n" + std[i].getname()+ "   " + std[i].getAdmin() + "   " + std[i].getCourse() + "\n"
                        + "Modules taken:\n" + getmodulemsg1(i) + "\n" + "\n Your GPA =" + String.format("%.2f", std[i].getgpa()));

                break;
            }
            else {
                JOptionPane.showMessageDialog(null, err, "Info", JOptionPane.ERROR_MESSAGE);
            };

        }
        return SName;
    }

    public String getmodulemsg1(int x) {
        String msg = "";
        System.out.println(std[x].getModules().length);
        for (int i = 0; std[x].getModules().length > i; i++) {
            msg = msg + i + "." + std[x].getModules()[i].getmcode() + "/" + std[x].getModules()[i].getmname()  + "/" + std[x].getModules()[i].getcredit() + "  " + std[x].getModules()[i].getmark()+ "\n";
        }

        return msg;
    }

    

    //CASE 2 END
    //CASE 3 PART 
    public void getSeachModule() {
        String module;
        int count = 0;
        double mark = 0;
        double AvgMark;
        String msg = "";
        module = JOptionPane.showInputDialog(null, "Enter the Module name to seach :", "Input", JOptionPane.QUESTION_MESSAGE);

        for (int i = 0; i < std.length; i++) {
            for (int n = 0; n < std[i].getModules().length; n++) {
                if (module.equalsIgnoreCase(std[i].getModules()[n].getmname())) {
                    count++;
                    mark = std[i].getModules()[n].getmark() + mark;
                    
                }

            }
        }
        if (mark > 0) {
            AvgMark = mark / count;
            JOptionPane.showMessageDialog(null, "Ther are " + count + " student(s) take " + module + " module.\n The average marks for " + module + " is " + String.format("%.1f", AvgMark));

        }
        if (mark == 0) {
            JOptionPane.showMessageDialog(null, "No student take " + module);
        }

    }

    //CASE 3 END
    //CASE 4 PART
    public void getStatistic() {
        double num = 0;
        int count3 = 0;
        int count1 = 0;
        double percentage3 = 0;
        double percentage1 = 0;
        String Statictic = "";
        for (int i = 0; i <std.length; i++) {

            if (std[i].getgpa() > 3.5) {
                count3++;
            }
            if (std[i].getgpa() < 1) {
                count1++;
            }
            num++;
        }
        percentage3 = (count3 / num) * 100;
        percentage1 = (count1 / num) * 100;
        System.out.println(percentage1 + "");
        Statictic = "There are " + (int) num + " student in total. \n "
                + "There is " + count3 + "student(s) getting GPA greater that 3.5 .This is  " + String.format("%.2f", percentage3) + "%\n"
                + "There is/are " + count1 + "student(s) getting GPA less than 1 .This is  " + String.format("%.2f", percentage1) + "%\n ";
        JOptionPane.showMessageDialog(null, Statictic);

    }

    //CASE 4 END
    Student[] std = new Student[3];
//create student 
    public void getstudent() {
 
        
        Module[] m1 = new Module[2];
        m1[0] = new Module("SP4102", "ECG", 2, 12.0);
        m1[1] = new Module("SP5002", "DEUI", 2, 78.0);
        std[0] = new Student("DIT","P214455","David",std[0].getgpa() , m1);


        Module[] m2 = new Module[2];
        m2[0] = new Module("SP108B", "ECG", 2, 88.0);
        m2[1] = new Module("SP108B", "FOP", 2, 88.0);
        std[1] = new Student("DIT", "P214455", "Jaz",std[1].getgpa(), m2);
        
        Module[] m3 = new Module[2];
        m3[0] = new Module("SP108B", "FOC", 2, 88.0);
        m3[1] = new Module("SP108B", "ECG", 2, 88.0);
        std[2] = new Student("DIT", "P214455","John",std[2].getgpa(),m3);
        

    }
    

} 
