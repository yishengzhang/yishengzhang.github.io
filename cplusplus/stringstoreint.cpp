#include <iostream>
#include <string>
#include <cstdlib>
#include <sstream>//remember to include stringstreams

using namespace std;
int main(){
    string mystry;
    float price=0;
    int quantity=0;
    cout<<"Enter price: ";
    getline(cin,mystry);
    stringstream(mystry)>>price;
    cout<<"Enter quantity: ";
    getline(cin,mystry);
    stringstream(mystry)>>quantity;
    cout<<"Total price: $"<<price*quantity<<endl;
    system("Pause");
    return 0;
}
