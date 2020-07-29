#BANK ACCOUNT JAVA
## 1.	BankAccount class
a.	Create a BankAccount base class
b.	In BankAccount base class, create these methods. You have to make them work!
•	Properties
o	AccountNumber (text)
	Add validation to make this to be of length = 6
o	Name (text)
o	Balance (decimal)
	Add validation to make sure this cannot be negative
o	DateCreated (date)
	Add validation to make sure this cannot be a future date
•	Constructors
o	Create a constructor without any parameters
	Set DateCreated to the current date
o	Create a constructor with 3 parameters
	Set DateCreated to the current date
•	DisplayAccountInfo()
o	This method will display Account Number, Name and Balance
•	Deposit()
o	Takes 1 input parameter “amount” of type decimal
o	Adds amount to Balance
o	Write Balance to Console
•	Withdraw()
o	Takes 1 input parameter “amount” of type decimal
	If Balance is > amount, then subtract amount from Balance 
	Else write an error to console
o	Write Balance to Console
•	CalculateInterest()
o	Write to Console “This method will calculate Interest”

##  SavingsAccount – Derived class from BankAccount base class
•	Properties
o	Balance (decimal)
	Add validation to make sure this cannot be less than 2500
•	Constructors
o	Create a constructor without any parameters
	Call the base class constructor
o	Create a constructor with 3 parameters
	Call the base class constructor
•	CalculateInterest()
o	Calculate 5% interest per year and addthis interest to Balance 
o	Write to Console “Added interest and updated Balance”
•	Withdraw() method
o	If Balance is < 2500, write to Console an error message “Insufficient balance”
o	Else call the Withdraw method of the base class

##  CheckingAccount – Derived class
•	Properties
o	Balance (decimal)
	Add validation to make sure this cannot be less than 500
•	Constructors
o	Create a constructor without any parameters
	Call the base class constructor
o	Create a constructor with 3 parameters
	Call the base class constructor
•	CalculateInterest()
o	Calculate 0.75% interest per year and add this interest to Balance 
o	Write to Console “Added interest and updated Balance”
•	Withdraw() method
o	If Balance is < 500, write to Console an error message “Insufficient balance”
o	Else call the Withdraw method of the base class


