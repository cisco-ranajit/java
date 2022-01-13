import java.util.Scanner;
class Bank{

    String Name;
    int AccNumber;
    String Address;
    int Deposit;
    int Balance = 0;
    int Withdraw;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
		    System.out.println(" ");
        System.out.println("#     #");
		    System.out.println("#  #  # ###### #       ####   ####  #    # ######    #####  ####      ####  #    # #####     #####    ##   #    # #    #");
		    System.out.println("#  #  # #      #      #    # #    # ##  ## #           #   #    #    #    # #    # #    #    #    #  #  #  ##   # #   #");
		    System.out.println("#  #  # #####  #      #      #    # # ## # #####       #   #    #    #    # #    # #    #    #####  #    # # #  # ####");
		    System.out.println("#  #  # #      #      #      #    # #    # #           #   #    #    #    # #    # #####     #    # ###### #  # # #  #");
		    System.out.println("#  #  # #      #      #    # #    # #    # #           #   #    #    #    # #    # #   #     #    # #    # #   ## #   #");
        System.out.println(" ## ##  ###### ######  ####   ####  #    # ######      #    ####      ####   ####  #    #    #####  #    # #    # #    #");
        System.out.println(" ");
		    System.out.println(" ");
        System.out.println("===============================================");
		    System.out.println("===============================================");
		    System.out.println(" ");
		    System.out.println(" ");
        System.out.println("Enter your good full name");
        Name = input.next();
        System.out.println("Enter your Bank Account number");
        AccNumber = input.nextInt();
        System.out.println("Enter your Address");
        Address = input.next();
        System.out.println("Enter amount to deposit in your bank account");
        Deposit = input.nextInt();
        System.out.println(" ");
		    System.out.println(" ");
    }
    void show(){
		    System.out.println("===============================================");
		    System.out.println("===============================================");
		    System.out.println(" ");
		    System.out.println(" ");
        System.out.println("Your Bank Account details");
        System.out.println("Name "+ Name);
        System.out.println("Account Number "+ AccNumber);
        System.out.println("Address "+ Address);
        System.out.println("Deposited amount "+Deposit);
        Balance = Balance + Deposit;
        System.out.println("Saving account balance is "+ Balance);
        System.out.println(" ");
		    System.out.println(" ");
		    System.out.println("===============================================");
		    System.out.println("===============================================");
    }void Withdrawn(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your Withdraw amount ");
        Withdraw = input.nextInt();
        if(Balance > Withdraw){
            System.out.println(Withdraw+ " debited on your account");
            Balance = Balance - Withdraw;
        }else{
            System.out.println("you have a insufficent balance");
        }
        System.out.println("your current account balance is "+ Balance);

		System.out.println("##### #    #   ##   #    # #    #    #   #  ####  #    #");
		System.out.println("  #   #    #  #  #  ##   # #   #      # #  #    # #    #");
		System.out.println("  #   ###### #    # # #  # ####        #   #    # #    #");
		System.out.println("  #   #    # ###### #  # # #  #        #   #    # #    #");
		System.out.println("  #   #    # #    # #   ## #   #       #   #    # #    #");
    System.out.println("  #   #    # #    # #    # #    #      #    ####   ####");
    }
    public static void main(String [] args){
		Bank ob = new Bank();
		ob.input();
		ob.show();
		ob.Withdrawn();
	}
}
