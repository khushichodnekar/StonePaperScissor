import java.util.*;
public class StonePaperScissor {
    static Random r=new Random();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // int randomNumber=r.nextInt(3);
        int p1=0,p2=0;
        for(int i=1;i<=5;i++)
        {
            System.out.println("press 0 for stone\npress 1 for paper\npress 2 for scissor\n");
            int n=sc.nextInt();
            int randomNumber=r.nextInt(3);
            System.out.println(randomNumber);
            if(n==0 && randomNumber==1)
            {
                System.out.println("computer wins!");
                p2++;
            }
            else if(n==0 && randomNumber==2)
            {
                System.out.println("you win!");
                p1++;
            }
            else if(n==1 && randomNumber==0)
            {
                System.out.println("you win!");
                p1++;
            }
            else if(n==1 && randomNumber==2)
            {
                System.out.println("computer wins!");
                p2++;
            }
            else if(n==2 && randomNumber==0)
            {
                System.out.println("computer wins!");
                p2++;
            }
            else
            {
                System.out.println("draw");
            }


        }
        if(p1>p2)
        {
            System.out.println("CONGRATULATIONS YOU ARE THE WINNER");
        }
        else if (p2>p1){
            System.out.println("OPS!YOU ARE THE LOSER");
        }
        else {
            System.out.println("NO ONE WINS");
        }

    }

}