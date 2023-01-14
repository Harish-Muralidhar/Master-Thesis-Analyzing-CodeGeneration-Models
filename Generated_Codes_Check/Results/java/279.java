/*


*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){

            String[] input = br.readLine().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            List<Integer>[] list = new LinkedList[N];
            int[][] arr = new int[N][2];
            boolean[] isVisited = new boolean[N];
            Map<Integer,Integer> parentMap = new HashMap<>();
            for(int k=0; k<K; k++){
                String[] query = br.readLine().split("\\s+");
                int x = Integer.parseInt(query[0]);
                int y = Integer.parseInt(query[1]);
                if(list[x]==null){
                    list[x] = new LinkedList<>();
                }
                list[x].add(y);
                arr[x][0]++;
                arr[y][1]++;
            }
            int start = 0;
            for(int i=0; i<N; i++){
                if(arr[i][1]>arr[i][0]){
                    start = i;
                }
            }

            String result = printString(list,arr,parentMap,isVisited,start,N);
            System.out.println(result);
        }
    }

    private static String printString(List<Integer>[] list, int[][] arr, Map<Integer,Integer> parentMap, boolean[] isVisited, int start, int n){
        String s = "";
        if(parentMap.containsKey(start)){
            isVisited[start] = true;
            return s;
        }
        if(arr[start][0]==0 && arr[start][1]==0){
            s = s + "()";
        }
        else{
            s = s + "(";
            isVisited[start] = true;
            for(int i=0; i<n; i++){
                if(list[start]!=null && list[start].contains(i) && !isVisited[i]){
                    parentMap.put(i,start);
                    s = s + printString(list,arr,parentMap,isVisited,i,n);
                }
            }
            s = s + ")";
        }
        return s;
    }
}