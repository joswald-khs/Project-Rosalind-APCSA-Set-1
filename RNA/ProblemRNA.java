
/**
 * Write a description of class ProblemRNA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemRNA
{
    public static void main() {
        // replace this string with the one from Project Rosalind
        final String inputDNA = "GATGGAACTTGACTACGTAAATT";
        final String output = transcribeDNAtoRNA(inputDNA);
        // you can copy and paste from the terminal window into 
        //   Project Rosalind to check your answer
        System.out.println(output);
    }
        
    // This should take the given string and return an int
    //   array of how many times each letter occurs in the 
    //   string. Ideally in A C G T order. 
    private static String transcribeDNAtoRNA(String dnaString) {
        return "GAUGGAACUUGACUACGUAAAUU";
    }    
}