#include"israr.h"
    void createobj()
    {
    	test t1,t2;
    	t1.setvalue(20);
     	t2.setvalue(30);
     	cout<<"The Value of n:"<<t1.getvalue()<<endl;
    	cout<<"The Value of n:"<<t2.getvalue()<<endl;
	}
  int main()

  {
  	createobj();
  	cout<<"Back in main"<<endl;
  
  }