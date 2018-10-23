/*
* Kelas pertama belajar di binar
* */
public class HelloWorld {
//    Method main yang akan pertama kali di jalankan
    public static void main(String[] args){
        /*
        * System = Set perintah pada komputer
        * out    = memberitahu pada komputer untuk menampilkan output pada layar console
        * print  = mencetak String pada layar console
        * */

        System.out.println("Hello World"); // print Hello World message pindah baris (ln)
        System.out.println("Binarian");

        // print kalimat dalam satu baris
        System.out.print("Belajar back end \n");
        System.out.print("Di Binar Academy BSD");

        System.out.print("\n"); // pindah baris dengan '\n'

//      ====================================================
//        System.out.println("My first line");
//        System.out.println();
//        System.out.println("My second line");
//        System.out.println();
//        System.out.println("My third line");

        Nama();
    }

    public static void Nama(){
        System.out.println("Nama saya ikhsan");

        int x = 10; // define variable x dengan nilai 10
        int y = 5;  // define variable x dengan nilai 5
        int value = x * y; // define variable value yang melakukan perkalian dari x dan y

        System.out.print("Hasil perkalian "+x+" dan "+y+" adalah: "+value+"\n");

        y = 6; // set new value of y
        value = x * y; // define variable value yang melakukan perkalian dari x dan y
        System.out.print("Hasil perkalian kedua "+x+" dan "+y+" adalah: "+value);
    }
}
