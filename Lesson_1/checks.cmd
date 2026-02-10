@echo off
chcp 65001 >nul
for %%f in (*.java) do (
    echo.
    echo Checking file: %%f
    "C:\Program Files\Java\jdk-21.0.10\bin\java.exe" -jar "C:\Users\Chaser\Desktop\StartJava\utils\checkstyle-13.1.0-all.jar" -c "C:\Users\Chaser\Desktop\StartJava\startjava_checks.xml" "%%f"
)
