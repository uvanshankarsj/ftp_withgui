import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.io.File;

public class ftpclient{

    public void main(String[] args) throws IOException{
    System.out.println("hi");
    gui a=new gui();
    System.out.println(a.path);
    Socket s=new Socket("127.0.0.1",5000);
    System.out.println(path);
    File fr=new File(path);
    Scanner sc = new Scanner(fr);
    while (sc.hasNextLine()){
    String se=sc.nextLine();
    DataOutputStream srt=new DataOutputStream(s.getOutputStream());
    srt.writeUTF(se);
    System.out.println(se);
    }
    s.close();
    }
}
