#include <iostream>
#include <string>
using namespace std;

int main() {
  
  string food = "Pizza";  // A string variable
  
  string* pointer = &food;  // A pointer variable that stores the address of food

  // Output the value of food
  cout << food << endl;

  // Output the memory address of food
  cout << &food << endl;

  // Output the memory address of food with the pointer
  cout << pointer << endl;

  return 0;
}