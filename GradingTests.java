import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GradingTests {
    @Test
    public void testFile1() {
        String contents = "[]()";
        List<String> expect = List.of("");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile2() {
        String contents = "[](";
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

}
