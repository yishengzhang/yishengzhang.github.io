#include <iostream>
#include <string>
using namespace std;
class Bill
{
    //these fields are private
    string name;
    double amount;
    public:
        Bill (string name, double amount)
        {
            this->name = name;
            this->amount = amount;
        }
    //int Num() {return num;};
        void setName (string name){this->name = name;}
        string getName() {return name;}
        void setAmount (double amount){this->amount = amount;}
        double getAmount(){return amount;}
};
class OverdueBill: public Bill
{
    int days;
    public:
        OverdueBill (string name, double amount, int days): Bill(name,amount)
        {
            this->days = days;
        }
        void setDays (int days){this->days = days;}
        int getDays () {return days;}
};
//this statement is required in order to overload the << operator (i.e. ToString)

int main()
{
    OverdueBill thing("Joe",32432,32);
    cout<< thing.getAmount();
    return 0;
}

