/**
* @author peggy
* @data 2023/2/15 20:23
*/

//
// Created by peggy on 2023/2/15.
//

#include "RandomNumberToFunction.h"
#include "DataUtils.h"

/**
 * 将获取的随机数转化为 y=x^2
 * @return
 */
struct RandomNumber randomNumber;
struct DataUtils dataUtils;

/**
 * 获取概率变为 F(x)=X^2 的概率
 * @return
 */
double RandomNumberToFunction::getMAXRandom() {
    return dataUtils.getMAX(randomNumber.getMyRumber(),randomNumber.getMyRumber());
}
/**
 * 获取概率变为 F(x) = 1-(1-x)^2
 * @return
 */
double RandomNumberToFunction::getMINRandom() {
    return dataUtils.getMIX(randomNumber.getMyRumber(),randomNumber.getMyRumber());
}



