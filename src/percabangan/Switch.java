package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan=4;
        switch(jalanJalan) {
            case 1:
                System.out.println("Ke Pasar");
                break;
            case 2:
                System.out.println("Ke Warung");
                break;
            case 3:
                System.out.println("Ke Rumah Temen");
                break;
            case 4:
                System.out.println("Ke Rumah Mantan");
                break;
            default:
                System.out.println("Kemana aja boleh");
                break;
        }
    }
}
