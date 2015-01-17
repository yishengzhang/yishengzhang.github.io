#include <iostream>
#include <sstream>
#include <string>
using namespace std;

class ClassifiedAd
{
    string category;
    int wordcount;
    double price;
public:
    ClassifiedAd (string category, int wordcount)
    {
        this->category = category;
        this->wordcount = wordcount;
    }
    void setCategory(string category){this->category = category;}
    string getCategory(){return category;}
    void setWordcount(int wordcount){this->wordcount = wordcount;}
    int getWordcount(){return wordcount;}
    double getPrice(){return 0.09*wordcount;}
    //to_string doesn't seem to work in this context


    string newString = static_cast<ostringstream*>(&(ostringstream()<<getPrice))->str();
    string toString() const {return "price"+newString;}
};
ostream& operator<< (ostream& stream, const ClassifiedAd& obj){
       return stream << obj.toString();
    }

int main(){
    ClassifiedAd macnews ("Summer Fun",432);
    cout<< macnews<<endl;
    return 0;
}
