1.一次完整的工作流

###### 第一次拿项目：git clone 地址 -- **git status**--(modified:...红)--**git add （文件名）or git add .**--**git status**--(green)--**git commit -m "situation"**--**git push**（前提是已建立跟踪关系）



2\. 本地 JavaLearning

&#x20;        ↓

&#x20;GitHub 创建远程仓库（github创建repository

&#x20;        ↓

&#x20;连接 remote

&#x20;        ↓

&#x20;push

&#x20;        ↓

&#x20;GitHub 上看到你的代码



3.建立跟踪关系

**git remote add origin (repository的网址)**-**-git remote -v  --(fetch)(push)--  git push -u origin main --登录授权**



git push

→ 把本地提交推到远程



origin

→ 推到刚才命名为 origin 的远程仓库



main

→ 推送本地 main 分支



\-u

→ 建立默认跟踪关系



###### 4\.**git log --oneline**

###### 简洁查看 commit 历史









&#x20;     

