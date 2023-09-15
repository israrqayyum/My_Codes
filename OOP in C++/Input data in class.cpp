#include<iostream>
  using namespace std;
  
  class student
  {
  	private:
  		int rollno;
  		char name[30];
    public:
	    void inputdata()
		{
			cout<<"Enter Roll No:";
			cin>>rollno;
			cin.ignore();
			cout<<"Enter Name:";
			cin.get(name,30);
		}		
		void outputdata()
		{
			cout<<"Your Roll No is:"<<rollno<<endl;
			cout<<"Your Name is:"<<name<<endl;
		}
  };
  
 int main()
  {
  
     student s;
	 cout<<"---------------Input Data---------------"<<endl;
	 s.inputdata();	
	 cout<<"---------------Output Data---------------"<<endl;
	 s.outputdata();
  }