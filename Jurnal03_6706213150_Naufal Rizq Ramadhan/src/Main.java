import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList<Pegawai> Pegawai = new SinglyLinkedList<>(  "Daftar Pegawai");
        boolean exit = false;
        while (!exit){
            System.out.println("Pilih:");
            System.out.println("1.Input Data");
            System.out.println("2.Hapus Data");
            System.out.println("3.Cetak");
            System.out.println("4.Close Program");
            int pilih = s.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan data:");
                    System.out.println("NIP:");
                    String nip = s.next();
                    System.out.println("Nama:");
                    String nama = s.next();
                    System.out.println("Divisi:");
                    String divisi = s.next();
                    System.out.println("Menambahkan data pada:");
                    System.out.println("1.Awal List");
                    System.out.println("1.Akhir List");
                    int inputDepanBelakang = s.nextInt();
                    if(inputDepanBelakang == 1){
                        Pegawai.insertAtFront(new Pegawai(nip,nama,divisi));
                    }else if(inputDepanBelakang == 2){
                        Pegawai.insertAtBack(new Pegawai(nip,nama,divisi));
                    }else{
                        System.out.println("Menu doesn't exist");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hapus dari:");
                    System.out.println("1.Awal List");
                    System.out.println("2.Akhir List");
                    int hapusDepanBelakang = s.nextInt();
                    if(hapusDepanBelakang == 1){
                        Pegawai.removeFromFront();
                    }else if(hapusDepanBelakang == 2){
                        Pegawai.removeFromBack();
                    }else{
                        System.out.println("Menu doesn't exist");
                        System.out.println();
                    }
                    break;
                case 3:
                    Pegawai.print();
                    System.out.println();
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                    System.out.print("Menu doesn't exist");
                    System.out.println();

            }
        }
    }
}
