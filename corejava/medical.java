package basics.corejava;

public class medical {
    String Patient_Name;
    int age;
    String Location;
    int Phone_No;
    String Disease;
    int No_Of_Days;
    int Fee;

    @Override
    public String toString() {
        return "Patient_Name=" + Patient_Name + ", Disease=" + Disease + ", Location=" + Location + ", No_Of_Days=" + No_Of_Days
                +  ", Phone_No=" + Phone_No + ", age=" + age + ", Fee=" + Fee;
    }

    public medical(String patient_Name, int age, String location, int phone_No, String disease, int no_Of_Days,
            int fee) {
        Patient_Name = patient_Name;
        this.age = age;
        Location = location;
        Phone_No = phone_No;
        Disease = disease;
        No_Of_Days = no_Of_Days;
        Fee = fee;
        
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        Patient_Name = patient_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getPhone_No() {
        return Phone_No;
    }

    public void setPhone_No(int phone_No) {
        Phone_No = phone_No;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String disease) {
        Disease = disease;
    }

    public int getNo_Of_Days() {
        return No_Of_Days;
    }

    public void setNo_Of_Days(int no_Of_Days) {
        No_Of_Days = no_Of_Days;
    }

    public int getFee() {
        return Fee;
    }

    public void setFee(int fee) {
        Fee = fee;
    }

    public medical() {
        Patient_Name = "RAJU";
        age = 19;
        Location = "Agra";
        Phone_No = 911234567;
        Disease = "Fever";
        No_Of_Days = 8;
        Fee = 900;
    }

    public static void main(String[] args) {
        medical p1, p2, p3;

        p1 = new medical();
        p2 = new medical("RAMU", 19, "delhi", 6765465, "CoVID", 3, 50);
        p3 = new medical("Nikhil", 25, "PUNE", 987654, "HEPATITIES", 7, 100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

       