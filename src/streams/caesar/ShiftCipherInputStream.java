package streams.caesar;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * https://codereview.stackexchange.com/questions/36884/critique-of-filterinputstream-and-filteroutputstream-classes
 */
public class ShiftCipherInputStream extends FilterInputStream {


    private int key = 0;

    protected ShiftCipherInputStream(InputStream in) {
        super(in);
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int b = super.read();
        return (b != -1 ? b - key : b);
    }
}
