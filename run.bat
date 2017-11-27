cd C:\Users\inhoj\Desktop\eclipse\workspace\The Coder
javac -J-Xms128m -J-Xmx512m code.java 2>error.txt
java -Xms128m -Xmx512m -Xss64m code 1>result.txt
exit