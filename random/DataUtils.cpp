/**
* @author peggy
* @data 2023/2/15 20:19
*/

//
// Created by peggy on 2023/2/15.
//

#include "DataUtils.h"

double DataUtils::getMAX(double num1, double num2) {
    return num1 > num2 ? num1 : num2;
}

double DataUtils::getMIX(double num1, double num2) {
    return num1 < num2 ? num1 : num2;
}
