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






class Student{
    int roll;
    String name;
    static String uni="LPU";
    Student(int n,String s){
        roll=n;
        name=s;
    }
    void display(){
        System.out.println(roll+" "+name+" "+uni);

    }
}
class Main{
    public static void main(String args[]){
        Student S1=new Student(1,"Ansh");
        S1.display();
    }
}
