public class motorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(40);  
        motor2.displayInfo();
        
        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();

        // kecepatan lebih dari 100
        Motor motor4 = new Motor();
        motor4.setPlatNomor("S 9187 AD");
        motor4.setStatusMesin(true);
        motor4.setKecepatan(200);  
        motor4.displayInfo();

        // kecepatan diisi negatf
        Motor motor5 = new Motor();
        motor5.setPlatNomor("AG 6754 AY");
        motor5.setStatusMesin(true);
        motor5.setKecepatan(-30);  
        motor5.displayInfo();
    }
}


