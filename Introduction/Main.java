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

// import java.util.Scanner;

// class Loan {
//     char name;
    
//     public Loan(char name) {
//         this.name = name;
//     }
// }

// class CarLoan extends Loan {
//     int data;
//     char model;

//     // Constructor for CarLoan
//     public CarLoan(char name, int data, char model) {
//         super(name);  // Calling the parent class constructor
//         this.data = data;
//         this.model = model;
//     }

//     // Method to display loan details
//     public void display() {
//         System.out.println("Loan Name: " + name);
//         System.out.println("Car Data: " + data);
//         System.out.println("Car Model: " + model);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create scanner for input
//         Scanner scanner = new Scanner(System.in);

//         // Taking input from the user
//         System.out.println("Enter loan name (single character): ");
//         char loanName = scanner.next().charAt(0);

//         System.out.println("Enter loan data (integer): ");
//         int loanData = scanner.nextInt();

//         System.out.println("Enter car model (single character): ");
//         char carModel = scanner.next().charAt(0);

//         // Create a CarLoan object
//         CarLoan carLoan = new CarLoan(loanName, loanData, carModel);

//         // Display loan details
//         carLoan.display();
//     }
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


// class nani {
//     void aloopartha() {
//         System.out.println("The secret recipe is followed...");
//     }
// }

// interface maa {
//     void addspices();
// }

// interface maasi {
//     void addpaneer();
// }

// class myrecipe extends nani implements maa, maasi {
//     @Override
//     public void addspices() { 
//         System.out.println("Add fennel seeds");
//     }

//     @Override
//     public void addpaneer() { 
//         System.out.println("Add grated paneer");
//     }

//     @Override
//     public void aloopartha() {
//         System.out.println("Start from nani's recipe");
//         super.aloopartha();  
//         addspices();
//         addpaneer();
//         System.out.println("Add dried fenugreek leaves");
//     }
// }

// class Main {
//     public static void main(String args[]) {
//         myrecipe paratha = new myrecipe();
//         paratha.aloopartha();
//     }
// }


//--------------------------------------------------------------------------------------------------------------


//functional interface


// interface consumer{
//     void upgrade(String str);
// }

// class Main
// {
//     public static void main(String[] args){
//         consumer example=(str)->System.out.print(str.toUpperCase());
//         example.upgrade("hello");
//     }
// }



//another method

// import java.util.function.Consumer;

// class Main {
//     public static void main(String args[]) {
//         Consumer<String> example = (str) -> System.out.println(str.toUpperCase());
//         example.accept("helllo");
//     }
// }



//--------------------------------------------------------------------------------------------------------------

//supplier

// interface supplier{
//     double getnumber();
// }

// class Main{
//     public static void main(String[] args){
//         supplier s=()->Math.random();
//         System.out.print(s.getnumber());
//     }
// }





//or

// import java.util.function.Supplier;
// class Main{
//     public static void main(String args[]){
//         Supplier<Double> s=()->Math.random();
//         System.out.print(s.get());
//     }
// }


//or

// import java.util.function.Function;
// class Main{
//     public static void main(String[] args){
//         Function<Integer,Integer> f=(num)->num*num;
//         System.out.print(f.apply(5));
//     }
// }

//or

// interface Function{
//     int square(int num);
// }

// class Main{
//     public static void main(String[] args){
//         Function f=(int num)->num*num;
//         System.out.print(f.square(5));
//     }
// }







// interface predicateex{
//     boolean check(int num);
// }

// class Main{
//     public static void main(String[] args){
//         predicateex p=num->num%2==0;
//         System.out.println(p.check(10));
//         System.out.println(p.check(15));
//     }
// }



//or

// import java.util.function.Predicate;
// class Main{
//     public static void main(String args[]){
//         Predicate<Integer> p=num->num%2==0;
//         System.out.println(p.test(10));
//         System.out.println(p.test(15));
//     }
// }


//--------------------------------------------------------------------------------------------------------------

// import java.util.function.*;

// class Main {
//     public static void main(String[] args) {
//         // Supplier: Returns a value without input
//         Supplier<Double> supplier = () -> Math.random();
//         System.out.println("Supplier: " + supplier.get());

//         // Consumer: Takes input but returns nothing
//         Consumer<String> consumer = str -> System.out.println("Consumer: " + str.toUpperCase());
//         consumer.accept("hello");

//         // Function: Takes one input and returns one output
//         Function<Integer, Integer> function = num -> num * num;
//         System.out.println("Function: " + function.apply(5));

