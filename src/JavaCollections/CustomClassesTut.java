package JavaCollections;


//Custom class example
class Data {
    private Integer age;
    private String name;
    private InternalData internalData;

    Data (Integer _age , String _name , int _revenue) {
        this.age = _age;
        this.name = _name;
        this.internalData = new InternalData(_revenue);
    }

    public  void setAge (Integer _age) {
       this.age = _age;
    }

    public  void setName (String _name) {
        this.name = _name;
    }

    public int getAge() {
        return  age;
    }

    public String getName () {
        return  name;
    }

//    to access the getter method of inner getRevenue()
    public int getRevenue() {
        return internalData.getRevenue();
    }

//    class inside a class
     class InternalData {
        Integer revenue;
        InternalData (int _revenue) {
            this.revenue = _revenue;
        }
        public int getRevenue () {
            return revenue;
        }
    }

}


public class CustomClassesTut {
    public static void main(String[] args) {
        Data d1 = new Data(21 , "Ashish" , 500000000);
        Data d2 = new Data(22 , "Madhur" , 12000000);
//        System.out.println(d1.age);

        System.out.println(d1.getAge());
        System.out.println(d2.getAge());
        System.out.println(d1.getRevenue());

        d2.setAge(25);
        System.out.println(d2.getAge());
    }
}
