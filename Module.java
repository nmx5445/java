package ca1;
// Admin number P2100043  
//Name :NG MING XUAN
//Class :DIT / 1B01
public class Module {

    private String modulecode, modulename;
    private int credit;
    private double marks;

    public Module(String mcode, String mname, int credit, double marks) {
        this.modulecode = mcode;
        this.modulename = mname;
        this.credit = credit;
        this.marks = marks;

    }

    
    public String getmname(){
       String mname = this.modulename;
       return mname;
    }
   
    public double getmark(){
       Double marks = this.marks;
       return marks;
    }
      public String getmcode(){
       String mcode = this.modulecode;
       return mcode;
    }
           public int getcredit(){
       int credit = this.credit;
       return credit;
    }

}
