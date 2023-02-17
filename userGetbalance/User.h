//
// Created by peggy on 2023/2/15.
//

#ifndef ZUOCHENGYUNARITHMETIC_USER_H
#define ZUOCHENGYUNARITHMETIC_USER_H

#include <string>

using namespace std;

class User {
public:
    User(const string &name, int balance);

private:
    string name;
    int balance;
public:
    User();

public:
    const string &getName() const;

    void setName(const string &name);

    int getBalance() const;

    void setBalance(int balance);

};


#endif //ZUOCHENGYUNARITHMETIC_USER_H
