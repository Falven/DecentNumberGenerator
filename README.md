# DecentNumberGenerator
Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus; however, he also gives him a clue—a number, N
N
. Sherlock determines the key to removing the virus is to find the largest Decent Number having N
N
 digits.

A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
If there are more than one such number, we pick the largest one.
Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!

Constraints
1≤T≤20
1
T
20

1≤N≤100000
1
N
100000



Input Format

The first line is an integer, T
T
, denoting the number of test cases.

The T
T
 subsequent lines each contain an integer, N
N
, detailing the number of digits in the number.

Output Format

Print the largest Decent Number having N
N
 digits; if no such number exists, tell Sherlock by printing -1.

Sample Input

4
1
3
5
11
Sample Output

-1
555
33333
55555533333
Explanation

For N=1
N
1
, there is no decent number having 1
1
 digit (so we print −1
1
).
For N=3
N
3
, 555
555
 is the only possible number. The number 5
5
 appears three times in this number, so our count of 5
5
's is evenly divisible by 3
3
 (Decent Number Property 3).
For N=5
N
5
, 33333
33333
 is the only possible number. The number 3
3
 appears five times in this number, so our count of 3
3
's is evenly divisible by 5
5
 (Decent Number Property 2).
For N=11
N
11
, 55555533333
55555533333
 and all permutations of these digits are valid numbers; among them, the given number is the largest one.
