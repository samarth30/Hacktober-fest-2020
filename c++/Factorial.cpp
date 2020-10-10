#include <iostream>
using namespace std;

int main()
{
    int number;
    unsigned long factorial = 1;

    cout << "Enter a positive integer: ";
    cin >> number;

    for(int i = 1; i <=number; ++i)
    {
        factorial *= i;
    }

    cout << "Factorial of " << number << " = " << factorial;    
    return 0;
}