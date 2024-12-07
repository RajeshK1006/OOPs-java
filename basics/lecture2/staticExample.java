class Student{
    int roll_no;
    int marks;
    String name;
    static int present;
    // this present variable is commont to all th obbjects . can be accessed using this.present or class.present but the correct convention is to use the classname.present 
    
    // static means that is something that is independent of objjectas or instances
    // we know something which is not static that is is dependent on instances
    
    // static functiion or variable doesn't use anything that is non static
    
    // inside static method this keyword cannot be used
    
    
    public Student(int roll_no,int marks,String name){
        this.roll_no = roll_no;
        this.marks = marks;
        this.name = name;
        Student.present += 1;
    }
    
    static void message(){
        // System.out.println(this.marks) this cannotbe used as it isnon static
        System.out.println(Student.present);
    }
}

// packages are just folders to store them in a heirarchiel manner for making good visisbilty and ease of access.
// same name for 2 files cannot be created in a single package or folder 

class Main{
    public static void main(String[] args){
        System.out.println("Rajesh");
        
        Student me = new Student(83,99,"rajesh");
       
        System.out.println(me.name);
        System.out.println(Student.present);  
    }
}
