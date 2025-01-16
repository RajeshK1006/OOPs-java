import java.util.*;

// four main properties of oops 
// 1. inheritence 
// 2. polymorphism
// 3. abstraction
// 4. encapsulation 

// 1.inheritance

// // childresn can able to use their parents atttributes, funtions , methods etcc..

// // in oops base class provides the access to the child classes which has additional arguments
// // which are only for that child class 

// // this process is called inheritance

//  // this acn be done by using  the extends keyword

//  // example : class child extends base{}
// species --> humans (name ,age, job)
          // --> fish (fincolor, color, ismammal?)
          // --> birds (wings, canFly? , habitat)
        
class Box{
  double l;
  double b;
  double w;
  
  public Box(){
    this.l = -1;
    this.b = -1;
    this.w = -1;
  }
  
  
  
  // cube constructor when three arguments are passes
  Box(double side){
    this.l = side;
    this.b = side;
    this.w = side;
  }
  
  // co[y constructor that uses the vlaues of the old box of this calss]
  Box(Box old) {
    this.l = old.l;
    this.b = old.b;
    this.w = old.w;
  }
  
  void information(){
    System.out.println("hey this is the base class");
  }

  
}

class child extends Box{
    double val;
    
    child(){
        super();
        this.val= 0;
    }
    
    child(double num){
        super(num);
        this.val = -1;
    }
    
    public child(double l, double val){
        super(l);
        this.val = val;
    }
    
    void info(){
        System.out.println(this.val);
    }
    
   
}



class Main{
  public static void main(String[] args){
    Box b1 = new Box(3);
    System.out.println(b1.w);
    
    child b2 = new child(3,7);
    System.out.println(b2.w);
    b2.info();
    
    // lets make it a little funny
    // child cares about parent but parent doesnt care about child in inheritance 
    // so when ever base calss ref is used for child class obj all the values should be initialzeed 
    // or else it should throw an error
    Box b3 = new child(6,9);
    b3.information();
    // this object cant acces its child class methods or attributes as they are some what private to them 
    // b3.info();  
        // the above line will throw an error
        
        
    // child b4 = new Box(77); 
    // b4.info();
    // the above thing cannot be done since the child cannot accept the parent as an object
    // how ever the parent can accept child as an object 
    
    
    // private is an keyword which can be used to make an variable or attribute or method to be restriced for a single file;
    // private variables cannot be used outside the class in which it was declared;
    
    // super() keyword is used to acces the attributes of the base calss when the child and base have the same attribute using super.val
    
    // child class should always initialize the base calss before its values;
    // so super should always comes first in the childs constructor
  }
}

// multivelevel inheritance;
class child2 extends child{
    double cost;
    
    child2(){
        super();
        this.cost = -1;
    }
    
    child2(double side, double val, double cost){
        super(side,val);
        this.cost = cost;
    }
    
    // similarly the constructor that recieves all the arguments
}

// multiple inheritance 
// one class extending more than one classes 

// lets say b extends a and b also extends c then what is the parent class for b?
// internally java doesnt follow or accepts this type of inheritance 

// so if a child contains two or more parents this thing can be done with the help of interfaces in java

// heirarchial inheritance
// is a single level inheritance in which 1 base has multiple child

// simple and fun to work with 

// child3 extends child2{
//     // 
// }

// at last hybrid inheritance which is the conbination of both multiple and single level inheritance which is also not aloowed in java


// The reason you're being asked to use super(0) in the child2 class is because the parent class (child) does not have a no-argument constructor (i.e., a constructor with no parameters).
