package drawing.writing;

import drawing.shapes.Shape;

import java.io.IOException;
import java.io.Writer;

public interface ImageWriter extends AutoCloseable {

    void write(Shape shape) throws IOException;
}
