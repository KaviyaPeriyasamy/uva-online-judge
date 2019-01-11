import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
	  Scanner ip=new Scanner(System.in);
	    String word,h2,h1;
	    int len;
	    StringBuffer reverse;
	    boolean ispal,isrev;
	    char[] ltr = new char[91];
		ltr['A'] = 'A'; ltr['E'] = '3'; ltr['H'] = 'H';
		ltr['I'] = 'I'; ltr['J'] = 'L'; ltr['L'] = 'J';
		ltr['M'] = 'M'; ltr['O'] = 'O'; ltr['S'] = '2';
		ltr['T'] = 'T'; ltr['U'] = 'U'; ltr['V'] = 'V';
		ltr['W'] = 'W'; ltr['X'] = 'X'; ltr['Y'] = 'Y';
		ltr['Z'] = '5'; ltr['1'] = '1'; ltr['2'] = 'S';
		ltr['3'] = 'E'; ltr['5'] = 'Z'; ltr['8'] = '8';
	   	while (ip.hasNextLine())
	        {
	        word = ip.nextLine();
	        if(word == null)
	        {
	            break;
	        }
	        System.out.print(word);
	        len=word.length();
	        ispal=false;
	        isrev=false;
	        reverse = new StringBuffer(word);
			reverse = reverse.reverse();
			if (word.equals(reverse.toString()))
			{
				ispal = true;
				reverse.delete(0, reverse.length());
				for (int i=0 ;i<len; i++)
				{
					reverse.append(ltr[word.charAt(i)]);
				}
				if (word.equals(reverse.toString()))
				{
					isrev = true;
				} 
				if (isrev && ispal)
				{
					System.out.println(" -- is a mirrored palindrome.\n" 	);
				} 
				else if (ispal)
				{
					System.out.println(" -- is a regular palindrome.\n");
				}
			}
			else 
			{
				if(len % 2 == 0)
				{
					len /= 2;
					h2 = word.substring(len);
				} 
				else
				{
					len = ((len -1)/2)+1;
					h2 = word.substring(len-1);
				}
				h1 = word.substring(0,len);
				
				reverse.delete(0, reverse.length());
				for (int i=0 ;i<len; i++)
				{
					reverse.append(ltr[h1.charAt(i)]);
				}
				reverse = reverse.reverse();
				if (reverse.toString().equals(h2))
				{
					System.out.println(" -- is a mirrored string.\n");
				} 
				else
				{
					System.out.println(" -- is not a palindrome.\n");
				}
			}
	    }
	
	}
}