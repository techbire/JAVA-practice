// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }



//--------------------------------------------------------------------------------------------------------------





// public class Main {
//     public static void main(String[] args) {
//     for(x=0;x<9;x++){
//         System.out.println("the value of x: "+x);
//     }   
//     }
// }




//--------------------------------------------------------------------------------------------------------------





// public class Main {
//     public static void main(String[] args) {
//     int x=4;
//     int y=3;
//     if(x>y){System.out.println("x is bigger");}
//     y++;
//     x--;
//     if(y>x){System.out.println("y is bigger");}   
//     }
// }



//--------------------------------------------------------------------------------------------------------------





// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter: ");
//         int day = sc.nextInt();
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day"); 
//         }
//         sc.close();
//     }
// }



//--------------------------------------------------------------------------------------------------------------






// class Main{
//     public static void main(String args[]){
//         int x=10;
//         long y=x;
//         float z=y;
//         System.out.println("Before conversion, int value "+x);
//         System.out.println("After conversion, long value "+y);
//         System.out.println("After conversion, float value "+z);

//         }
// }




//--------------------------------------------------------------------------------------------------------------




// class Student{
//     int roll;
//     String name;
//     static String uni="LPU";
//     Student(int n,String s){
//         roll=n;
//         name=s;
//     }
//     void display(){
//         System.out.println(roll+" "+name+" "+uni);

//     }
// }
// class Main{
//     public static void main(String args[]){
//         Student S1=new Student(1,"Ansh");
//         S1.display();
//     }
// }




//--------------------------------------------------------------------------------------------------------------





// class Main{
//     public static void main(String args[]){
//         int x=10;
//         float y=10;
//         System.out.println("value: "+(x+y));
//         }
// }





//--------------------------------------------------------------------------------------------------------------





// class Main{
//     public static void main(String args[]){
//         byte x=10;
//         byte y=10;
//         byte z=x+y;
//         System.out.println("value: "+z);  //we cannot store value in byte due to lossy conversion
//         }
// }




//--------------------------------------------------------------------------------------------------------------





// class Main{
//     public static void main(String args[]){
//         int a=5;
//         int b=10;
//         int c=15;
//         int d=(a>b)?((a>c)?a:c):((b<c)?b:c);
//         System.out.println(d);
//         }
// }





//--------------------------------------------------------------------------------------------------------------




// class Main{
//     public static void main(String args[]){
//         int x=10;
//         int y=12;
//         System.out.println((x&y)>(x|y)?x:y);
//         }
// } 





//--------------------------------------------------------------------------------------------------------------





// Class Main{
//     static void PrintArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String args[]){
//         PrintArray(new int[]{1,2,3,4});
//     }
// }




//--------------------------------------------------------------------------------------------------------------




//method overloading
// class Main{
//     public double avg(int a,int b){
//         return (double)(a/b)/2;
//     }
//     public double avg(int a,int b,int c){
//         return (double)(a+b+c)/3;
//     }
//     public static void main(String args[]){
//         Main obj=new Main();
//         System.out.println(obj.avg(2,4));
//         System.out.println(obj.avg(2,4,6));
        
//     }
// }



//--------------------------------------------------------------------------------------------------------------




// class Main{
//     public double avg(int...numbers){
//         int sum=0;
//         for(int i:numbers){
//             sum+=i;
//         }
//         return numbers.length==0?0:(double)sum/numbers.length;
//     }
//     public static void main(String args[]){
//         Main obj=new Main();
//         System.out.println(obj.avg(2,3,4,5));
//     }
// }




//--------------------------------------------------------------------------------------------------------------




// import java.util.Scanner;
// class Main{
//     public static void main(String args[]){
//   Scanner sc = new Scanner(System.in);

//   System.out.println("enter rows arr1: ");
//   int n = sc.nextInt();
//   System.out.println("enter cols arr1: ");
//    int m = sc.nextInt();
//    System.out.println("enter cols arr 2:");
//    int p=sc.nextInt();

