# RecordButton
录音按钮

* 实现原理 ，按下按钮，拦截OnTouch事件，弹出对话框，实现录音
```
setSavePath(path);//设置存储路径
setSaveName(name);//设置文件名字，如果设置了名字，将会一直使用，后面的录音文件会覆盖前面的文件
setMaxIntervalTime(time);//毫秒，设置最长时间
setMinIntervalTime(time);//毫秒，设置最短录音时间
```

如何使用

**先在 build.gradle(Project:XXXX) 的 repositories 添加:**

```
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

**然后在 build.gradle(Module:app) 的 dependencies 添加:**

```
	dependencies {
	        compile 'com.github.xuanu:RecordButton:0.0.3'
	}
```


<   [模样出处](https://github.com/WuLiFei/AudioRecoder)
	2、截图  
![image](https://github.com/xuanu/RecordButton/raw/master/screenshot/430632-5a2e63b8cc49ae98.gif)
