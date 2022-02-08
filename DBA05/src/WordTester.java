/*
Author: Kevin Yang-Li
Version: 01/30/21
Purpose: Determine if the array contains the same number of words as a specified phrase and check to see if one of the words in the phrase exists within the array.
 */


public class WordTester {
    private String [] myWords;
    private int myNumWords;
    private String myTargetWord;


    public WordTester ( String targetWord, int numWords,String [] words) {
        myTargetWord = targetWord;
        myNumWords = numWords;
        myWords = words;

    }

    public boolean isWithin () {

        boolean have = false;
        for (String word : myWords) {

            if (myTargetWord.equals(word)){
                have = true;
                return have;
            }else {
                have = false;
            }
        }
        return have;
    }

    public boolean sameNumber() {
        int length = myWords.length;

        if (length == myNumWords){
            return true;
        }else{
            return false;
        }
    }
}
