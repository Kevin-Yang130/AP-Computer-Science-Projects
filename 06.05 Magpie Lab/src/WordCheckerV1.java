public class WordCheckerV1 {
    // instance variable myWords contains an array of String values  storing the words.
// The instance variable myNumWords contains the number of words  found in the phrase.
// The instance variable myTargetWord contains a target word from  the phrase that is to be located in the array
// The constructor accepts a String array with the words, an int  representing the number of words in the phrase and a String  representing the target word.
// There may be other instance variables, constructors and methods  not shown
    private String [] myWords;
    private int myNumWords;
    private String myTargetWord;
    public WordCheckerV1(String [] words, int numWords, String targetWord) {
        myWords = words;
        myNumWords = numWords;
        myTargetWord = targetWord;
    }
    public boolean isWithin()
    {
        for (String word : myWords) {
            if (word.equals(myTargetWord)) {
                return true;
            }
        }
        return false;
    }
    public boolean sameNumber() {

            if ( myWords.length == myNumWords){
                return true;
            } else {
                return false;
    }
}

}
