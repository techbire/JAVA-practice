// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }









// public class Main {
//     public static void main(String[] args) {
//     for(x=0;x<9;x++){
//         System.out.println("the value of x: "+x);
//     }   
//     }
// }









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




// class Main{
//     public static void main(String args[]){
//         int x=10;
//         float y=10;
//         System.out.println("value: "+(x+y));
//         }
// }




// class Main{
//     public static void main(String args[]){
//         byte x=10;
//         byte y=10;
//         byte z=x+y;
//         System.out.println("value: "+z);  //we cannot store value in byte due to lossy conversion
//         }
// }





// class Main{
//     public static void main(String args[]){
//         int a=5;
//         int b=10;
//         int c=15;
//         int d=(a>b)?((a>c)?a:c):((b<c)?b:c);
//         System.out.println(d);
//         }
// }





// class Main{
//     public static void main(String args[]){
//         int x=10;
//         int y=12;
//         System.out.println((x&y)>(x|y)?x:y);
//         }
// } 





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


class Main{
    enum coffeetype{espresso,latte,cappuccino} //enum defination which is three types of coffee [ finite values ko group karne ke liye hota hai]
    private coffeetype selected; //[selected ek private variable hai jo currently selected coffee type ko store karega. Iska type coffeetype enum hai.]

    public void setcoffeetype(coffeetype selected){  //setter method which use to set the value of selected coffee type 
        this.selected=selected;  //this.selected class ka variable hai, aur selected method ka argument hai.
    }

    public double getprices(){
        if(selected==coffeetype.espresso)return 150;
        if(selected==coffeetype.latte)return 200;
        if(selected==coffeetype.cappuccino)return 250;
        return 0;
    }

    public static void main(String args[]){ 
        Main mycoffee=new Main();  //object created named mycoffee
        mycoffee.setcoffeetype(coffeetype.espresso);
        System.out.println("Espresso price: Rs." + mycoffee.getprices());

    }
}