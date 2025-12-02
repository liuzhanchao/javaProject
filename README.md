# Java Project

这是一个Java项目的基础结构。

## 项目结构

```
javaProject/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── App.java
├── .gitignore
└── README.md
```

## 如何运行

1. 编译Java代码：
   ```bash
   javac src/main/java/com/example/App.java -d target/classes
   ```

2. 运行程序：
   ```bash
   java -cp target/classes com.example.App
   ```

## 开发环境要求

- JDK 8 或更高版本
- Git