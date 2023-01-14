/*

*/
import java.util.Scanner;

public class ChefAndAssistant{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCases= sc.nextInt();
        for(int i=0;i<testCases;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] jobs = new int[m];
            for(int j=0;j<m;j++){
                jobs[j] = sc.nextInt();
            }
            printJobs(jobs,n);
        }
    }
    
    static void printJobs(int[] jobs,int n){
        int[] chefJobs = new int[n/2];
        int[] assistantJobs = new int[n/2];
        if(jobs.length%2==0){
            chefJobs = new int[n/2];
            assistantJobs = new int[n/2];
        }else{
            chefJobs = new int[n/2+1];
            assistantJobs = new int[n/2];
        }
        
        int k=0;
        int j=0;
        for(int i=1;i<=jobs.length;i++){
            if(i>=jobs[k]){
                if(i%2!=0){
                    chefJobs[j++] = i;
                }else{
                    assistantJobs[j++]=i;
                }
                k++;
            }
        }
        
        // it is very important to use Long here
        // it will give TLE if you use int as it will overflow
        long chefLastJob = chefJobs[chefJobs.length-1];
        long assistantLastJob = assistantJobs[assistantJobs.length-1];
        for(int i=1;i<=n;i++){
            if(i%2!=0 && i>chefLastJob){
                chefJobs[j++] = i;
            }else if(i%2==0 && i>assistantLastJob){
                assistantJobs[j++]=i;
            }
        }
        
        for(int i=0;i<chefJobs.length;i++){
            System.out.print(chefJobs[i]+" ");
        }
        System.out.println();
        for(int i=0;i<assistantJobs.length;i++){
            System.out.print(assistantJobs[i]+" ");
        }
        System.out.println();
    }
}