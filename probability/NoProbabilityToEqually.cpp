/**
* @author peggy
* @data 2023/2/17 11:44
*/

//
// Created by peggy on 2023/2/17.
//

#include "NoProbabilityToEqually.h"

/**
 * 思路:
 * 由于获取 0 与 1 的概率不相同,这里假设获取 0 的概率为 2/5 获取 1 的概率为 3/5
 * 那么如果获取的数是两位就有以下的四种结果其分别是
 * 0 0 概率 ==> 2/5 * 2/5 = 4/25
 * 0 1 概率 ==> 2/5 * 3/5 = 6/25
 * 1 0 概率 ==> 3/5 * 2/5 = 6/25
 * 1 1 概率 ==> 3/5 * 3/5 = 9/25
 * 可以看出 0 1 与 1 0 的出现的概率是相同的
 * 那么我们就可以将出现 0 1 与 1 0 做为一个等概率的发生器
 *
 * @return 等概率的 0 或 1
 */
int NoProbabilityToEqually::getEqually() {
    int num;
    do {
        num = noEqually();
    } while (num == noEqually());
    return num;
}

/**
 * 获取不等概率的 0,1
 * @return 返回不等概率的 0 或 1
 */
int NoProbabilityToEqually::noEqually() {
    return this->randomNumber.getMyRumber() > 0.8 ? 0 : 1;
}

