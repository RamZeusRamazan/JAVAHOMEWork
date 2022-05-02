import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//text IO

public class ACtivites8_1 {
    public static void main(String[] args) {


        try( PrintWriter printWriter =new PrintWriter(new FileOutputStream(new File("Activites81.txt"),true)) ){
            for(int i=0;i<100;i++){
                printWriter.print((int)(Math.random()*1000));
                printWriter.print(" ");
            }

        }catch (Exception e) {
            System.out.println("Can't create");
            e.printStackTrace();
        }
    }
}
