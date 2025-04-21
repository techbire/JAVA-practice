// import java.io.*;

// public class BYTESTREAM {
//     public static void main(String[] args) throws IOException {
//         FileInputStream fis = new FileInputStream("sample.txt");
//         int ch;
//         while ((ch = fis.read()) != -1) {
//             System.out.print((char) ch);
//         }
//         fis.close();
//     }
// }


// import java.io.*;

// public class BYTESTREAM {
//     public static void main(String[] args) throws IOException{
//     DataOutputStream dos=new DataOutputStream(new FileOutputStream("sample.txt")); 
//     dos.writeInt(100);
//     dos.writeDouble(100.5);
//     dos.close();
    
//     DataInputStream dis=new DataInputStream(new FileInputStream("sample.txt"));
//     System.out.println("Int: "+dis.readInt());
//     System.out.println("Double: "+dis.readDouble());
//     dis.close();
//     }
// }



// import java.io.*;
// public class BYTESTREAM{
//     public static void mian(String[] args) throws IOException{
//         InputStream is=System.in;
//         System.out.println("enter the character");
//         int ch=is.read();
//         System.out.println("the character is: "+(char)ch);
//         System.out.println("the ascii value is: "+ch);
//     }
// }

import java.io.*;
public class BYTESTREAM{
    public static void main(String[] args) throws IOException{
        FileOutputStream fis=new FileOutputStream("sample.txt");
        String data="hello bhai!!! from fileoutstream";
        fos.write(data.getBytes());
        fis.close();        
    }
}   