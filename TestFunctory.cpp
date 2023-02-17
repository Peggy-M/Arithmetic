/**
* @author peggy
* @data 2023/2/17 13:07
*/

//
// Created by peggy on 2023/2/17.
//

#include "TestFunctory.h"
#include "iostream"

using namespace std;

/**
 * 获取 F(x) = x^2 概率的随机数
 * @param limit 要获取的数的出现的概率
 */
void TestFunctory::getProbabilityToMAXTest(double limit) {

    double proBability2 = Random.getProbabilityToMAX(limit);
    cout << "小于 " << limit << " 出现的概率 " << proBability2 << endl;
    cout << "计算的概率 " << limit * limit << endl;

}

/**
 * 获取 F(x) = 1-(1-x)^2 概率的随机数
 * @param limit 要获取的数的出现的概率
 */
void TestFunctory::getProbabilityToMINTest(double limit) {
    double proBability2 = Random.getProbabilityToMIN(limit);
    cout << "小于 " << limit << " 出现的概率 " << proBability2 << endl;
    cout << "计算的概率 " << 1 - (1 - limit) * (1 - limit) << endl;
}

/**
 * 将 1~6 的等概率数转化为 0~7 的等概率数
 */
void TestFunctory::getSeriesToProbabilityTest() {
    //初始化一个统计的每个数出现的次数数组
    int arry[8] = {0, 0, 0, 0, 0, 0, 0, 0};
    for (int i = 0; i < 1000000; i++) {
        //将每一个数出现一次,次数 +1
        arry[seriesToProbability.getBINToDEC()]++;
    }
    for (int i = 0; i < 8; ++i) {
        cout << "arry[" << i << "]=" << (double) arry[i] / 1000000 << endl;
    }
}

/**
 * 测试获取的获取 0 与 1 的不等概率
 */
void TestFunctory::getNoProbabilityToEquallyTest() {
    int countZero = 0;
    int countOne = 0;
    for (int i = 0; i < 100000; ++i) {
        if (noProbabilityToEqually.getEqually() == 0)
 //       if (noProbabilityToEqually.noEqually() == 0)
            countZero++;
        else
            countOne++;
    }
    cout << "0 出现的概率是" << (double) countZero / 100000 << endl;
    cout << "1 出现的概率是" << (double) countOne / 100000 << endl;
}
