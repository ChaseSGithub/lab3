import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    checkingStrings sc = new checkingStrings();
    @Test
    public void testFilter(){
        List<String> testList1 = new ArrayList<>();
        testList1.add("shame");
        testList1.add("shame");
        testList1.add("shadow");
        testList1.add("shave");
        testList1.add("shackle");
        testList1.add("brains");
        testList1.add("horse");

        List<String> expectedList1 = new ArrayList<>();
        expectedList1.add("shame");
        expectedList1.add("shame");
        expectedList1.add("shadow");
        expectedList1.add("shave");
        expectedList1.add("shackle");

        

        assertEquals(expectedList1, ListExamples.filter(testList1, sc));
    }

    @Test
    public void testMerge(){
        List<String> mergeList1 = new ArrayList<>(Arrays.asList("a", "a", "a"));
        List<String> mergeList2 = new ArrayList<>(Arrays.asList("a", "a", "a"));
        List<String> expectedResult = new ArrayList<>(Arrays.asList("a", "a", "a", "a", "a", "a" ));

        assertEquals(expectedResult,ListExamples.merge(mergeList1, mergeList2));

        
    }
}
