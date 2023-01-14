/*


 */

public class ChefAndAppetizers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int k = Integer.parseInt(line[0]);
            String str = line[1];

            String out_ = solve(k, str);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String solve(int k, String str){
        // Write your code here
        StringBuilder sb = new StringBuilder();
        int len = (int) Math.pow(2, k);

        for(int i = 0; i < len; i++) {
            String bin = Integer.toString(i, 2);
            while(bin.length() < k) bin = "0" + bin;
            StringBuilder sbBin = new StringBuilder(bin);
            String rev = sbBin.reverse().toString();
            sb.append(str.charAt(Integer.parseInt(rev, 2)));
        }

        return sb.toString();
    }
}