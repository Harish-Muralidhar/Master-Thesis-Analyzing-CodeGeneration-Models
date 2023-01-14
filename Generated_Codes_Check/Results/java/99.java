/*

 */
public class GCDQuery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = in.nextInt();
        }
        for(int i = 0; i < M ; i++){
            int G = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();
            HashSet<Integer> set = new HashSet<Integer>();
            for(int j = X-1; j < Y; j++){
                if(gcd(A[j],G)>1){
                    set.add(A[j]);
                }
            }
            if(set.isEmpty()){
                System.out.println("-1 -1");
            }else{
                int max = 0;
                for(int num : set){
                    if(num > max)max = num;
                }
                int count = 0;
                for(int num : set){
                    if(num == max)count++;
                }
                System.out.println(max+" "+count);
            }
        }
    }

    public static int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a%b);
    }


}