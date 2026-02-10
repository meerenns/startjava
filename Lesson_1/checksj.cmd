@echo off
chcp 65001 >nul

echo Compiling Java files...
"C:\Program Files\Java\jdk-21.0.10\bin\javac.exe" *.java
if errorlevel 1 (
    echo Compilation failed!
    goto end
)

echo.
echo Running Checkstyle...
for %%f in (*.java) do (
    echo Checking file: %%f
    "C:\Program Files\Java\jdk-21.0.10\bin\java.exe" -jar "C:\Users\Chaser\Desktop\StartJava\utils\checkstyle-13.1.0-all.jar" -c "C:\Users\Chaser\Desktop\StartJava\startjava_checks.xml" "%%f"
)

echo.
echo Cleaning class files...
del *.class

:end
echo Done.
