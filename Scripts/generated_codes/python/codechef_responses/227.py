*/

#include <stdio.h>

int main()
{
    int t, n, i, j, count;
    scanf("%d", &t);
    for (i = 0; i < t; i++)
    {
        count = 1;
        scanf("%d", &n);
        int arr[n];
        for (j = 0; j < n; j++)
        {
            scanf("%d", &arr[j]);
        }
        for (j = 1; j < n; j++)
        {
            if (arr[j] <= arr[j - 1])
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        printf("%d\n", count);
    }
    return 0;
}