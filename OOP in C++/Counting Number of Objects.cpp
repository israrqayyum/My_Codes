//Counting Number of Objects in c++
#include<iostream>
  using namespace std;
  class count
  {
  	private:
  		 static int counter;
    public:
    	count()
    	{
    		counter++;
    		showobject();
		}
		void showobject()
		{
			system("cls");
			cout<<" Total Object is:"<<counter<<endl;
		}
  };
 int count::counter=0;//::scope resolution operator
  int main()
  {
  	count  c1,c2,c3,a,b,c,d,e;
  	
  }