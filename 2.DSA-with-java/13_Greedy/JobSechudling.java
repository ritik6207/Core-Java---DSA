//Re-write code some error
import java.util.*;
public class JobSechudling {
    char id;
    int deadline , profit;
    public  JobSechudling(){}
    public  JobSechudling(char id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobSequence(ArrayList<JobSechudling> arr, int maxDeadline)
    {
        //1. Sort the arr in dereading order of the profit
        //Lambda expressions
        // n log n
        int n = arr.size();
        Collections.sort(arr, (a, b) -> b.profit - a.profit);
        //2. Store the job ids on the basis of he max and given deadline
        //to track the alloted jobs
        boolean result[] = new boolean[maxDeadline];
        //to store the job ids
        char job[] = new char[maxDeadline];
        // O(n^2)
        for(int i = 0; i < n; i++)
        {
            for(int j = Math.min(maxDeadline - 1, arr.get(i).deadline - 1); j >= 0; j--)
            {
                if(result[j] == false)
                {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }
        for(char id: job)
        {
            System.out.println(id+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<JobSechudling> arr = new ArrayList<>();
        arr.add(new JobSechudling('1', 5, 55));
        arr.add(new JobSechudling('2', 2, 65));
        arr.add(new JobSechudling('3', 7, 75));
        arr.add(new JobSechudling('4', 3, 60));
        arr.add(new JobSechudling('5', 2, 70));
        arr.add(new JobSechudling('6', 1, 50));
        arr.add(new JobSechudling('7', 4, 85));
        arr.add(new JobSechudling('8', 5, 68));
        arr.add(new JobSechudling('9', 3, 45));

        System.out.println("Job Sequence order to get the maximum profit is: ");

        JobSechudling job = new JobSechudling();

        job.printJobSequence(arr, 7);
    }
}
