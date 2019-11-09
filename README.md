# Student Info
Matric: 271510

Name: Goh Yon Cing

# Introduction
According to this assignment, I have learnt to create a car loan calculator including write a pseudocode, draw a flow chart and write a java code. I have learnt the formula to calculate and apply in java program. By using while loop, I can run my program successfully and efficiency. I also learn how to use int, double, for loop and so on. User just have to enter car price and down payment amount in Malaysian Ringgit; car loan period in Years and interest rate in Percentage. Some limitation for user is car price cannot less than RM30,000, down payment cannot be negative, loan period cannot less than 5 years and more than 9 years, interest rate cannot less than 3% and more than 7%. 

# Pseudocode
Start

    Initialize car prize to zero    
    Initialize down payment to negative one    
    Initialize interest rate to zero    
    Initialize loan period to zero    
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
    Calculate remaining balance = car price - down payment
    Calculate months = loan period * 12        
    Calculate total interest = remaining balance*interest rate/100*loan period        
    Calculate monthly repayment= (remaining balance + total interest)/months    
    Output "Monthly Repayment: "
    Output "YEARS", "PRINCIPAL", "INTEREST", "BALANCE"
    Initialize i = 1
    i = i++    
    Loop i which is less than or equal to loan period    
    Calculate principal = monthly repayment*12*i
    Calculate interest = total interest / loan period * i
    Calculate balance = monthly repayment * 12 * (loan period- i)    
    Output i, principal, interest, balance      
End

# Flow Chart
![Flow chart](https://user-images.githubusercontent.com/55395418/68527764-ac714880-0325-11ea-96f3-65021c3da4ef.png)

# Screenshot of Output
![image](https://user-images.githubusercontent.com/55395418/68527517-9746ea80-0322-11ea-818c-da8baaaa5eb8.png)
