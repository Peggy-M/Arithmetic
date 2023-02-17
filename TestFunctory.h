//
// Created by peggy on 2023/2/17.
//

#ifndef ZUOCHENGYUNARITHMETIC_TESTFUNCTORY_H
#define ZUOCHENGYUNARITHMETIC_TESTFUNCTORY_H
#include "random/CountRandom.h"
#include "random/RandomNumberToFunction.h"
#include "probability/SeriesToProbability.h"
#include "probability/NoProbabilityToEqually.h"

class TestFunctory {
private:
    SeriesToProbability seriesToProbability;
    NoProbabilityToEqually noProbabilityToEqually;
    CountRandom Random;
public:
    void getProbabilityToMAXTest(double limit);
    void getProbabilityToMINTest(double limit);
    void getSeriesToProbabilityTest();
    void getNoProbabilityToEquallyTest();

};


#endif //ZUOCHENGYUNARITHMETIC_TESTFUNCTORY_H
