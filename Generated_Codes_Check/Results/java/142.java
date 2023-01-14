/*

The password at the Server[5] is 314. It's a Non-Power Password and Chef will crack it using binary search. All Non-Power Passwords less than 314 are less than 100, so Chef will try the password 100 first and indicator will become red. Then he will try the password 50 (indicator becomes green), 25 (indicator becomes green), 12 (indicator becomes green), 6 (indicator becomes green), 3 (indicator becomes green), 1 (indicator becomes red), 2 (indicator becomes red). At this step he sets L = 1 and R = 3 and continue the process. It takes him 3 seconds to crack this server.

The password at the Server[6] is 100. It's a Power Password and Chef will crack it by the iterative way. He will start from the Power Password 4 and will immediately see that 4 ≤ 100. He will then try the password 8 and again will see that 8 ≤ 100. Then he will try the password 9, which is greater than 100, so he will stop here. It takes him 3 seconds to crack this server.

https://www.codechef.com/problems/ALIEN1
*/
#include <stdio.h>
#include <math.h>

enum Color
{
    RED,
    GREEN,
};

enum Boolean
{
    FALSE,
    TRUE,
};

int isPowerPassword(int num)
{
    double root = sqrt(num);
    if (root == (int)root)
    {
        return TRUE;
    }

    return FALSE;
}

enum Color getColor(int num, int actualPassword)
{
    return num > actualPassword ? RED : GREEN;
}

int binarySearch(int serverPasswords[], int numOfServers, int low, int high, int actualPassword)
{
    while (low < high)
    {
        int mid = low + (high - low) / 2;
        enum Color color = getColor(serverPasswords[mid], actualPassword);
        if (GREEN == color)
        {
            low = mid + 1;
        }
        else if (RED == color)
        {
            high = mid;
        }
        else
        {
            break;
        }
    }

    return low;
}

int crackPowerServer(int serverPassword)
{
    int numOfPowerPasswords = 0;
    int powerPasswords[] = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100};
    int idx = 0;
    while (idx < sizeof(powerPasswords) / sizeof(powerPasswords[0]) && powerPasswords[idx] <= serverPassword)
    {
        numOfPowerPasswords++;
        idx++;
    }

    return numOfPowerPasswords;
}

int crackServer(int serverPassword, int serverIdx, int serverPasswords[], int numOfServers)
{
    if (isPowerPassword(serverPassword))
    {
        return crackPowerServer(serverPassword);
    }

    int idx = binarySearch(serverPasswords, numOfServers, 0, serverIdx - 1, serverPassword);
    if (idx < serverIdx - 1)
    {
        return 2 * idx;
    }
    else
    {
        int low = idx, high = 2 * idx;
        return binarySearch(serverPasswords, numOfServers, low, high, serverPassword);
    }
}

int main()
{
    int numOfServers = 6;
    int serverPasswords[] = {9, 0, 7, 1, 314, 100};

    for (int idx = 0; idx < numOfServers; idx++)
    {
        printf("%d ", crackServer(serverPasswords[idx], idx, serverPasswords, numOfServers));
    }

    return 0;
}