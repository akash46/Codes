import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		Reader.init(System.in);
		try{
			int t = Reader.nextInt();
			if(t==0){
				System.out.println("NO");
			}else if(t%2==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
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
            //TODO add check for eof if necessary
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