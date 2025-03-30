@echo off
chcp 65001 > nul
echo Компiляцiя Java-коду...
if not exist out mkdir out
javac -encoding UTF-8 -d out -cp src *.java
if %ERRORLEVEL% neq 0 (
    echo Помилка компіляції!
    pause
    exit /b
)
echo Створення JAR-файлу...
jar cfe out/Lab1/Lab1.jar Lab1.Lab1 -C  out .
if %ERRORLEVEL% neq 0 (
    echo Помилка створення JAR!
    pause
    exit /b
)
echo Запуск програми...
java -Dfile.encoding=UTF-8 -jar out/Lab1/Lab1.jar
pause