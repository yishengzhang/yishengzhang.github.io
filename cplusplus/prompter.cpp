#include <iostream>

using namespace std;

int main(){
    double firstNUM=0,secondNUM=0,min,max,value;
    do
    {cout<<"Give a minimum value and a maximum value.\n";
    cin>>firstNUM;
    cout<<endl;
    cin>>secondNUM;
    } while (firstNUM==secondNUM);
    if (firstNUM<secondNUM)
    {
        min=firstNUM;
        max=secondNUM;
    }
    else
    {
        max=firstNUM;
        min=secondNUM;
    }
    cout<<"Give a value in the range of the two numbers. ";
    cin>>value;
    while (!(value>=min&&value<=max)){
        cout<<"Give a value in the range of the two numbers. ";
        cin>>value;
}


}
