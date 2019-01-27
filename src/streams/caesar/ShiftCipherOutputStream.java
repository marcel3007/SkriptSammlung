package streams.caesar;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * https://codereview.stackexchange.com/questions/36884/critique-of-filterinputstream-and-filteroutputstream-classes
 */
public class ShiftCipherOutputStream extends FilterOutputStream {

    private int key = 0;

    public ShiftCipherOutputStream(OutputStream out) {
        super(out);
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b + key);
    }
}
