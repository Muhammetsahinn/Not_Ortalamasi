import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double mat;
        double tur;
        double fiz;
        double kim;
        double muz;
        double tar;

        Scanner input = new Scanner(System.in);

        System.out.println("Ders notlarini giriniz : ");

        mat = input.nextDouble();
        tur = input.nextDouble();
        fiz = input.nextDouble();
        kim = input.nextDouble();
        muz = input.nextDouble();
        tar = input.nextDouble();

        double ort = ((mat+tur+fiz+kim+muz+tar)/6);

        System.out.print("Ortalama : ");

        System.out.println(ort);

        boolean kosul = ort>=60;

        String str = kosul ? "Sinifi gecti" : "Sinifta kaldi";
        System.out.println(str);
        System.out.println();

    }
}
