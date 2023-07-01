import java.util.Random;
import java.util.Scanner;

class num_geneator{

    public int num;
    public int input_num;
    public int no_of_guesses=0;

    public int get_guesses()
    {
        return no_of_guesses;
    }

    public void set_no_guesses(int no_of_guesses)
    {
        this.no_of_guesses =no_of_guesses;
    }
    
    num_geneator()
    {
        Random random_no =new Random();
        this.num = random_no.nextInt(100);
    }
    
    void input_from_user()
    {
        System.out.println("I dare you to guess a Number");
        Scanner s = new Scanner(System.in);
        input_num = s.nextInt();
      
    }
    
    boolean iscorrect()
    {
        no_of_guesses++;
        if(input_num==num)
        {
            System.out.println("wohhhooo you got it right!! it is: " + num);
              System.out.println("you guesss it in : " + no_of_guesses + " attempts");
              return true;
        }
        else if(input_num<num)
        {
            System.out.println("too low!!");
          
        }
        else if(input_num>num)
        {
            System.out.println("too high!!");
        }

        return false;
    }

    public static void main(String[] args) {

        num_geneator n = new num_geneator();
        boolean check = false;
        while(!check){
        n.input_from_user();
        check = n.iscorrect();

        }
    }
     
}