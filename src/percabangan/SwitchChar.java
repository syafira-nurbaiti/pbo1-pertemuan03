package percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("Mhs	    : \"Terima Kasih Pak\"");
                System.out.println("Dosen   : \"Belajar yang rajin\"");
                break;
            case 'B':
                System.out.println("Mhs	    : \"Kenapa ulun kada dapa A, pak?\"");
                System.out.println("Dosen   : \"Karena ikam pintarr\"");
                break;
            case 'C':
                System.out.println("Mhs	    : \"Ulun turun tarus pak ae,tugas ngumpul jua\"");
                System.out.println("Dosen   : \"Tapi bisalah menjawab ujian atau kuisnya?\"");
                System.out.println("Mhs	    : \"heheheh,,anu pa ae anu\"");
                break;
            default:
                System.out.println("Mhs	    : \"Ulun turun tarus Pak ae, tugas ngumpul jua\"");
                System.out.println("Dosen   : \"Iya jua kah jar?\"");
                System.out.println("Dosen   : \"*memeriksa berkas\"");
                System.out.println("Dosen   : \"*tugasnya kurang\"");
                System.out.println("Mhs     : \"Eheee anu\"");
                break;
        }
    }
}
