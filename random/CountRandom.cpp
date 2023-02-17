/**
* @author peggy
* @data 2023/2/15 15:32
*/

//
// Created by peggy on 2023/2/15.
//

#include <ctime>
#include <cstdlib>
#include "CountRandom.h"
#include "RandomNumberToFunction.h"

using namespace std;
struct RandomNumberToFunction randomNumberToFunction;
/**
 *
 * @param limit
 * @return
 */
double CountRandom::getProbability(double limit) {
    RandomNumber randomNumber;
    //设置种子数
    srand(time(0));
    //统计符合提交出现的次数
    double counts = 0;
    for (int i = 0; i < RAND_MAX; ++i) {
        if (randomNumber.getMyRumber() < limit)
            counts++;
    }
    //出现的次数占总可能的大小
    return (double) (counts / RAND_MAX);
}
/**
 * 获取概率变为 F(x) = x^2
 * @param limit
 * @return
 */
double CountRandom::getProbabilityToMAX(double limit) {
    double counts = 0;
    for (int i = 0; i < RAND_MAX; ++i) {
        //随机数出现为 X^2
        double num = randomNumberToFunction.getMAXRandom();
        if (num < limit)
            counts++;
    }
    return (double) (counts / RAND_MAX);
}

/**
 * 获取概率变为 F(x) = 1-(1-x)^2
 * @param limit
 * @return
 */
double CountRandom::getProbabilityToMIN(double limit) {
    double counts = 0;
    for (int i = 0; i < RAND_MAX; ++i) {
        //随机数出现为 1-(1-x)^2
        double num = randomNumberToFunction.getMINRandom();
        if (num < limit)
            counts++;
    }
    return (double) (counts / RAND_MAX);
}
