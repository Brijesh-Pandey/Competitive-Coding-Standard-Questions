package ad_hoc;
/*
Ram is on a boat which is parked on another infinitely big boat's swimming pool. Infinitely big boat is on the infinite ocean. The infinitely big boat moves on it's own schedule. It's Schedule is given in the form of character array s of length n.
If the i-th minute (starting from 1st minute, i=1),
char c=s[(i-1)%n]
if c == A, then the infinite boat moves from (x, y) to (x, y+1);
if c == B, then the infinite boat moves from (x, y) to (x, y−1);
if c == C, then the infinite boat moves from (x, y) to (x−1, y);
if c == D, then the infinite boat moves from (x, y) to (x+1, y);
if c == E, then the infinite boat moves from (x, y) to (x+1, y+1);
if c == F, then the infinite boat moves from (x, y) to (x-1, y−1);
if c == G, then the infinite boat moves from (x, y) to (x−1, y+1);
if c== H, then the infinite boat moves from (x, y) to (x+1, y-1);

Ram can move your small boat in any of directions in pool but in one minute you can move only one step in either of 8 directions shown above. Your resultant movement will be sum of movements of smaller and bigger boat.
Given starting positions (x1, x2) and final position (y1, y2) calculate minimum minutes to reach at final position.
Input
First line contains two integers x1, x2 (Starting position)
Second line contains two integers y1, y2 (Final position)
Next line contains integer n (length of s array)
Next line contains n characters which are array S.

Constraints:
0 <= x1, x2, y1, y2 <= 10^9
1 <= n <= 100000
Output
Print the minimum minutes taken to reach at final position from starting position. If it is not possible print -1.
Example
Sample Input
0 0
0 1
1
B

Sample Output
-1

Sample Input
0 0
0 4
3
AAA

Sample Output
2

Explanation :
(0,0) -> (0,2) -> (0,4)
The infinite boat moves to (0, 2) after 2 minutes, and you can move your boat move in the same direction every minute. You will end up on position (0, 4).
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class moves {
    // Main function takes input and call the function for movement of boat
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        String[] line3 = br.readLine().split(" ");
        int x1 = Integer.parseInt(line1[0]);
        int y1 = Integer.parseInt(line1[1]);
        int x2 = Integer.parseInt(line2[0]);
        int y2 = Integer.parseInt(line2[1]);
        int len = Integer.parseInt(line3[0]);
        String move_direction = br.readLine();
    }
    //Function to move the boat as per the string given.
    static int[] move_Boat(int x1, int y1, char c){
        int[] a = new int[2];
        if(c == 'A'){
            a[0] = + 0;
            a[1] = + 1;
        }
        else if(c == 'B'){
            a[0] = + 0;
            a[1] = - 1;
        }
        else if(c == 'C'){
            a[0] = - 1;
            a[1] = + 0;
        }
        else if(c == 'D'){
            a[0] = + 1;
            a[1] = + 0;
        }
        else if(c == 'E'){
            a[0] = + 1;
            a[1] = + 1;
        }
        else if(c == 'F'){
            a[0] = - 1;
            a[1] = - 1;
        }
        else if(c == 'G'){
            a[0] = - 1;
            a[1] = + 1;
        }
        else if(c == 'H'){
            a[0] = + 1;
            a[1] = - 1;
        }
        return a;
    }
}

