#!/bin/bash

status=${1:-'成功'}

curl 'https://oapi.dingtalk.com/robot/send?access_token=7fd8b8a9e2ece6b0b753805a967a43c8f027ce363a176a3494ec61b93d7e2539' \
-H 'Content-Type: application/json' \
-d "{'msgtype': 'text','text': {'content':'$BUILD_TAG:\n    构建触发分支: $GIT_BRANCH\n    提交者: $SCM_CHANGELOG\n    构建状态: $status\n    详情请看: $BUILD_URL'}}"
