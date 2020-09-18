public class DictionaryCommandline {

    //showAllWords
    public void showAllWords(Dictionary x) {
        System.out.println("No\t|English\t|Vietnamese");

        for (int i = 0; i < x.words.length; i++) {

            System.out.print((i + 1) + "\t|");
            System.out.print(x.words[i].getWord_target());
            System.out.print("\t\t\t|");
            System.out.print(x.words[i].getWord_explain());
            System.out.print("\n");
        }
    }

}
