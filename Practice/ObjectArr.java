class products{
    int pid;
    String pname;
    float pprice;

    products(int pid, String pname, float pprice){
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }

    public void display(){
        System.out.println("Product ID: "+pid+" Product Name: "+pname+" Product Price: "+pprice);
    }
}

class ObjectArr {
    public static void main(String[] args) {
        products obj[] = new products[5];

        obj[0] = new products(101, "POCO", 21000);
        obj[1] = new products(102, "Moto", 20000);
        obj[2] = new products(103, "Realme", 23000);
        obj[3] = new products(104, "Redmi", 19000);
        obj[4] = new products(105, "IQOO", 23000);

        obj[0].display();
        obj[4].display();
    }
}
