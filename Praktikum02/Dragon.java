public class Dragon {
    int x;
    int y;
    int direction;

    Dragon(int awalX, int awalY, int awalDirection){
        x = awalX;
        y = awalY;
        if (awalDirection >= 1 && awalDirection <= 4) {
            direction = awalDirection;
        } else {
            direction = 1;
        }
    }

    void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("Input tidak sesuai. Gunakan angka \n1:atas\n2:kanan\n3:bawah\n4:kiri");
        }
    }

    void move(int steps){
        switch (this.direction) {
            case 1:
                this.y += steps;
                break;
            case 2:
                this.x += steps;
                break;
            case 3:
                this.y -= steps;
                break;
            case 4:
                this.x -= steps;
                break;
            default:
                System.out.println("Arah belum diatur");
                break;
        }
    }

    void printStatus(){
        String statusDirection;
        switch (this.direction) {
            case 1:
                statusDirection = "Atas";
                break;
            case 2:
                statusDirection = "Kanan";
                break;
            case 3:
                statusDirection = "Bawah";
                break;
            case 4:
                statusDirection = "Kiri";
                break;
            default:
                statusDirection = "Tidak diketahui";
                break;
        }

        System.out.println("Koordinat\t: " + "(" + this.x + "," + this.y + ")");
        System.out.println("Arah\t\t: " + statusDirection);
        System.out.println("====================");
    }
}