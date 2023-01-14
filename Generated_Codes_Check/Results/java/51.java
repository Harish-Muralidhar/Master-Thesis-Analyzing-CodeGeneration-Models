/*


*/

/*

Approach:

Let us consider each of the cells as a vertex of the graph. Each cell will have four neighbours, if it is not on the boundary of matrix. If a cell is on the boundary of matrix, it will have fewer neighbours. We can use BFS to find the minimum number of steps required.

We will use a visited array to mark the cells visited. Note that since we have to visit all the cells (i.e. N^2 cells), we will have to do N^2 iterations of BFS. Note that in each iteration we need to start from a different cell.

We can think of the direction of the BFS traversal as going from higher value cells to the lower value cells. We will start with the cell which is at the back of the queue and process it. We will keep a counter of the number of steps needed to reach the destination cell. If a cell is already visited, we will not consider it. If it is not visited, we will visit all its neighbours and push them at the end of the queue, and increase the counter by 1.

*/

#include <bits/stdc++.h>
using namespace std;

#define MAX 500

int bfs(int arr[MAX][MAX], int visited[MAX][MAX],
        int N, int x, int y)
{
    int x_move[4] = { 0, 1, 0, -1 };
    int y_move[4] = { -1, 0, 1, 0 };
    int steps = 0;

    queue<pair<int, int> > q;
    q.push({x, y});
    visited[x][y] = 1;

    while (!q.empty())
    {
        int size = q.size();

        while (size--)
        {
            int curr_x = q.front().first;
            int curr_y = q.front().second;
            q.pop();

            for (int i = 0; i < 4; i++)
            {
                int next_x = curr_x + x_move[i];
                int next_y = curr_y + y_move[i];

                if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= N)
                    continue;

                if (!visited[next_x][next_y] && arr[next_x][next_y] ==
                    arr[curr_x][curr_y] - 1)
                {
                    q.push({next_x, next_y});
                    visited[next_x][next_y] = 1;
                }
            }
        }
        steps++;
    }
    return steps;
}

int main()
{
    int tc;
    cin >> tc;

    while (tc--)
    {
        int N;
        cin >> N;

        int mat[MAX][MAX];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                cin >> mat[i][j];

        int visited[MAX][MAX];
        memset(visited, 0, sizeof(visited));

        int ans = 0;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (!visited[i][j])
                    ans += bfs(mat, visited, N, i, j);

        cout << ans << endl;
    }

    return 0;
}