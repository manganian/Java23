package pl.chojnacki.lesson3.example.hospital;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("kids", "12341");
        doctor.setName("Mateusz");
        doctor.setSurname("Marczak");


        Nurse nurse = new Nurse();
        nurse.setName("Helena");
        nurse.setSurname("Basen");
        nurse.level = "Salowa";

//    Employee employee = new Employee();
//    employee.name = "Normal";
//    employee.surname = "Surname";

        System.out.println(doctor.getLicense());
        doctor.setLicense("brak");
        System.out.println(doctor.getLicense());



    }
}
