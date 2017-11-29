@echo off

echo "**************************** 轻实训-项目案例 ****************************"

echo "[INFO] 生成创建数据库结构脚本（DDL）..."

echo "[INFO] 生成的脚本文件在 /target/sql 目录下"

cd %~dp0
cd ..

set MAVEN_OPTS=%MAVEN_OPTS% -XX:MaxPermSize=128m

mvn hibernate3:hbm2ddl -X

cd bin
pause