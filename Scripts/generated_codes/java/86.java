/*

https://www.codechef.com/problems/DWARFS
*/
#include <stdio.h>

enum Boolean
{
    FALSE,
    TRUE
};

enum Boolean canBreakAllForts(int numOfForts, int key, int *permutation)
{
    int idx = 0, fortIdx = 1;
    for (idx = 0; idx < numOfForts; idx++)
    {
        if (permutation[idx] < fortIdx - key || permutation[idx] > fortIdx + key)
        {
            return FALSE;
        }

        fortIdx++;
    }

    return TRUE;
}

void printPermutation(int *permutation, int numOfForts)
{
    int idx = 0;
    for (idx = 0; idx < numOfForts; idx++)
    {
        printf("%d ", permutation[idx]);
    }
}

void findPermutation(int numOfForts, int key, int *permutation)
{
    int fortIdx = 1, idx = 0;
    for (idx = 0; idx < numOfForts; idx++)
    {
        permutation[idx] = fortIdx - key;
        fortIdx++;
    }
}

int main()
{
    int numOfForts = 2, key = 2;
    int permutation[numOfForts];

    findPermutation(numOfForts, key, permutation);
    enum Boolean result = canBreakAllForts(numOfForts, key, permutation);
    if (TRUE == result)
    {
        printPermutation(permutation, numOfForts);
    }
    else
    {
        printf("-1");
    }

    return 0;
}