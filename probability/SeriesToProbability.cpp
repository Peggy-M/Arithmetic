/**
* @author peggy
* @data 2023/2/16 22:35
*/

//
// Created by peggy on 2023/2/16.
//

#include "SeriesToProbability.h"

/**
 * 1-5 的等概率 求出 1-7 的等概率返回
 * @param attay
 * @param legth
 */
int SeriesToProbability::getProbability() {
    int num;
    do {
        //直到当前获取的随机数不是三的时候跳出，否则继续循环，调用 getNumber() 方法获取随机数
        num = getNumber();
    } while (num == 3);
    return num < 3 ? 0 : 1;
}
/**
 * 获取 1-5 的等概率的数
 * @return
 */
int SeriesToProbability::getNumber() {

    return (int) (randomNumber.getMyRumber() * 5) + 1;
}
/**
 * 将获取的二进制位进行右移,转化为一个整数并返回
 * @return
 */
int SeriesToProbability::getBINToDEC() {
    return (this->getProbability()<<2)+(this->getProbability()<<1)+(this->getProbability()<<0);
}


