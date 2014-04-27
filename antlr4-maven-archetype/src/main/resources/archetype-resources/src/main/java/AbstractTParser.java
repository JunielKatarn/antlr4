package ${package};

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;

/**
 * The super class of the generated parser. It is extended by the generated
 * code because of the superClass optoin in the .g file.
 *
 * This class contains any helper functions used within the parser
 * grammar itself, as well as any overrides of the standard ANTLR Java
 * runtime methods, such as an implementation of a custom error reporting
 * method, symbol table populating methods and so on.
 *
 * @author Jim Idle - Temporal Wave LLC - jimi@temporal-wave.com
 * @author Julio C. Rocha (julio@rochsquadron.net)
 */
public abstract class AbstractTParser extends Parser {
	
    /**
     * Create a new parser instance, pre-supplying the input token stream.
     * 
     * @param input The stream of tokens that will be pulled from the lexer
     */
    protected AbstractTParser(TokenStream input) {
        super(input);
    }
	
	/**
     * Creates the error/warning message that we need to show users/IDEs when
     * ANTLR has found a parsing error, has recovered from it and is now
     * telling us that a parsing exception occurred.
     *
     * @param tokenNames token names as known by ANTLR (which we ignore)
     * @param e The exception that was thrown
     */
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {

        // This is just a place holder that shows how to override this method
        //
    }

}