//         // Predicate: Takes input and returns boolean
//         Predicate<Integer> predicate = num -> num % 2 == 0;
//         System.out.println("Predicate (isEven 10): " + predicate.test(10));
//         System.out.println("Predicate (isEven 15): " + predicate.test(15));

//         // Runnable: No input, no output (used for running tasks)
//         Runnable runnable = () -> System.out.println("Runnable: Task executed!");
//         runnable.run();
//     }
// }


//--------------------------------------------------------------------------------------------------------------


//utility

// import java.util.Calendar;

// class Main {
//     public static void main(String[] args) {
//         Calendar calendar = Calendar.getInstance();
//         int year = calendar.get(Calendar.YEAR);
//         int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
//         int day = calendar.get(Calendar.DAY_OF_MONTH);
        
//         System.out.println("Current date: " + day + "/" + month + "/" + year);

//         // Add 5 days
//         calendar.add(Calendar.DAY_OF_MONTH, 5);
//         System.out.println("Date after 5 days: " + calendar.getTime());
//     }
// }

//--------------------------------------------------------------------------------------------------------------

// import java.time.*;
// import java.time.ZonedDateTime;
// import java.time.ZoneId;
// import java.util.Calendar;

// class Main {
//     public static void main(String args[]) {
//         // LocalDate and LocalTime examples
//         LocalDate today = LocalDate.now();
//         LocalTime now = LocalTime.now();
//         System.out.println("Today date is: " + today);
//         System.out.println("Current time is: " + now);

//         LocalDate specificDate = LocalDate.of(2025, 3, 31);
//         LocalTime specificTime = LocalTime.of(20, 20);
//         System.out.println("Specific date is: " + specificDate);
//         System.out.println("Specific time is: " + specificTime);
        
//         LocalDate nextWeek = today.plusWeeks(1);
//         System.out.println("Next week's date is: " + nextWeek);

//         // ZonedDateTime example
//         ZonedDateTime currentZone = ZonedDateTime.now();
//         System.out.println("Current zone date & time: " + currentZone);
//         ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//         System.out.println("India time is: " + indiaTime);

//         // LocalDateTime example
//         LocalDateTime localDateTimeNow = LocalDateTime.now();
//         System.out.println("Current LocalDateTime is: " + localDateTimeNow);
//         LocalDateTime futureDateTime = localDateTimeNow.plusDays(10).plusHours(2);
//         System.out.println("Future LocalDateTime is: " + futureDateTime);

//         // Calendar example
//         Calendar calendar = Calendar.getInstance();
//         int year = calendar.get(Calendar.YEAR);
//         int month = calendar.get(Calendar.MONTH) + 1;
//         int day = calendar.get(Calendar.DAY_OF_MONTH);
//         System.out.println("Current date is: " + day + "/" + month + "/" + year + " " + calendar.getTime());
//     }
// }


//--------------------------------------------------------------------------------------------------------------
// class Main{
//     public static void main(String args[]){
//         try{
//             int a=10,b=0,c;
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println("this is exception");

//         }
//         finally{
//             System.out.println("finally");
//         }

//         try{
//             int a[]=new int[6];
//             a[6]=30;
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }

//         System.out.println("hello");
//     }
// }



//--------------------------------------------------------------------------------------------------------------
// class Main{
//     public static void main(String args[]){
//         try{
//             int a=10,b=0;
//             int result=a/b;
//             System.out.println(result);
//             int a[]=new int[5];
//             a[6]=30;
//         }
//         catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }
//     }
// }

// //--------------------------------------------------------------------------------------------------------------
// class Main{
//     public static void main(String args[]){
//         try{v
//             int a=10,b=0;
//             int result=a/b;
//             System.out.println(result);
            
//             a[6]=30;
//         }
//         catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }
//     }
// }

// //--------------------------------------------------------------------------------------------------------------
// class Main{
//     static void checkpass(int marks){
//         if(marks<40){
//             throw new ArithmeticException("failing student but still java execution doesnt stop");
//         }
//     }
//         public static void main(String args[]){
//             checkpass(25);
//             System.out.println("exam result is out!");
//         }
//     }



//--------------------------------------------------------------------------------------------------------------
//oject stream demo

// import java.io.*;

// //class and implement serializable
// class Student implements Serializable{
//     int roll;
//     String name;
//     double marks;

// public Student(int roll,String name,double marks){
//     this.roll=roll;
//     this.name=name;
//     this.marks=marks;

// }
// void display(){
//     System.out.println("roll: "+roll);
//     System.out.println("name: "+name);
//     System.out.println("marks: "+marks);
// }
// }

// public class Main{
//     public static void main(String args[])throws IOException,ClassNotFoundException{
//         Student s1=new Student(1,"ansh",99.9);
//         //step-3 write object to file

