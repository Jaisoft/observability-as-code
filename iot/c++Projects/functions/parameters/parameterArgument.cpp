#include <iostream>
#include <string>
using namespace std;

void myFunction(string fname) {
  cout << fname << endl;
}

int main() {
  myFunction("Liam");
  myFunction("Jenny");
  myFunction("Anja");
  return 0;
}