#include "TestFunctory.h"
#include "iostream"

using namespace std;

int main() {
    TestFunctory testFunctory;
//    获取 F(x) = x^2 概率的随机数
    testFunctory.getProbabilityToMAXTest(0.3);
    cout << "==========================" << endl;
//    获取 F(x) = 1-(1-x)^2 概率的随机数
    testFunctory.getProbabilityToMINTest(0.3);
//    将 1~6 的等概率数转化为 0~7 的等概率数
    testFunctory.getSeriesToProbabilityTest();
    cout << "==========================" << endl;
//    测试获取的获取 0 与 1 的不等概率转为等概率的测试
    testFunctory.getNoProbabilityToEquallyTest();
}