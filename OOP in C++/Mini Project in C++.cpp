#include<iostream>
#include<string.h>
using namespace std;
class player{
  	private:
  		string name,team;
		int age;
    public:
	    player()
		{
			cout<<"Enter Player Name:";
			getline(cin,name);
			cout<<"Enter Team Name:";
			getline(cin,team);
			cout<<"Enter Age of Player:";
			cin>>age;
	    }
		void input()
		{   
		    cin.ignore();
			cout<<"Enter Player name:";
			getline(cin,name);
			cout<<"Enter Player team:";
			getline(cin,team);
			cout<<"Enter Player age:";
			cin>>age;
		} 		
	    void display()
	    {
	    	cout<<"Player name is:"<<name<<endl;
	    	cout<<"Team name is:"  <<team<<endl;
	    	cout<<"Player age is:" <<age<<endl;
	    	system("pause");
		}
  	
  	    void change(string n,string t,int a)
  	    {
  	        name=n;
  	    	team=t;
			age=a;
	    }
  };
  int main()
  {
  	int choice;
  	player p;
  	do
  	{
  		system("cls");
  		cout<<"----------Main Menu----------"<<endl;
  		cout<<"1:-Input Player Data"<<endl;
  		cout<<"2:-Display Player Data"<<endl;
  		cout<<"3:-Change Player Data"<<endl;
  		cout<<"4:-Exit"<<endl;
  		cout<<"Enter any choice:";
  		cin>>choice;
  		switch(choice)
  		{
  			case 1:
  				p.input();
  				break;
  			case 2:
			    p.display();
			case 3:
				p.change("Shaid","Pakistan",40);
				break;
			case 4:
				exit(1);
				break;
			default:
				cout<<"You Entered Invalid Choice"<<endl;
		}
	  }while(true);
   }

