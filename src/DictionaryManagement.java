import java.util.Scanner;

public class DictionaryManagement {

    //insertFromCommandline
    public Dictionary insertFromCommandline() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong tu: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Dictionary x = new Dictionary(n);

        for (int i = 0; i < n; i++) {
            x.words[i] = new Word();
            System.out.println("Nhap vao targer thu " + (i + 1));
            String a = scanner.nextLine();
            x.words[i].setWord_target(a);

            System.out.println("Nhap vao explain thu " + (i + 1));
            String b = scanner.nextLine();
            x.words[i].setWord_explain(b);
        }
        return x;
    }
}
