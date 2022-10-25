package oopPack3;

public class StudentMain {
    public static void main(String[] args) {
        //set
        Student student=new Student();
        student.setId(-100);
        student.setName("Cahid");
        student.setSurname("NabizaDA");
        student.setBirthPlace("BaKU");
        student.setActive(false);


        //get
       // System.out.println("nomresi: "+ student.getId() + " adi: " + student.getName()+ " soyadi: " + student.getSurname()+ " dogum yer: "+ student.getBirthPlace());
       // student.printData();
        System.out.println(student);
    }
}
