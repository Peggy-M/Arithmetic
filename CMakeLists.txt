cmake_minimum_required(VERSION 3.24)
project(zuoChengYunArithmetic)

set(CMAKE_CXX_STANDARD 17)

add_executable(zuoChengYunArithmetic main.cpp userGetbalance/User.cpp userGetbalance/User.h userGetbalance/Back.cpp userGetbalance/Back.h random/RandomNumber.cpp random/RandomNumber.h random/CountRandom.cpp random/CountRandom.h random/DataUtils.cpp random/DataUtils.h random/RandomNumberToFunction.cpp random/RandomNumberToFunction.h probability/SeriesToProbability.cpp probability/SeriesToProbability.h probability/NoProbabilityToEqually.cpp probability/NoProbabilityToEqually.h TestFunctory.cpp TestFunctory.h utils/BINCounter.cpp utils/BINCounter.h)
