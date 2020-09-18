public class DictionaryCommand {

    //dictionaryBasic
    public void dictionaryBasic() {

        DictionaryManagement DM = new DictionaryManagement();
        DictionaryCommandline DCL = new DictionaryCommandline();
        Dictionary dictionaryTest = DM.insertFromCommandline();
        DCL.showAllWords(dictionaryTest);
    }
}