//         ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.txt"));
//         oos.writeObject(s1);
//         oos.close();
//         System.out.println("student object saved!");

//         //step-4 read object from file
//         ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.txt"));
//         Student s2=(Student)ois.readObject();
        
//         s2.display();
//         ois.close();
//     }
// }




//--------------------------------------------------------------------------------------------------------------
//import java.io.*;
// class Main{
//     public static void main(String args[]) throws IOException{
//         String data="SkipReset";
//         BufferedReader br=new BufferedReader(new StringReader(data));
//         br.mark(5);
//         System.out.print((char)br.read());
//         br.reset();
//         System.out.println(br.readLine());
//         br.close();
//     }
// }



//--------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Main{
//     public static void main(String args[]) throws IOException{
//         String data="SkipReset";
//         BufferedReader br=new BufferedReader(new StringReader(data));
//         br.skip(4);
//         System.out.println(br.readLine()); //complete all line read karega -
//         br.close();
//     }
// }


//--------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Container<T>
// {
//     private T item;
//     public Container(T item) {
//         this.item = item;
//     }
//     void display(){
//         System.out.println("Item: " + item);
//     }

// }

// class Main
// {
//     public static void main(String args[])
//     {
//         Container<String> stringContainer = new Container<>("Hello, Generics!");
//         stringContainer.display();

//         Container<Integer> intContainer = new Container<>(123);
//         intContainer.display();
//     }
// }



//--------------------------------------------------------------------------------------------------------------
// import java.io.*;

// class Container<T, Y, Z> {
//     private T first;
//     private Y second;
//     private Z third;

//     public Container(T first, Y second, Z third) {
//         this.first = first;
//         this.second = second;
//         this.third = third;
//     }

//     void display() {
//         System.out.println("First: " + first);
//         System.out.println("Second: " + second);
//         System.out.println("Third: " + third);
//     }
// }

// public class Main {
//     public static void main(String args[]) {
//         Container<String, String, String> stringContainer = new Container<>("Hello", "Generics", "World");
//         stringContainer.display();

//         Container<Integer, Double, Boolean> mixedContainer = new Container<>(123, 45.6, true);
//         mixedContainer.display();
//     }
// }




//--------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Container<T extends Number, U> {
//     private T first;
//     private U second;

//     public Container(T first, U second) {
//         this.first = first;
//         this.second = second;
//     }

//     void display() {
//         System.out.println("First: " + first);
//         System.out.println("Second: " + second);
//     }
// }
// public static class Main{
//     public static void main(String args[]) {
//         Container<Integer, String> intStringContainer = new Container<>(123, "Hello");
//         intStringContainer.display();

//         Container<Double, String> doubleStringContainer = new Container<>(45.6, "World");
//         doubleStringContainer.display();
//     }
// }



//--------------------------------------------------------------------------------------------------------------
// import java.io.*;
// class Container<T>{
//     private T item;
//     public Container(T item) {
//         this.item = item;
//     }
//     public void showItem() {
//         System.out.println("Item: " + item);
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Container<String> rice=new Container<>("Rice");
//         Container<Integer> number=new Container<>(123);
//         rice.showItem();
//         number.showItem();
//     }
// }   


//--------------------------------------------------------------------------------------------------------------
// import java.util.ArrayList;
// import java.util.List;

// class BaseStudent {
//     String name;
//     public BaseStudent(String name) {
//         this.name = name;
//     }
//     public String toString() {
//         return "Base Name: " + name;
//     }
// }

// class SchoolStudent extends BaseStudent {
//     public SchoolStudent(String name) {
//         super(name);
//     }
//     public String toString() {
//         return "School Name: " + name;
//     }
// }

// class CollegeStudent extends BaseStudent {
//     public CollegeStudent(String name) {
//         super(name);
//     }
//     public String toString() {
//         return "College Name: " + name;
//     }
// }

// public class Main {
//     // Upper bound wildcard: read-only producer
//     public static void printStudentDetails(List<? extends BaseStudent> students) {
//         System.out.println("Student Details:");
//         for(BaseStudent student : students) {
//             System.out.println("->" + student);
//         }
//     }
    
//     // Lower bound: write-only consumer
//     public static void addStudent(List<? super BaseStudent> students) {
//         System.out.println("Adding students...");
//         students.add(new SchoolStudent("Ansh"));
//         students.add(new CollegeStudent("Ansh Gupta"));
//         students.add(new BaseStudent("Generic Student"));
//     }

