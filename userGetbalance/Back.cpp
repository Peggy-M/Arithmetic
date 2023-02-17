/**
* @author peggy
* @data 2023/2/15 11:13
*/

//
// Created by peggy on 2023/2/15.
//

#include "Back.h"
#include <iostream>

void Back::getBalances(User *user) {
    cout << "userName:" << user->getName() << " balance:" << user->getBalance() << endl;
    cout << "getBalance site " << user << endl;
}

