class Puppy{
    int PuppyAge;
    
    Puppy(String name) {
        System.out.println("Hi, i know your name is " + name);
    }

    void setAge(int age){
        PuppyAge = age;
    }

    int getAge(){
        // System.out.println("Puppy age is: " + PuppyAge);
        return PuppyAge;
    }

    public static void main(String[] args) {
        int umur;
        
        Puppy myPuppy = new Puppy("Loli");
        myPuppy.setAge(10);
        myPuppy.getAge();
        umur = myPuppy.getAge();

        System.out.println("ini variable umur: " + umur);

        // System.out.println("Test");
    }
}