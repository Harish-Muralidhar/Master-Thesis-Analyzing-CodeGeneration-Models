

In the second Sample Input, it is not possible to select all the strings from A. Also, if you select "Bc" from A, then you
cannot use it from B as well.
*/

T = int(input())
for i in range(T):
    N = int(input())
    A = input().split()
    M = int(input())
    B = input().split()
    flag = 1
    for i in A:
        if i[::-1] in B:
            B.remove(i[::-1])
        elif i in B:
            B.remove(i)
        else:
            flag = 0
            break
    if flag == 1:
        print("YES")
    else:
        print("NO")