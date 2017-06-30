import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String [] args) throws IOException{
		Reader.init(System.in);
		long t = Reader.nextlong();
		while(t-- >0){
			long x = Reader.nextlong();
			long y = Reader.nextlong();
			long z = Reader.nextlong();
			long c = (z/2);
			long d = z-c;
			if(z==1){
				long i = x*2;
				long w = Math.max(i,y);
				long e = Math.min(i,y);
				long j = w/e;
				System.out.println(j);
			}else if(z%2 == 0){
				long n = (long) (x*Math.pow(2,z/2));
				long m = (long) (y*Math.pow(2,z/2));
				long w = Math.max(n,m);
				long e = Math.min(n,m);
				long l = w/e;
				System.out.println(l);
			}else if(z%2 == 1){
				long a = (long) (x*Math.pow(2,d));
				long b = (long) (y*Math.pow(2,c));
				long w = Math.max(a,b);
				long e = Math.min(a,b);
				long j = w/e;
				System.out.println(j);
			}
		}
	}
}










/** Class for buffered reading long and double values */
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

    static long nextlong() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}