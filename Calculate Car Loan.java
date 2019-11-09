import java.util.Scanner;

public class CarLoanCalculator{

	public static void main(String[] args){
		
        double carPrice=0, downPayment=-1, interestRate=0;
        int loanPeriod=0;
        
        Scanner sc = new Scanner(System.in);

        while(carPrice<30000) {
            System.out.print("Car Price (RM): ");
            carPrice = sc.nextDouble();
        }
        while(downPayment<0) {
            System.out.print("Down Payment (RM): ");
            downPayment = sc.nextDouble();
        }

        while(loanPeriod<5 || loanPeriod>9){
            System.out.print("Loan Period (Years): ");
            loanPeriod = sc.nextInt();
        }

        while(interestRate<3 || interestRate>7){
            System.out.print("Interest Rate (%): ");
            interestRate = sc.nextDouble();
        }
//      monthlyRepayment=((carPrice-downPayment)+((carPrice-downPayment)*interestRate/100*loanPeriod))/loanPeriod*12

        double remainingBalance = carPrice - downPayment;
        int months = loanPeriod * 12;
        double totalInterest = remainingBalance*interestRate/100*loanPeriod;
        double monthlyRepayment= (remainingBalance + totalInterest)/months;

        System.out.printf("Monthly Repayment: RM%,.2f\n", monthlyRepayment);

        System.out.printf("%-5s%20s%20s%20s\n","YEARS", "PRINCIPAL", "INTEREST", "BALANCE");

        double balance = carPrice, principal, interest;

        for (int i = 1; i <= loanPeriod; i++) {

            principal = monthlyRepayment*12*i;
            interest = totalInterest / loanPeriod * i;
            balance = monthlyRepayment * 12 * (loanPeriod- i);

			System.out.printf("%,-5d%,20.2f%,20.2f%,20.2f\n", i, principal, interest, balance);
            sc.close();
        }
    }
}
