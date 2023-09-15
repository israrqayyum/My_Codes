//constructor in c++
//The main purpose of constuctor is to initialize object and allocate appropriate memory to objects
#include<iostream>
  using namespace std;
  class test
  {
  	private:
  		int n,x,y;
  	public:
  	/*	test():n(10),x(20),y(30)//defualt constructor
  		{
  			cout<<"Constructor is called........"<<endl;
	    }
		void display()
		{
		  	cout<<"n :"<<n<<endl<<"x :"<<x<<endl<<"y:"<<y<<endl;
		}
	*/ 
		test(int num)//parametrized constructor
		  {
		  	n=num;
		  }
		  void display()
		  {
		  	cout<<"n :"<<n<<endl;
		  }
  };
  
  int main()
  {
  	test t(22);
  	t.display();
  }
  /*
  Properties of constructor:
  1.Constructor is always private.
  2.Types of constructor are
    *Defaultt constructor
    *Parametrized constructor
    *Copy Constructor
  3.if their is no constructor the complier provides a default constructor
    that is, a constructor with no parameters. 
  4.Two ways to name constructor:
    *Name of constructor must be same of class name.
    *no return type is used for constructors
     becuase constructor is called automatically by c++ compiler, there's no need to 
     to return anything from constructor
     
 *simple constructor example
 class test
  {
  	public:
	test()
	    {
  		cout<<"Constructor is called........"<<endl;   
		}
  };
  
  int main()
  {
  	test m; 	
  }
  */