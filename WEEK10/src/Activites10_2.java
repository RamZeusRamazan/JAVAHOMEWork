import java.util.Iterator;
import java.util.LinkedList;

public class Activites10_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        for(int i=0;i<50000;i++){
            list.add(i);
        }
        Iterator<Integer> iterator1 =list.iterator();

        long start1=System.currentTimeMillis();
        while(iterator1.hasNext()){
            iterator1.next();
        }
        //System.out.println(iterator1.next());
        long end1=System.currentTimeMillis();
        System.out.println("Iterator Speed is equal to : " + (end1-start1) +"millis");

        long start =System.currentTimeMillis();
        for(int i=0;i<list.size();i++){
            list.get(i);
        }
        long end =System.currentTimeMillis();
        System.out.println("GetIndex Speed is equal to : " + (end-start) + "millis");

        Iterator<Integer> iterator =list.iterator();

        start=System.currentTimeMillis();
        while(iterator.hasNext()){
            iterator.next();
        }
        end=System.currentTimeMillis();
        System.out.println("Iterator Speed is equal to : " + (end-start) +"millis");

    }
}
