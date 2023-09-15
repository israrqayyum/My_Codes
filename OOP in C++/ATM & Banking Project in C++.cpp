/*
-------------------------------Project-------------------------------

statement:
* write a program that defines a class for a bank account that include following data member
  -Name of the depositor
  -Account name
  -Balance amount in the account
The Class count has following member function
 * A constructor to assign initial values 
 * Deposit function to deposit some amount.it should acccept the amount as parameter.
 * Withdraw function to withdraw an amount after checking the balance it should accept the amount as parameter.
 * Display function to display name and balance
 */
 #include<iostream>
   using namespace std;
   class bank{
   	private:
   		string name,actype;
   		int bal,acno;
   	public:
   		bank()
   		{
			cout<<"Enter account Name:";
   			getline(cin,name);
   			cout<<"Enter Account type:";
   			getline(cin,actype);
   			cout<<"Enter Account Number:";
   			cin>>acno;
   			cout<<"Enter Openning Balance:";
   			cin>>bal;
   			if(!cin>>bal);
   			cout<<"Invalid";
		}
		void deposit(int amt)
		{
			bal=bal+amt;
			cout<<"Balance after deposit:"<<bal<<endl;
			system("pause");
		}
		void withdraw(int amt)
		{
			if (amt>bal)
			cout<<"Sorry Your Balance is Less than amount..."<<endl;
			else
			{
				bal=bal-amt;
				cout<<"Balance after withdraw:"<<bal<<endl;
			}
			system("pause");
		}
		void display()
		{
			cout<<"--------------Account Details--------------"<<endl;
			cout<<"Account Name:"<<name<<endl;
			cout<<"Account Type:"<<actype<<endl;
			cout<<"Account Number:"<<acno<<endl;
			cout<<"Current Balance:"<<bal<<endl;
			system("pause");
		}
   };  
   int main()
   {
   	bank objbank;
   	int amount,choice;
   	do
   	{
   	 system("cls");
   	 cout<<"--------------Main Menu--------------"<<endl;
	 cout<<"1:- Deposit Money"<<endl;
	 cout<<"2:- Withdraw Money"<<endl;		
	 cout<<"3:- Display Account details"<<endl;
	 cout<<"4:- Quit"<<endl;
	 cout<<"Enter Any Choice:";
	 cin>>choice;
	 switch(choice)
	 {
	 	case 1:
	 	cout<<"Enter Amount to deposit:";
	 	cin>>amount;
	 	objbank.deposit(amount);	
	 	break;	
	 	
		case 2:
	 	cout<<"Enter Amount to withdraw:";
		cin>>amount;
		objbank.withdraw(amount); 	
	 	break;
	 	
		case 3:
	 	objbank.display();	
	 	break;
	 	
	 	case 4:
	 	exit(0);
	 	
	 	default:
	 		cout<<"You Entered Invalid Choice";
	 }
	}while(true);
   }