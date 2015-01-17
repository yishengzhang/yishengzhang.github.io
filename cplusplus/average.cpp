#include <iostream>
#include <cstdlib>
using namespace std;
int main(){
    const int SENTINEL = 0;
    int newValue, counter =0,sumOfValues =0;
    double avg;
    /*Get a set of numbers from user*/
    cout<<"Calculate Average Program\n";
    cout<<"Enter a value (" <<SENTINEL<<" to quit): ";
    cin>>newValue;
    while (newValue!=SENTINEL){
        counter++;
        sumOfValues+=newValue;
        cout<<"Enter a value ("<<SENTINEL<<"to quit): ";
        cin>>newValue;
    }
    /*Calculate average of numbers entered by user*/
    avg=(double)sumOfValues/(double)counter;
    cout<<"Average is "<<avg<<endl;
    system("PAUSE");
    return 0;

}
