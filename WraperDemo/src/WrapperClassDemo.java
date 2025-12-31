public class WrapperClassDemo {
    public static void main(String[] args) {
        int i=20;
        int a=30;


        //AUTOBOXING
        Integer itr = Integer.valueOf(i);  //Autoboxing --- Explicite Conversion
        Integer j = a;  //Autoboxing --- Implicite Conversion

        System.out.println("i:"+i+" "+"a:"+a);
        System.out.println("itr:"+itr+" "+"j:"+j);


        char ch = 'P';
        Character chr = Character.valueOf(ch);
        System.out.println("ch:"+ch+" chr:"+chr);

        //UNBOXING
        Integer num = new Integer(10); //created Wrapper Class Object
        int n = num.intValue();  //Unboxing
        System.out.println("num:"+num+" n:"+n);

        Boolean redable = new Boolean(true); //created Wrapper Class Object
        boolean read = redable.booleanValue(); //Unboxing
        System.out.println("redable:"+redable+" read:"+read);
    }
}
