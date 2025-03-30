@echo off
chcp 65001 > nul
echo Компiляцiя Java-коду...
if not exist out mkdir out
javac -encoding UTF-8 -d out -cp src PotentialEnergyOfWater.java
if %ERRORLEVEL% neq 0 (
    echo Помилка компіляції!
    pause
    exit /b
)
echo Створення JAR-файлу...
jar cfe out/Lab9/Lab9.jar Lab9.PotentialEnergyOfWater -C  out .
if %ERRORLEVEL% neq 0 (
    echo Помилка створення JAR!
    pause
    exit /b
)
echo Запуск програми...
java -Dfile.encoding=UTF-8 -jar out/Lab9/Lab9.jar
pause