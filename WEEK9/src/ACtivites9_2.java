import java.util.ArrayList;

public class ACtivites9_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(3);
        list.add(-7);
        System.out.println(max(list));


    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max =list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i).compareTo(max)>0){ //
                max=list.get(i);
            }
        }
        return max;
    }
}
