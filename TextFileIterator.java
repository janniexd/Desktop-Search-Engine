import java.util.NoSuchElementException;

public class TextFileIterator implements java.util.Iterator<String> {
    private String text;

    public TextFileIterator(Resource res) {
        if(res == null) throw new NullPointerException();
        text = getAsString(res);
        text = text.replaceAll("-\n(?=[a-z])", "");
    }


    @Override
    public boolean hasNext() {
        int idx = 0;
        while (idx < text.length()){
            if(Character.isDigit(text.charAt(idx)) || Character.isLetter(text.charAt(idx))) return true;
            idx++;
        }
        return false;
    }

    @Override
    public String next() {
        int beginIdx = 0;
        while (beginIdx < text.length() && !Character.isLetter(text.charAt(beginIdx)) &&
                !Character.isDigit(text.charAt(beginIdx))) {
            beginIdx++;
        }
        int idx = beginIdx;
        //search for word
        while (idx < text.length() && (Character.isLetter(text.charAt(idx)) ||
                Character.isDigit(text.charAt(idx)))) {
            idx++;
        }
        if (beginIdx == idx) {
            throw new NoSuchElementException();
        }
        String word = text.substring(beginIdx, idx);
        text = text.substring(idx);
        return word;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String getAsString(Resource res) {
        return "We wish you good luck in this exam!\nWe hope you are well pre-\npared.";
    }

}