/**
 * Put a short phrase describing the program here.
 * 
 * @author Put your name here
 * 
 */
public final class ProgramSkeleton {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private ProgramSkeleton() {
    }

    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Put your main program code here
         */
    }


    while (!in.atEOS()) { 
        //create a new index 
        int i = 0; 
        String lineOfText = in.nextLine(); 
        //read the file one word a time 
        //if it doesn't exist, add it, add 1 
        //if it exists, increment the value by 1. 
        while (i < lineOfText.length() - 1) { 
            String word = nextWordOrSeparator(lineOfText, i, setOfSeparators); 
            if (!setOfSeparators.contains(word.charAt(0))) { 
                if (mappedTerms.hasKey(word)) { 
                    int count = mappedTerms.value(word) + 1; 
                    //counts were all 1 so - 
                    //need to use .replaceValue to add count to 1 and override it 
                    mappedTerms.replaceValue(word, count); } 
                else {
                    mappedTerms.add(word, 1); 
                    } 
                } 
            //increment index to the length of the word 
            i += word.length(); 
            }
                }
            }
        }
    }

    }
