import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.io.File;

public class ftpclient extends gui{
    public void main() throws IOException{
    System.out.println(gui.path);
    Socket s=new Socket("127.0.0.1",5000);
    System.out.println(gui.path);
    File fr=new File(gui.path);
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
