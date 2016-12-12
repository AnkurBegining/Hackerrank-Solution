package Ankur;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		//System.out.print(ch);
		int count =0;
		for(int i=0;i<s.length();i++){
			if(ch[i]>='a' && ch[i]<='z')
				break;
			count++;
		}
		System.out.println(count+1);

	}

}
