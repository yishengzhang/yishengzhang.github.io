#include <iostream>
#include <stdexcept>

using namespace std;

int at(int index) {
  int x[1];
  if(index < 1 || index > 5)
    throw out_of_range("Index is out of range");
  return x[index];
}

int main()
{
    int input;
    int billy[5]={1,2,3,4,5};
    cout<<"Please enter a subscript."<<endl;
    cin>>input;
    return at(input);
}
