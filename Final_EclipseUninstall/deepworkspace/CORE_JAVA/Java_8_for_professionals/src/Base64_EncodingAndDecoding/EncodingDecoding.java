package Base64_EncodingAndDecoding;

import java.util.Base64;

/**
 * 
 * <pre>
 * Binary text to encoding.
 * Way of preserving special characters while transferring text
 * 
 * Takes three char as input and generate four char as a output!
 * 
 * Use ASCII code
 * 
 * example:
 * ENGLISH					B 			y 			e 
 * ASCII NUMBER				66 			121 		101
 * BINARY 8 BIT			0100 0010     0111 1001    0110 0101
 * SAME IN 6 BIT GROUP	0100 00 10    0111 1001	  01 10 0101
 * TRANSLATE TO DECIMAL 	8		39			37		37
 * DEC TO ASCII				Q 		n 			l 		l
 * 
 * if binary count is for 4 char 32
 * then 6/5 = 30
 * so in this case it use = sign as a filler.
 * 
 *  </pre>
 */
public class EncodingDecoding {

	public static void main(String[] args) {

		byte[] byetsArr= "Bye".getBytes();	
		
		String encoded= Base64.getEncoder().encodeToString(byetsArr);
		
		System.out.println("encoded: "+encoded);
		
		String decoded= new String(Base64.getDecoder().decode(encoded));
		System.out.println("decoded: "+decoded);
		
	}

}
