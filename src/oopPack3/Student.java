package oopPack3;

public class Student {
      private int id;
    private String name;
     private String surname;
    private String birthPlace;
    private boolean isActive;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = Math.abs(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname.toUpperCase();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {

        this.birthPlace = birthPlace.toUpperCase();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", isActive=" + isActive +
                '}';
    }
/*void printData(){
        if(isActive){
            System.out.println("nomresi: "+ id + " adi: " + name+ " soyadi: " + surname+ " dogum yer: "+ birthPlace);
        }

    }*/
}

