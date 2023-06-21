import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*      What is a Regular Expression?
        A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

        A regular expression can be a single character, or a more complicated pattern.

        Regular expressions can be used to perform all types of text search and text replace operations.

        Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

        Pattern Class - Defines a pattern (to be used in a search)
        Matcher Class - Used to search for the pattern
        PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 */
public class RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("I will learn the regEx in today", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("regEx lkfj");

        boolean matchFind = matcher.find();
        if (matchFind){
            System.out.println("Match Found");
        } else {
            System.out.println("Match Not Found");
        }
    }
}