//    int [][]arr1=new int[n][m];
//    int [][]arr1=new int[m][p];
//    int [][]res=new int[n][p];



// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         int arr[i][j]=sc.nextInt()
//         int arr2[i][j]=arr1[i]*[j];
//     }
// }
// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//        System.out.println(arr[i][j]);

//         }
// } 
//     }
// }






//--------------------------------------------------------------------------------------------------------------






// import java.util.Scanner;

// class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows for Matrix 1: ");
//         int n = sc.nextInt();
//         System.out.println("Enter number of columns for Matrix 1: ");
//         int m = sc.nextInt();

//         System.out.println("Enter number of columns for Matrix 2: ");
//         int p = sc.nextInt();

//         int[][] arr1 = new int[n][m];
//         int[][] arr2 = new int[m][p];
//         int[][] result = new int[n][p];

//         System.out.println("Enter elements of Matrix 1:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr1[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter elements of Matrix 2:");
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < p; j++) {
//                 arr2[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < p; j++) {
//                 for (int k = 0; k < m; k++) {
//                     result[i][j] += arr1[i][k] * arr2[k][j];
//                 }
//             }
//         }

//         System.out.println("Resultant Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < p; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }






//--------------------------------------------------------------------------------------------------------------



//method

// class Main{
//     public static void main(String[] args){      //static idhar h toh niche method me bhi static mention hoga!
//     greet();
//     greet();
//     greet();
 
//     }
//     static void greet(){                //void means no return type 
//         System.out.println("hello ji");
//     }
// }






//--------------------------------------------------------------------------------------------------------------


//method with parameter


// class Main {
//     public static void main(String[] args) {
//         average(4, 6);
//     }
//     public static void average(int a, int b) {
//         System.out.println("The avg is: " + (a + b) / 2);
//     }
// }




//--------------------------------------------------------------------------------------------------------------

//basic of class and object

// class Car { 
//     String brand = "Toyota"; // Data members
//     void showBrand() { // Method
//         System.out.println("Brand: " + brand);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Car c = new Car(); // Object creation
//         c.showBrand();
//     }
// }




//--------------------------------------------------------------------------------------------------------------

//constructor and method 

// class Student {
//     String name;
//     Student() { // Constructor=special method called when an object is created and it is inside a class
//         name = "Default";
//     }
//     void display() { // Method
//         System.out.println("Name: " + name);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();
//     }
// }



//--------------------------------------------------------------------------------------------------------------

//Method overloading --same name , different parameters

// class Calc {
//     int add(int a, int b) { return a + b; } // Method Overloading
//     int add(int a, int b, int c) { return a + b + c; }
// }
// public class Main {
//     public static void main(String[] args) {
//         Calc obj = new Calc();
//         System.out.println(obj.add(5, 10)); // Calls first method
//         System.out.println(obj.add(5, 10, 15)); // Calls second method
//     }
// }


//--------------------------------------------------------------------------------------------------------------

//method overloading other example 

// public class Main{
//     public static void main(String[] args){
//         Greet obj=new Greet();
//         obj.greetings();
//         obj.greetings("ansh");

//     }
// }


// class Greet{
//     void greetings(){
//         System.out.println("hello, good morning");
//     }


//     void greetings(String name){
//         System.out.println("hello, "+name+ "good morning");
//     }


// }


//--------------------------------------------------------------------------------------------------------------

//constructor  [cons. invoke karata h mtlb set karta h]

// public class Main {
//     public static void main(String[] args) {
//         Complex num1 = new Complex();
//         Complex num2 = new Complex();
//         num1.print();
//     }
// }

// class Complex {
//     int a, b;

//     public Complex() {
//         a = 5;
//         b = 0;
//         System.out.println("creating new object"); }

//     void print() {
//    System.out.println(a);
//     System.out.println(b);
// }
// }
//--------------------------------------------------------------------------------------------------------------

//this keyword = refers to the current object's instance

// class Person {
//     String name;
//     Person(String name) { this.name = name; } // Resolves variable conflict
//     void show() { System.out.println("Name: " + this.name); }
// }
// public class Main {
//     public static void main(String[] args) {
//         Person p = new Person("Ansh");
//         p.show();
//     }
// }


//--------------------------------------------------------------------------------------------------------------


//initializer blocks= run before constr. when object is created

// class Demo {
//     { System.out.println("Initializer Block Executed!"); } // Runs before constructor
//     Demo() { System.out.println("Constructor Called!"); }
// }
// public class Main {
//     public static void main(String[] args) {
//         new Demo(); // Output: Initializer Block -> Constructor
//     }
// }



//--------------------------------------------------------------------------------------------------------------
//program-for returing +1 day in string

// import java.util.Scanner;
// class Main{
//     enum Day{
//         MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;}
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("give me any name of day i give increase by 1: ");
//     String input=sc.nextLine().trim().toUpperCase();
//     try{
//         Day currentDay=Day.valueOf(input);
//         Day nextDay=Day.values()[(currentDay.ordinal()+1)%7];
//         System.out.println(nextDay.name());    
//         }
//     catch(IllegalArgumentException e){
//         System.out.println("Invalid Input");
//     }
// }

//     }

//--------------------------------------------------------------------------------------------------------------

//program- SecondsToTime class with a constructor to convert a given duration in seconds into hh:mm:ss format, where input is an integer representing seconds, and output is the formatted time

// import java.util.Scanner;
// class SecondsToTime{
//     private int hr,min,sec;
//     public SecondsToTime(int totalseconds){
//         hr=totalseconds/3600;
//         min=(totalseconds%3600)/60;
//         sec=totalseconds%60;
//     }
//     public void displaytime(){
//         System.out.printf("%02d:%02d:%02d\n",hr,min,sec);
//     }}
//     public class Main{
//         public static void main(String[] arg){
//             Scanner scanner=new Scanner(System.in);
//             System.out.print("tell me seconds which you want to display in hr/m/sec: ");
//             int totalseconds=scanner.nextInt();
//             scanner.close();
//             SecondsToTime timeconverter=new SecondsToTime(totalseconds);
//             timeconverter.displaytime();
//         }
// }

//--------------------------------------------------------------------------------------------------------------







//enum
// class Main{
//     enum color{
//         red,blue,green;
//     }
//     public static void main(String args[]){
//         color c=color.red;
//         System.out.println(c);
//     }
// }



//1.enum defination
//2.setter method 
//3.value assign
//4.value retrieve means object k through method call hoga 

// class Main{
//     enum crust{thin,regular,stuffed};
//     private crust crusttype;
//     public void setcrusttype(crust crusttype){
//         this.crusttype=crusttype;
//     }
//     public double getprices(){
//         if(crusttype==crust.thin)return 200;
//         if(crusttype==crust.regular)return 300;
//         if(crusttype==crust.stuffed)return 400;
//         return 0;
//     }
//     public static void main(String args[]){
//         Main mypizza=new Main();
//             mypizza.setcrusttype(crust.thin);
//             System.out.println("thin crust price: "+mypizza.getprices());
//             mypizza.setcrusttype(crust.regular);
//             System.out.println("regular crust price: "+mypizza.getprices());
//             mypizza.setcrusttype(crust.stuffed);
//             System.out.println("stuffed crust price: "+mypizza.getprices());

//     }
// }


// class Main{
//     enum coffeetype{espresso,latte,cappuccino} //enum defination which is three types of coffee [ finite values ko group karne ke liye hota hai]
//     private coffeetype selected; //[selected ek private variable hai jo currently selected coffee type ko store karega. Iska type coffeetype enum hai.]

//     public void setcoffeetype(coffeetype selected){  //setter method which use to set the value of selected coffee type 
//         this.selected=selected;  //this.selected class ka variable hai, aur selected method ka argument hai.
//     }

//     public double getprices(){
//         if(selected==coffeetype.espresso)return 150;
//         if(selected==coffeetype.latte)return 200;
//         if(selected==coffeetype.cappuccino)return 250;
//         return 0;
//     }

//     public static void main(String args[]){ 
//         Main mycoffee=new Main();  //object created named mycoffee
//         mycoffee.setcoffeetype(coffeetype.espresso);
//         System.out.println("Espresso price: Rs." + mycoffee.getprices());

//     }
// }





//--------------------------------------------------------------------------------------------------------------

// class Main{
//     public static void main(String args[]){
//         String str=new String("ansh");
//         String str1=new String(str);
//         System.out.print(str);
//     }
// }


//--------------------------------------------------------------------------------------------------------------

// class Main{
//     public static void main(String args[]){
//         String str=new String(" katil Aashik");
//         String str1=new String(str); 
//         System.out.println(str1);




//         int intArray[]={72,101,108,108,111};
//         String str=new String(intArray,1,3);
//         System.out.println(str);




//     char charArray[]={'A','a','s','h','i','k'};
//     String str3=new String(charArray);
//     System.out.println(str3);




//     byte byteArray[]={72,101,108,108,111};
//     String str4=new String(byteArray);
//     System.out.println(str4);
//     }

// }

//--------------------------------------------------------------------------------------------------------------


// class Main{
//     public static void main(String args[]){
//         String s1=new String("ansh");
//         s1.concat("gupta");
//         System.out.print(s1);

//         StringBuffer s2=new StringBuffer("rock");
//         s2.append("bhai");
//         System.out.print(s2);

//     }
// }



//--------------------------------------------------------------------------------------------------------------

//heritance
// class NormalDoor{
//     void open(){System.out.print("door is opened");}
//     void close(){System.out.print("door is closed");}
// }
// class Main extends NormalDoor{
//     private int pin=1234;
//     void smartunlock(int enteredpin){
//         if(enteredpin==pin){System.out.print("opened");open();}
//         else{System.out.print("wrong pin");}
//     }

// public static void main(String args[]){
//     Main mydoor=new Main();
//     mydoor.smartunlock(1234);
//     mydoor.close();
// }
// }



//--------------------------------------------------------------------------------------------------------------

//heritance
// class car{  //car-->automatic car(main)-->electric

//     void start(){System.out.print("car has started");}
// }
// class electric extends car{   //main=automatic car
//     void charge(){
//         System.out.print("charing......");
//     }
// }

// class Main extends electric{   //main=automatic car
//     void drive(){
//         System.out.print("driving......");
//     }

// public static void main(String args[]){
//     Main mytesla=new Main();
//     mytesla.start();
//     mytesla.charge();
//     mytesla.drive();
// }
// }




//--------------------------------------------------------------------------------------------------------------
//run time polymorphism -overriding

// class bank{
//     double getinterestrate(){return 5.0;}  //default value ye return karega
// }

// class sbi extends bank{
//     @Override
//     double getinterestrate(){return 6.5;}  // @override is help to tell us where is typo error and if it is not present then it return default value as 5.0;
// }

// class hdfc extends bank{
//     @Override
//     double getinterestrate(){return 7.5;}  
// }

// class Main{
//     public static void main(String args[]){
//         bank account;
//         account=new sbi();
//         System.out.println("rate is: "+account.getinterestrate());
//          account=new hdfc();
//         System.out.println("rate is: "+account.getinterestrate());
//     }
// }



//--------------------------------------------------------------------------------------------------------------
//multiple class heritance

// interface A{
//     void show();
// }
// interface B extends A{
//     default void show(){
//         System.out.print("hello from b");
//     }
// }

// interface C extends A{
//     default void show(){
//         System.out.print("hello from c");
//     }
// }

// class D implements B,C{
//     public void show(){
//         C.super.show();
//     }
// }

// class Main{
//     public static void main(String args[]){
//         D obj=new D();
//         obj.show();
//     }
// }


//--------------------------------------------------------------------------------------------------------------
//super class

// class parent{
//     String name="parent class";
// }
// class child extends parent{
//     String name="child class";
//     void display(){
//         System.out.print(name);
//         System.out.print(super.name);
//     }
// }

// class supervariabledemo{
//     public static void main(String[] args){
//         child obj=new child();
//         obj.display();
//     }
// }


//--------------------------------------------------------------------------------------------------------------
//super class

// class parent{
//     void show(){
//         System.out.print("parent method");
//     }
// }
// class child extends parent{
//     void show(){
//         super.show();
//         System.out.print("child method");
//     }
//     }


// class supervariabledemo{
//     public static void main(String[] args){
//         child obj=new child();
//         obj.show();
//     }
// }


//--------------------------------------------------------------------------------------------------------------
// class Main{
//     final void show(){
//         System.out.println("hello");
//     }

// class ansh extends Main{
//     void show(){
//         System.out.println("heyy");
//     }
//     public static void main(String args[]){
//         ansh obj=new ansh();
//         obj.show();
//     }
// }}


//--------------------------------------------------------------------------------------------------------------
// another example of final keyword

// class Parent {
//     final void show() {
//         System.out.println("Final method in Parent class");
//     }
// }

// class Child extends Parent {
//     // void show() { } // ERROR: Cannot override final method
// }

// class Test {
//     public static void main(String[] args) {
//         Child obj = new Child();
//         obj.show();
//     }
// }


//--------------------------------------------------------------------------------------------------------------
// class ansh{
//     int number;
//     ansh(int number){
//         this.number=number;
//     }
//     @Override
//     public String toString(){
//         return Integer.toString(number);
//     }
// }

// class Main{
//     public static void main(String args[]){
//         ansh obj=new ansh(2134);
//         ansh obj1=new ansh(2134);
//         System.out.println(obj);
//         System.out.println(obj.toString());
//         System.out.println(obj.equals(obj1));
//     }
// }




//--------------------------------------------------------------------------------------------------------------
// class IndianCitizen{}
// class PunjabCitizen extends IndianCitizen{}

// class Main{
//     public static void main(String args[]){
//         PunjabCitizen person1=null;
//         System.out.println(person1 instanceof IndianCitizen);
//         System.out.println(person1 instanceof PunjabCitizen);

//     }
// } 



//--------------------------------------------------------------------------------------------------------------
// abstract class aadhaarform{
//     String name;
//     int age;


// aadhaarform(String name,int age){
//     this.name=name;
//     this.age=age;
// }
// void printdetails(){
//     System.out.println("Name: "+name+",Age: "+age);
// }

// abstract void stateverification();
// }

// class delhiaadhaar extends aadhaarform{
//     delhiaadhaar(String name,int age){
//         super(name,age);
//     }
//     @Override
//     void stateverification(){
//         System.out.println("delhi verification: electricity bill required.");
//     }
// }

// class maharastraaadhaar extends aadhaarform{
//     maharastraaadhaar(String name,int age){
//         super(name,age);
//     }

//     @Override
//     void stateverification(){
//         System.out.println("maharastra verification: ration card required.");
//     }
// }

// public class Main{
//     public static void main(String args[]){
//         aadhaarform person1=new delhiaadhaar("ansh",3);
//         person1.printdetails();
//         person1.stateverification();

//         aadhaarform person2=new maharastraaadhaar("ansh",3);
//         person1.printdetails();
//         person1.stateverification();
        

//     }
// }
//--------------------------------------------------------------------------------------------------------------


class nani {
    void aloopartha() {
        System.out.println("The secret recipe is followed...");
    }
}

interface maa {
    void addspices();
}

interface maasi {
    void addpaneer();
}

class myrecipe extends nani implements maa, maasi {
    @Override
    public void addspices() { 
        System.out.println("Add fennel seeds");
    }

    @Override
    public void addpaneer() { 
        System.out.println("Add grated paneer");
    }

    @Override
    public void aloopartha() {
        System.out.println("Start from nani's recipe");
        super.aloopartha();  
        addspices();
        addpaneer();
        System.out.println("Add dried fenugreek leaves");
    }
}

class Main {
    public static void main(String args[]) {
        myrecipe paratha = new myrecipe();
        paratha.aloopartha();
    }
}