//     public static void main(String args[]) {
//         // Upper bound: read only producer
//         List<SchoolStudent> schoolList = new ArrayList<>();
//         schoolList.add(new SchoolStudent("techbire"));
//         schoolList.add(new SchoolStudent("a blog"));
        
//         List<CollegeStudent> collegeList = new ArrayList<>();
//         collegeList.add(new CollegeStudent("tech"));
//         collegeList.add(new CollegeStudent("sci-fi"));
        
//         printStudentDetails(schoolList);
//         printStudentDetails(collegeList);
        
//         // For lower bound writing
//         List<BaseStudent> baseList = new ArrayList<>();
//         addStudent(baseList);
        
//         // Now print what we added in baseList
//         System.out.println("Base List after adding students:");
//         for(BaseStudent student : baseList) {
//             System.out.println("->" + student);
//         }
//     }
// }


// import java.util.ArrayList;
// class BaseStudent{
//     String name;
//     public BaseStudent(String name){
//         this.name=name;
//     }
//     public String toString(){
//         return "Base Name: "+name;
//     }
// }
// class Student extends BaseStudent{
//     public SchoolStudent(String name){
//         super(name);
//     }
//     public String toString(){
//         return "Student Name: "+name;
//     }
// }
// class CollegeStudent extends BaseStudent{
//     public CollegeStudent(String name){
//         super(name);
//     }
//     public String toString(){
//         return "College Name: "+name;
//     }
// }
// public class Main{
//     public static void printStudentDetails(List<? extends BaseStudent> students){
//         System.out.println("Student Details:");
//         for(BaseStudent student:students){
//             System.out.println("->"+student);
//         }
//     }
//     //lower bound: write only consumer
//     public static void addStudent(List<? super BaseStudent> students){
//         System.out.println("Adding students...");
//         students.add(new Student("Ansh"));
//         students.add(new CollegeStudent("Ansh Gupta"));
//         students.add(new BaseStudent("Generic Student"));
//     }

//     public static void main(String args[]){
//         //upper bound: read only producer
//         List<SchoolStudent>schoolList=new ArrayList<>();
//         schoolList.add(new SchoolStudent("techbire"));
//         schoolList.add(new SchoolStudent("a blog"));
//         List<CollegeStudent>collegeList=new ArrayList<>();
//         collegeList.add(new CollegeStudent("tech"));
//         collegeList.add(new CollegeStudent("sci-fi"));
//         printStudentDetails(schoolList);
//         printStudentDetails(collegeList);
//         //for lower bound writing
//         List<BaseStudent> baseList=new ArrayList<>();
//         addStudent(baseList);
//         //now print what we added in baseList

//         System.out.println("Base List after adding students:");
//         for(BaseStudent student:baseList){
//             System.out.println("->"+student);
//         }
       

//     }
// }

//--------------------------------------------------------------------------------------------------------------
// import java.util.ArrayList;

// class Main {
//     public static void main(String args[]) {
//         // Non-generic ArrayList (raw type) - can store objects of any type
//         // Not recommended as it skips compile-time type checking
//         ArrayList list = new ArrayList();
//         list.add("hello");
//         list.add(123);    
//         System.out.println("Raw ArrayList: " + list);
        
//         // Generic ArrayList - type-safe, only allows String objects
//         ArrayList<String> list1 = new ArrayList<>();
//         list1.add("hello");
//         list1.add("world");
//         // list1.add(123); // This would cause a compile error
        
//         // Print generic ArrayList
//         System.out.println("Generic ArrayList: " + list1);;
//     }
// }

//--------------------------------------------------------------------------------------------------------------

// import java.util.*;
// class Student implements Comparable<Student>
// {
//     int rollNo;
//     String name;
//     public Student(int rollNo,String name){
//         this.rollNo=rollNo;
//         this.name=name;
//     }
//     @Override
//     public int compareTo(Student s){
//         return this.rollNo-s.rollNo;
//     }
//     public String toString(){
//         return rollNo+"-"+name;
//     }
// }

// public class Main {
//     public static void main(String args[]){
//         TreeSet<Student>students=new TreeSet<>();
//         students.add(new Student(1,"prabh"));
//         students.add(new Student(2,"navi"));
//         students.add(new Student(3,"ansh"));
//         for(Student s:students){
//             System.out.println(s);
//         }
        
//     }
// }



//--------------------------------------------------------------------------------------------------------------
//comparator
// import java.util.*;
// class Student{
//     int rollNo;
//     String name;
//     public Student(int rollNo,,String name){
//         this.rollNo=rollNo;
//         this.name=name;
//     }
//     public String toString(){
//         return rollNo+"-"+name;
//     }
// }
// class NameSort implements Comparator<Student>{
//     public int compare
// }

