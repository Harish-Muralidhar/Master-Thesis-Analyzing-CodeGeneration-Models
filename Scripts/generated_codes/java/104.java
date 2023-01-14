/*


*/

import java.util.*;
import java.io.*;

public class StrictlyIncreasingArithmeticProgression {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long l = sc.nextLong();
            long r = sc.nextLong();
            long k = sc.nextLong();
            long n = sc.nextLong();
            long[] arr = new long[(int)(r-l+1)];
            for(int i=0; i<r-l+1; i++){
                arr[i] = l+i;
            }
            List<Long>[] lst = new ArrayList[(int)(r-l+1)];
            for(int i=0; i<lst.length; i++){
                lst[i] = new ArrayList<Long>();
            }
            for(int i=0; i<lst.length; i++){
                for(int j=0; j<lst.length; j++){
                    if(i==j){
                        continue;
                    }
                    if(arr[j]-arr[i]>=k){
                        lst[i].add(arr[j]);
                    }
                }
            }
            long max = 0;
            int len = lst.length;
            for(int i=0; i<len; i++){
                if(lst[i].size()>max){
                    max = lst[i].size();
                }
            }
            max++;
            long[] out = new long[(int)max];
            int m = 0;
            for(int i=0; i<len; i++){
                if(lst[i].size()==max-1){
                    out[m++] = arr[i];
                }
            }
            Arrays.sort(out);
            for(int i=0; i<max; i++){
                System.out.print(out[i]+" ");
            }
            System.out.println();
            long[][] a = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    a[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<lst[i].size(); j++){
                    a[i][j] = lst[i].get(j);
                }
            }
            long p = max-1;
            long[][] b = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    b[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(a[i][j]!=-1){
                        for(int z=0; z<lst[(int)a[i][j]-1].size(); z++){
                            b[i][(int)p] = lst[(int)a[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] c = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    c[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(b[i][j]!=-1){
                        for(int z=0; z<lst[(int)b[i][j]-1].size(); z++){
                            c[i][(int)p] = lst[(int)b[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] d = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    d[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(c[i][j]!=-1){
                        for(int z=0; z<lst[(int)c[i][j]-1].size(); z++){
                            d[i][(int)p] = lst[(int)c[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] e = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    e[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(d[i][j]!=-1){
                        for(int z=0; z<lst[(int)d[i][j]-1].size(); z++){
                            e[i][(int)p] = lst[(int)d[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] f = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    f[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(e[i][j]!=-1){
                        for(int z=0; z<lst[(int)e[i][j]-1].size(); z++){
                            f[i][(int)p] = lst[(int)e[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] g = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    g[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(f[i][j]!=-1){
                        for(int z=0; z<lst[(int)f[i][j]-1].size(); z++){
                            g[i][(int)p] = lst[(int)f[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] h = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    h[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(g[i][j]!=-1){
                        for(int z=0; z<lst[(int)g[i][j]-1].size(); z++){
                            h[i][(int)p] = lst[(int)g[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] i1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    i1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(h[i][j]!=-1){
                        for(int z=0; z<lst[(int)h[i][j]-1].size(); z++){
                            i1[i][(int)p] = lst[(int)h[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] j1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    j1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(i1[i][j]!=-1){
                        for(int z=0; z<lst[(int)i1[i][j]-1].size(); z++){
                            j1[i][(int)p] = lst[(int)i1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] k1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    k1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(j1[i][j]!=-1){
                        for(int z=0; z<lst[(int)j1[i][j]-1].size(); z++){
                            k1[i][(int)p] = lst[(int)j1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] l1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    l1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(k1[i][j]!=-1){
                        for(int z=0; z<lst[(int)k1[i][j]-1].size(); z++){
                            l1[i][(int)p] = lst[(int)k1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] m1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    m1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(l1[i][j]!=-1){
                        for(int z=0; z<lst[(int)l1[i][j]-1].size(); z++){
                            m1[i][(int)p] = lst[(int)l1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] n1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    n1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(m1[i][j]!=-1){
                        for(int z=0; z<lst[(int)m1[i][j]-1].size(); z++){
                            n1[i][(int)p] = lst[(int)m1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] o1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    o1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(n1[i][j]!=-1){
                        for(int z=0; z<lst[(int)n1[i][j]-1].size(); z++){
                            o1[i][(int)p] = lst[(int)n1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] p1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    p1[i][j] = -1;
                }
            }
            for(int i=0; i<max-1; i++){
                for(int j=0; j<max-1; j++){
                    if(o1[i][j]!=-1){
                        for(int z=0; z<lst[(int)o1[i][j]-1].size(); z++){
                            p1[i][(int)p] = lst[(int)o1[i][j]-1].get(z);
                            p++;
                        }
                        i++;
                        j=-1;
                    }
                }
            }
            long[][] q1 = new long[(int)max-1][(int)max-1];
            for(int i=0; i<max-