#include<iostream.h>
#include<conio.h>
class base
 {private:
  int a;
  int b;
  };
 class derived:public base
 {
  private:




  int p;
  int q;
 }s1;
 void main()
{clrscr();

   base s;

cout<<"size of base class"<<sizeof(s);
cout<<"\n";
cout<<"size of derived class";
cout<<sizeof(s1);
 getch();
}