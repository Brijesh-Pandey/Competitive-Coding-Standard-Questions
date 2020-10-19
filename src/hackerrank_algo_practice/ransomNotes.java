/*
Problem link - > https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
Problem Statement
Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the right words, but there's a case mismatch. The answer is No.

Function Description

Complete the checkMagazine function in the editor below. It must print  Yes  if the note can be formed using the magazine, or No.

checkMagazine has the following parameters:

magazine: an array of strings, each a word in the magazine
note: an array of strings, each a word in the ransom note
Input Format

The first line contains two space-separated integers,m  and n, the numbers of words in the magazine and the note..
The second line contains m space-separated strings, each magazine[i].
The third line contains n space-separated strings, each note[i].
Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note. Otherwise, print No.

Sample Input 0

6 4
give me one grand today night
give one grand today
Sample Output 0

Yes
Sample Input 1

6 5
two times three is not four
two times two is four
Sample Output 1

No
Explanation 1

'two' only occurs once in the magazine.

Sample Input 2

7 4
ive got a lovely bunch of coconuts
ive got some coconuts
Sample Output 2

No
Explanation 2

Harold's magazine is missing the word some .

// Approach
Getting all the words of note array in a map with frequency of each word,
then traversing magazine array and if the same word is there than reduce its frequency by one and if frequncy becomes 0 than remove the entry from map
and at last check if the map size is 0 than Yes else No.
*/

    // code
    
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<String , Integer>();
        int len = note.length;
        int val = 0 ;
        for(int i = 0 ; i < len ; i++){
            if(map.containsKey(note[i])){
                // increase its frequncy
                map.put(note[i],map.get(note[i])+1);
            }
            else{
                map.put(note[i] , 1);
            }
        }
        for(int i = 0 ; i < magazine.length; i++){
            if(map.containsKey(magazine[i])){
                map.put(magazine[i],map.get(magazine[i])-1);
            }
            if(map.containsKey(magazine[i])){
               int k = map.get(magazine[i]);
               if(k==0){
                   // delete entry from map
                   map.remove(magazine[i]);
               }
            }            
        }
        if(map.size()==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
