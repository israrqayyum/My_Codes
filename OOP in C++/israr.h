//placing class in seperate file in c++ 
#include<iostream>
  using namespace std;
  class test
  {
  	private:
  		int n;
  	public:
	 test():n(0)//followed by round brackets and not end on statement terminator
     {
	 cout<<"Constructor is called....."<<endl;	
     }
	 void setvalue(int num)
	 {
	 	n=num;
	 }
	 int getvalue()
	 {
	 	return n;
	 }
	 ~test()
	 {
	 	cout<<"Destructor is called......."<<endl;
	 }
  };
  