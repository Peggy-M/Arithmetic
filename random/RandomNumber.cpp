/**
* @author peggy
* @data 2023/2/15 15:13
*/

//
// Created by peggy on 2023/2/15.
//

#include <iostream>
#include "RandomNumber.h"

using namespace std;

/**
 * 获取范围是 0~1 随机数
 * rand()  方法获取的随机数是 0 ~ 7FFF
 * @return
 */
double RandomNumber::getMyRumber() {
    return (double )rand()/RAND_MAX;
}