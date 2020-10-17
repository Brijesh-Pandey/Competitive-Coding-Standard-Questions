/* Problem Statement
Given a string S find lexicographically minimum isomorphic string of string S.
Two string s and t are said to be isomorphic when the following conditions are satisfied:
> both s and t have equal lengths
> for every i and j one of the following condition holds:
1 - s[i] == s[j] and t[i] == t[j]
2 - s[i] != s[j] and t[i] != t[j]
Input
Input contains a single string S.

Constraints:
1 <= |S| <= 100000
S contains only lowercase english letters.
Output
Print lexicographically minimum isomorphic string of S.
Note - the ouput string should only contain lowercase english letters.
Sample Input
aaaddd

Sample Output
aaabbb

Explanation: 
for every i and j if s[i] = s[j] then t[i] = t[j] and if s[i] != s[j] then t[i] != t[j] 
aaabb is lexicographically minimum such string.
*/

// Code
package adhoc;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class isoLexo {
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		char ch='a';
		StringBuilder str=new StringBuilder("");

		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
			str.append(str.charAt(map.get(s.charAt(i))));
			}
			else{
				str.append(ch);
				map.put(s.charAt(i),i);
				ch++;
			}
		}
		System.out.println(str.toString());
	}
}
