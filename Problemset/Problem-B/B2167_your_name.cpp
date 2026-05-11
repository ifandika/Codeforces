#include <iostream>
#include <string>
#include <algorithm>
#include <cctype>
using namespace std;

/* clang-format off */

/* TYPES  */
#define ll long long
#define pii pair<int, int>
#define pll pair<long long, long long>
#define vi vector<int>
#define vll vector<long long>
#define mii map<int, int>
#define si set<int>
#define sc set<char>

/* UTILS */
#define MOD 1000000007
#define PI 3.1415926535897932384626433832795

/*  All Required define Pre-Processors and typedef Constants */
typedef long int int32;
typedef unsigned long int uint32;
typedef long long int int64;
typedef unsigned long long int  uint64;

/* clang-format on */

/* Main()  function */
int main() {
  int testCase;
  cin >> testCase;
  while (testCase-- > 0) {
    int length;
    string first, second;
    cin >> length >> first >> second;

    transform(first.begin(), first.end(), first.begin(), ::tolower);
    transform(second.begin(), second.end(), second.begin(), ::tolower);

    sort(first.begin(), first.end());
    sort(second.begin(), second.end());

    if (first == second) {
      cout << "YES\n";
    }
    else {
      cout << "NO\n";
    }
  }
  return 0;
}