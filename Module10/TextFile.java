package Module10;

import java.util.ArrayList;

/**
 * @author Omar Rahman
 * @version 5/4/2015
 */

public class TextFile {

    private String fileName;

    private ArrayList<String> words;

    // constructors not shown
    // postcondition: returns the number of bytes in this file

    public int fileSize() {
        return 0;
    }

    // precondition: 0 <= index < words.size()

    // postcondition: removes numWords words from the words ArrayList beginning at

    // index.

    public void deleteWords(int index, int numWords) {
        if (0 <= index) {
            words.remove(numWords);
        }
    }

    // precondition: 0 <= index <= words.size()

    // postcondition: adds elements from newWords array to words ArrayList beginning

    // at index.

    public void addWords(int index, String[] newWords) {

    }

}