//--------------------------------------------------------------------------------------------------------------
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         HashMap<String,Integer> map=new HashMap<>();
//         map.put("ansh",1);
//         map.put("gupta",2);
//         map.put("rock",3);
//         String search="ansh";
//         if(map.containsKey(search)){
//             System.out.println("key found: "+search+" value is: "+map.get(search));
//         }
//         else{
//             System.out.println("key not found: "+search);
//         }
//         System.out.println("All keys and values in the map:");
//         System.out.println(map.get("ansh"));
//         System.out.println(map.get("gupta"));
//         System.out.println(map.get("rock"));
//     }
// }

//--------------------------------------------------------------------------------------------------------------
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         HashMap<Integer,String>map=new HashMap<>();
//         map.put(1,"ansh");
//         map.put(2,"gupta");
//         map.put(3,"rock");
//         map.put(4,"bhai");
//         System.out.println("All keys and values in the map:");
//         //retrieve a value
//         System.out.println("Student with 1: "+map.get(1));
//         //containskey()-check if key is present or not
//         System.out.println("Is key 2 present: "+map.containsKey(2));
//         //containsvalue()-check if value is present or not
//         System.out.println("Is value 'rock' present: "+map.containsValue("rock"));
//         //keyset()-get all keys
//         Set<Integer> keys=map.keySet();
//         System.out.println("All keys in the map: "+keys);
//         //values()-get all values
//         Collection<String> values=map.values();
//         System.out.println("All values in the map: "+values);
//         //entryset()-get all key-value pairs
//         Set<Map.Entry<Integer,String>> entries=map.entrySet();
//         System.out.println("All key-value pairs in the map:");
//         for(Map.Entry<Integer,String> entry:entries){
//             System.out.println(entry.getKey()+"-"+entry.getValue());
//         }
//         //size()-get size of the map
//         System.out.println("Size of the map: "+map.size());
//         //isempty()-check if map is empty or not
//         System.out.println("Is map empty: "+map.isEmpty());
//         //remove()-remove a key-value pair
//         map.remove(3);
//         System.out.println("After removing key 3, map is: "+map);
//         //replace()-replace a value for a key
//         map.replace(2,"new value");
//         System.out.println("After replacing value for key 2, map is: "+map);
//         //putifabsent()-add a key-value pair if key is not present
//         map.putIfAbsent(5,"new key");
//         System.out.println("After adding new key-value pair, map is: "+map);
//         // clear()-remove all key-value pairs
//         map.clear();
//         System.out.println("After clearing, is map empty: "+map.isEmpty());
//     }
// }

//--------------------------------------------------------------------------------------------------------------
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Deque<String>history=new ArrayDeque<>();
//         history.addLast("google");
//         history.addLast("facebook");        
//         history.addLast("github");
//         System.out.println("History: "+history);
//         history.removeLast();
//         System.out.println("History after removing last: "+history);
//         history.addFirst("twitter");
//         System.out.println("History after adding first: "+history);        
 
//     }
// }


//--------------------------------------------------------------------------------------------------------------
import java.util.*;
class Main{
    public static void main(String args[]){
        Deque<String>deque=new LinkedList<>();
        System.out.println("Adding elements to the deque:");
        deque.addFirst("apple");
        deque.addLast("banana");
        deque.offerFirst("cherry");
        deque.offerLast("date");
        System.out.println("Deque: "+deque);
        System.out.println("----------Peeking elements----------");
        System.out.println("First element: "+deque.peekFirst());
        System.out.println("Last element: "+deque.peekLast());
        System.out.println("----------Removing elements----------");
        System.out.println("Removed first element: "+deque.pollFirst());
        System.out.println("Removed last element: "+deque.pollLast());
        System.out.println("Deque after removals: "+deque);
        System.out.println("----------Polling Elements----------");
        System.out.println("Polled first element: "+deque.pollFirst());
        System.out.println("Polled last element: "+deque.pollLast());
        System.out.println("Deque after polling: "+deque);
        System.out.println("----------Trying get on empty deque----------");
        try{
            System.out.println("First element: "+deque.getFirst());
        }catch(Exception e){
            System.out.println("Deque is empty, cannot get first element."+e);
        }
    
    try{
        System.out.println("Last element: "+deque.getLast());
    }catch(Exception e){
        System.out.println("Deque is empty, cannot get last element."+e);
    }
    System.out.println("----------Adding elements back to deque----------");
    deque.addFirst("grape");
    deque.addLast("kiwi");
    System.out.println("Deque after adding elements back: "+deque);
}
}