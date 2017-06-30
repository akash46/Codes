import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		Reader.init(System.in);
		PrintWriter root = new PrintWriter(System.out);
		try{
			int t = Reader.nextInt();
			while(t-->0){
				int m = Reader.nextInt();
				root.println((int)Math.sqrt(m));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		root.flush();
		root.close();
	}
}





















/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}





