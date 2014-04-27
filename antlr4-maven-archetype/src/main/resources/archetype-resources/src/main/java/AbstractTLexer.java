package ${package};

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

/**
 * This is the super class for the lexer. It is extended by the lexer class
 * generated from TLexer.g.
 *
 * Do not place code and declarations in the lexer .g files, use
 * a superclass like this and place all the support methods and
 * error overrides etc in the super class. This way you will keep
 * the lexer grammar clean and hunky dory.
 *
 * @author Jim Idle - Temporal Wave LLC (jimi@idle.ws)
 * @author Julio C. Rocha (julio@rochsquadron.net)
 */
public abstract class AbstractTLexer extends Lexer {

    /**
     * Default constructor for the lexer, when you do not yet know what
     * the character stream to be provided is.
     */
    public AbstractTLexer() {
        super();
    }

    /**
     * Create a new instance of the lexer using the given character stream as
     * the input to lex into tokens.
     *
     * @param input A valid character stream that contains the ruleSrc code you
     *              wish to compile (or lex at least)
     */
    public AbstractTLexer(CharStream input) {
        super(input);
    }

}
