package ca1;
// Admin number P2100043  
//Name :NG MING XUAN
//Class :DIT / 1B01


import javax.swing.JOptionPane;


public class StudentUser {


    public static void main(String[] args) {

        String input;
        int in;
        StudentManagement detail = new StudentManagement();

        do {

            input = detail.getques();
            do {
                if (!input.matches("[0-9]+")) {

                    JOptionPane.showMessageDialog(null, "Invalid option ,Please enter number ", "Error", JOptionPane.ERROR_MESSAGE);
                    input = detail.getques();
                }
            } while (!input.matches("[0-9]+"));

            in = Integer.parseInt(input);
            // Invalid input 
            if (in > 5 || in <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid option! Please enter in the range from 1 to 5", "Error", JOptionPane.ERROR_MESSAGE);

            }
            // from 1 to 5
            //working 

            switch (in) {
                case 1:
                    detail.getmsg();
                    break;
                case 2:
                    detail.getSeachStudent();

                    break;
                case 3:
                    detail.getSeachModule();
                    break;
                case 4:
                    detail.getStatistic();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Program terminated.\n"
                            + "Thank You!");
                    
                    break;
                default:
            }

        } while (in != 5);

    }
}
