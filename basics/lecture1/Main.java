class Student{
    int roll_no;
    String name;
    int mark;
    
    // constructor to initialize the values to the object of the class when declared 
    
    public Student(int roll_no, String name, int mark){
        this.roll_no = roll_no;
        this.name = name;
        this.mark = mark;
    }
    
    // Constructor is a special function that runs when you create an obj and it allocates some values to th object that has been instantiated; to bind these arguments with the object 
}

class Main{
    public static void main(String[] args){
        
        // Student obj means declaring the reference to the class in stack memory in this line 
        // when the objects are declared and not initialized its value is null by default in java for non primitive objects while primitives have 0 as their default values
        
        Student obj = new Student(83,"rajesh",90); 
        
        // the "new" keyword is sed to dynamically allocate memory to the object's value or the reference variable  only to the objects .primitive types no new keywords is used during initialization  
        
        System.out.println(obj.roll_no);
        System.out.println(obj.name);
        
        Student obj1;
        
        // to decalre the valueswithout the constructor 
        // obj1.roll_no = 90;
        // System.out.println(obj1.roll_no);
        
        
    }
}

// int primitive types passing them by pointers doesnt work  becoz they need tp be passed by values unless objects which can be passed by pointers for manipulation in an function 

// wrapper classes linke Integer for int are used to make the priitive behave like objects 

// final key words before the "final int num = 8;"
// fianl varialbles should be initialized and cannot go uninitailized otherwose it will throw the errors

// finalize keyword is an function type "destroyer" are present in each classes to remove the memory of the object occupied when it is removed from the memory 
