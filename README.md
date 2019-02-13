# whale-studio
引入方法，在工程最外层的 `build.gralde`文件中加入github的地址
```
allprojects {
    repositories {
        google()
        jcenter()

        maven { url "https://raw.githubusercontent.com/dstmath/whale-studio/master" }
    }
}
```
在模块的`build.gralde`添加依赖
```
implementation 'com.whale:whale_lib:1.0.1'
```