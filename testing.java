import java.io.File;

public class testing{
public static void main(String [] args){
File folder = new File("~/Downloads");
File filesList[] = folder.listFiles();
for (int i=0;i<size(filesList);i++) {
    if (file.isFile()) {
        System.out.println(filesList[i].getName());
    }
}
}
}