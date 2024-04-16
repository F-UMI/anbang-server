#!/bin/bash

# 체인코드 배포 스크립트가 있는 폴더로 이동
cd chaincode

echo 체인코드 설치를 위한 준비
./deployCC.sh setup
sleep 40

# 체인코드 패키징
./deployCC.sh packageChaincode
sleep 5
# 체인코드 설치

./deployCC.sh installChaincode
sleep 40

# 체인코드 패키지 아이디 확인
./deployCC.sh queryInstalled

# 체인코드 조직1 승인
./deployCC.sh approveForMyOrg1
sleep 5

# 체인코드 승인 확인
./deployCC.sh checkCommitReadiness1

# 체인코드 조직2 승인
./deployCC.sh approveForMyOrg2
sleep 5

# 체인코드 승인 확인
./deployCC.sh checkCommitReadiness2

# 체인코드 정의
./deployCC.sh commitChaincodeDefinition



# 체인코드 정의 내용 확인
./deployCC.sh queryCommitted

# 체인코드 초기화
./deployCC.sh chaincodeInvokeInit
