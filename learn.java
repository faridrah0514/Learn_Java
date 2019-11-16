// class Dog{
//     String breed;
//     int age;
//     String color;

//     void barking(){}

//     void hungry(){}

//     void sleeping(){}
// }
// public class learn{
//     public static void main(String args[]){
//         System.out.println("Hello Farid!");  
//         Dog dog = new Dog();
//     }
// }

// class MyFirstProgram{
//     public static void main(String args[]){
//         System.out.println("Hello World!");
//     }
// }

// public class MyFirstProgram{
//     public Puppy(String name){
//         System.out.println("Passed Name is: " + name);
//     }

//     public static void main(String[] args) {
//         Puppy myPuppy = new Puppy("Loli");
//     }
// }

public class Puppy{
    public Puppy(String name) {
       // This constructor has one parameter, name.
       System.out.println("Passed Name is :" + name );
    }
 
    public static void main(String []args) {
       // Following statement would create an object myPuppy
       Puppy myPuppy = new Puppy("tommy");
    }
 }