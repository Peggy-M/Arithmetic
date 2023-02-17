/**
* @author peggy
* @data 2023/2/15 11:06
*/

//
// Created by peggy on 2023/2/15.
//

#include "User.h"

const string &User::getName() const {
    return name;
}

void User::setName(const string &name) {
    User::name = name;
}

int User::getBalance() const {
    return balance;
}

void User::setBalance(int balance) {
    User::balance = balance;
}

User::User() {}

User::User(const string &name, int balance) : name(name), balance(balance) {}

