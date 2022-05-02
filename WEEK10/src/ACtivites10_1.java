import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class ACtivites10_1 {
    public static void main(String[] parametrs)throws IOException {
        if(parametrs.length!=1){

            System.out.println("Exeption");
            System.out.println(parametrs.length);
        }
        File file =new File(parametrs[0]);

        /*String[] rawStrings = {  "B", "java2s.com", "b","A", "a","c", "C","C" };
        System.out.println(Arrays.toString(rawStrings));
        Arrays.sort(rawStrings,String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(rawStrings));*/

        if (!file.isFile())
            throw new FileNotFoundException(file.getName() + " isn't a file");

        TreeSet<String> treeSet =new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        PriorityQueue<String> list =new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);
        try{
            Scanner scanner =new Scanner(file);
            String line="";
            while(scanner.hasNextLine()){
                line=scanner.nextLine();
                String[] tempsToken =line.split("[^a-zA-Z]");
                for(String s :tempsToken){
                    treeSet.add(s);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Iterator<String> iterator =treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
