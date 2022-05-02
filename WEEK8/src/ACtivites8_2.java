import java.io.*;

//Binary IO
public class ACtivites8_2 {
    public static void main(String[] args) throws Exception{

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("ACtivites82.txt")))){

            for(int i=0;i<100;i++){
                out.writeInt((int)(Math.random()*1000));
            }
        }catch (IOException e){
            System.out.println("IO exeption catched ");
            e.printStackTrace();
        }
        try(DataInputStream in =new DataInputStream(new FileInputStream("ACtivites82.txt"))){
            int i=0;
            while(true){
                System.out.println(++i+" : "+in.readInt());
            }
        }catch (EOFException ex){
            System.out.println("All data readet");
        }
        catch (IOException es){
            es.printStackTrace();
        }

    }
}
