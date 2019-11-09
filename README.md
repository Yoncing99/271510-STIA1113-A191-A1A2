# Student Info
Matric: 271510

Name: Goh Yon Cing

# Introduction
According to this assignment, I have learnt to create a car loan calculator including write a pseudocode, draw a flow chart and write a java code. I have learnt the formula to calculate and apply in java program. By using while loop, I can run my program successfully and efficiency. I also learn how to use int, double, for loop and so on. User just have to enter car price and down payment amount in Malaysian Ringgit; car loan period in Years and interest rate in Percentage. Some limitation for user is car price cannot less than RM30,000, down payment cannot be negative, loan period cannot less than 5 years and more than 9 years, interest rate cannot less than 3% and more than 7%. 

# Pseudocode
Start

    Initialize carPrize to zero
    
    Initialize downPayment to negative one
    
    Initialize interestRate to zero
    
    Initialize loanPeriod to zero
    
    Output "Car Price (RM): "
    
    Input car price
    
    Loop the input car price if it is less than RM30,000
    
    Output "Down Payment (RM): "
    
    Input down payment
    
    Loop the input down payment if it is negative number
    
    Output "Loan Period (Years): "
    
    Input loan period
    
    Loop the input loan period if it is less than five or more than nine
    
    Output "Interest rate (%): "
    
    Input interest rate
    
    Loop the input of interest rate if it is less than three or more than seven
    
    Calculate monthlyRepayment=((carPrice-downPayment)+((carPrice-downPayment)*interestRate/100*loanPeriod))/(loanPeriod*12)
    
    Output "Monthly Repayment: "
    
    Output "YEARS", "PRINCIPAL", "INTEREST", "BALANCE"
    
    Initialize i = 1
    
    i = i++
    
    Loop i which is less than or equal to loanPeriod
    
    Calculate principal = monthlyRepayment*12*i
    
    Calculate interest = totalInterest / loanPeriod * i
    
    Calculate balance = monthlyRepayment * 12 * (loanPeriod- i)
    
    Output i, principal, interest, balance  
    
End


# Flow Chart


# Screenshot of Output
