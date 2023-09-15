/* 
Write program to use setter and getter function
*/
#include<iostream>
#include<string.h>
  using namespace std;
  class book
  {
  	private:
  		int page;
  		float price;
  		char name[30];
  	public:
  		//setter functions
  		void setpage(int p)
		{
			page=p;
	    }
		void setprice(float pr)
		{
			price=pr;
		}	
		void setname(char *n)
		{
			strcpy(name,n);
		}
		//getter functions
		int getpage()
		{
			return page;
		}
		float getprice()
		{
			return price;
		}
		char* getname()
		{
			return name;
		}
  	
  };
  
    int main()
   {
   	book b1,b2;
   	cout<<"---------Book1 Data---------"<<endl;
   	b1.setpage(100);
   	b1.setprice(300.98);
   	b1.setname("Web PRogramming");
   	cout<<"Book 1 Page is:"<<b1.getpage()<<endl;
   	cout<<"Book 1 Price is:"<<b1.getprice()<<endl;
   	cout<<"Book 1 Name is:"<<b1.getname()<<endl;
   	
    cout<<"---------Book2 Data---------"<<endl;
    b2.setpage(200);
   	b2.setprice(500.98);
   	b2.setname("Object Oriented programming in c++");
   	cout<<"Book 2 Page is:"<<b2.getpage()<<endl;
   	cout<<"Book 2 Price is:"<<b2.getprice()<<endl;
   	cout<<"Book 2 Name is:"<<b2.getname()<<endl;
   }