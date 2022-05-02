public class ACtivites9_1 {
    public static void main(String[] args) {
        Integer[] list =new Integer[70];
        for( int i=0; i<list.length; i++){
            list[i]=i;
        }

        System.out.println(linearSearch(list,12));
        System.out.println(linearSearch(list,10));
        System.out.println(linearSearch(list,71));
        System.out.println(linearSearch(list,1));

    }
    public static <T extends Comparable<T>> int linearSearch(T[] list,T key){
        for(int i=0;i<list.length;i++){
            if(list[i].compareTo(key)==0){
                return i;
            }
        }
        return -1;
    }
}
