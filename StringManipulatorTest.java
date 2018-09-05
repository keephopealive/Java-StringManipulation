public class StringManipulatorTest {
    public static void main(String[] args) {
        System.out.println("Running... StringManipulatorTest.java");
        
        StringManipulator manipulator = new StringManipulator();
        
        String myStr = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(myStr);

        Integer myIntA = manipulator.getIndexOrNull("Hello World", 'e');
        System.out.println(myIntA);

        Integer myIntB = manipulator.getIndexOrNull("Hello Universe", "Universe");
        System.out.println(myIntB);

        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld

    }
}