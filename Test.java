 class Address {
    String city, state, country;

    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
        // System.out.println("City:"+city+" State:"+state+" Country:"+country);
    }
}

    class Employee {
        int empId;
        String empName;
        Address eAddress;  
        
         Employee(int empId, String empName, Address eAddress){
            this.empId = empId;
            this.empName = empName;
            this.eAddress = eAddress;
         }  
         void show(){
            System.out.println("Emp Id:"+empId+" Emp Name:"+empName);
            System.out.println("City:"+eAddress.city+" State:"+eAddress.state+" Country:"+eAddress.country);

         }
    }
    class Test{
        public static void main(String[] args) {
            Address a1 = new Address("Pune", "Maharashtra", "India");
            Employee E1 = new Employee(101, "Pruthvi", a1);
            E1.show();
        }
        
    }
