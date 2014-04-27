package ${package};

import java.io.File;
import java.io.FileNotFoundException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Test driver program for the ANTLR3 Maven Architype demo
 *
 * @author Jim Idle (jimi@temporal-wave.com)
 * @author Julio C. Rocha (julio@rochsquadron.net)
 */
class Main {
	
	private static boolean makeDot = false;
	
	static TLexer lexer;

	/**
	 * Just a simple test driver for the ASP parser
     * to show how to call it.
     */
	public static void main(String[] args) {
		try {
			// Create the lexer, which we can keep reusing if we like
			//
			CharStream c = null;
			lexer = new TLexer(c);//TODO: Have v4 generate default ctor
			
			if (args.length > 0) {
				int s = 0;
				
				if (args[0].startsWith("-dot")) {
					makeDot = true;
					s = 1;
				}
				// Recursively parse each directory, and each file on the
				// command line
				//
				for(int i=s; i<args.length; i++) {
					parse(new File(args[i]));
				}
			} else {
				System.err.println("Usage: java -jar ${artifactId}-${version}-jar-with-dependencies.jar <directory | filename.dmo>");
			}
		} catch(Exception ex) {
			System.err.println("ANTLR demo parser threw exception:");
			ex.printStackTrace();
		}
	}
	
	public static void parse(File source) throws Exception {
		// Open the supplied file or directory
		//
		try {
			// From here, any exceptions are just thrown back up the chain
			//
			if (source.isDirectory()) {
				System.out.println("Directory: " + source.getAbsolutePath());
				String files[] = source.list();
				
				for(int i=0; i<files.length; i++) {
					parse(new File(source, files[i]));
				}
			} 
			// Else find out if it is an ASP.Net file and parse it if it is
			//
			else {
				// File without paths etc
				//
				String sourceFile = source.getName();

				if  (sourceFile.length() > 3) {
					String suffix = sourceFile.substring(sourceFile.length()-4).toLowerCase();

					// Ensure that this is a DEMO script (or seemingly)
					//
					if  (suffix.compareTo(".dmo") == 0) {
						parseSource(source.getAbsolutePath());
					}
				}
			}
		} catch(Exception ex) {
			System.err.println("ANTLR demo parser caught error on file open:");
			ex.printStackTrace();
		}
	}
	
	public static void parseSource(String source) throws Exception {
		
	}
}
