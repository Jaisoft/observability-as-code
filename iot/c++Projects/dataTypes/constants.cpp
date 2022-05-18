#include <iostream>
using namespace std;

int main()
{
    const float PI  = 3.1416; //Definimos una constante llamada PI
    cout << "Mostrando el valor de PI: " << PI << endl;
    
    
    // PI = 2; Esto generará un error pues PI es de solo lectura (constante)
    return 0;
}