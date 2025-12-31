public class WrapperClassDemo {
    public static void main(String[] args) {
        int i=20;
        int a=30;

        Integer itr = Integer.valueOf(i);  //Autoboxing --- Explicite Conversion

        Integer j = a;  //Autoboxing --- Implicite Conversion

        System.out.println("i:"+i+" "+"a:"+a);
        System.out.println("itr:"+itr+" "+"j:"+j);

        
        char ch = 'P';
        Character chr = Character.valueOf(ch);
        System.out.println("ch:"+ch+" chr:"+chr);
    }
}
