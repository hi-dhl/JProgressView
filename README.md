
# <p align="center"> JProgressView </p>

<p align="center">
一个灵活的进度条，支持图形：圆形、圆角矩形、矩形等等
</p>

<p align="center">
<a href="https://github.com/hi-dhl"><img src="https://img.shields.io/badge/GitHub-HiDhl-4BC51D.svg?style=flat"></a> <a href="https://opensource.org/licenses/Apache-2.0"><img src="https://img.shields.io/badge/license-Apache2.0-blue.svg?style=flat"></a> <img src="https://img.shields.io/badge/language-kotlin-orange.svg"/> <img src="https://img.shields.io/badge/platform-android-lightgrey.svg"/>
</p>

![](http://cdn.51git.cn/2020-07-13-15946108487308.gif)


## Download

**Gradle**

* 将下列代码添加在项目 build.gradle 文件内

```
allprojects {
    repositories {
        jcenter()
    }
}
```

* 将下列代码添加进模块 build.gradle 文件内

```
dependencies {
    implementation 'com.hi-dhl:progressview:1.0.0'
}
```

## Usage

在 layout 文件内添加以下命名空间

```
xmlns:app="http://schemas.android.com/apk/res-auto"
```

### 进度条

**实现一个进度条基本示例**

```
<com.hi.dhl.jprogressview.JProgressView
    android:id="@+id/circleProgresssView0"
    android:layout_width="match_parent"
    android:layout_height="20dp"
    app:progress_animate_duration="1500"
    app:progress_color="@color/progress_color"
    app:progress_color_background="@color/progress_color_background"
    app:progress_paint_bg_width="@dimen/progress_paint_width"
    app:progress_paint_value_width="@dimen/progress_paint_width"
    app:progress_rect_text_align="1"
    app:progress_text_color="@color/progress_text_color"
    app:progress_text_size="@dimen/text_size_14sp"
    app:progress_text_visible="true"
    app:progress_type="2"
    app:progress_value="40"
    app:progress_rect_radius="8dp"
    app:progress_value_max="100" />
```

**通用属性，适合所有形状的进度条：**

* progress_type：进度条的形状
    * 矩形：0
    * 圆形：1
    * 圆角矩形：2
* progress_animate_duration: 动画运行时间
* progress_color：进度条颜色，表示当前进度
* progress_color_background：进度背景颜色
* progress_paint_bg_width：进度条背景画笔的宽度
* progress_paint_value_width：当前进度画笔的宽度
* progress_text_color：进度条上的文字的颜色
* progress_text_size：进度条上的文字的大小
* progress_text_visible：是否显示文字，默认不显示
* progress_value：当前进度条的进度
* progress_value_max：当前进度条的最大值

**以下属性，矩形 或者 圆角矩形进度条专有属性：**

* progress_rect_text_align：矩形 或者 圆角矩形 进度条专有属性，表示文字位于进度条位置：
    * 左边：0
    * 中间：1
    * 右边：2
* progress_rect_radius：矩形 或者 圆角矩形 进度条专有属性，表示进度条圆角

**以下属性，圆形进度条专有属性：**

* progress_circle_sweep_angle：表示进度开始的位置
    * left：0 
    * top：1 
    * right：2 
    * bottom：2

### 开启或停止动画

默认不开启动画，在需要开启动画的地方调用以下代码：

```
circleProgresssView0.startAnimal()
```

调用以下代码停止动画：

```
progresssView.stopAnimal()
```

还可以通过代码设置进度条一些属性：

```
progresssView
    .setProgress(90f) // 当前进度
    .setMaxProgress(300) // 进度条的最大值
    .setReverse(false) // 进度条回放
    .startAnimal() // 开启动画
```

未来还未支持更多功能，请持续关注，如果这个仓库对你有帮助，请仓库右上角帮我点个赞。

## 结语

致力于分享一系列 Android 系统源码、逆向分析、算法、翻译、Jetpack  源码相关的文章，如果你同我一样喜欢研究 Android 源码和算法，可以看一下我另外两个库 [Leetcode-Solutions-with-Java-And-Kotlin](https://github.com/hi-dhl/Leetcode-Solutions-with-Java-And-Kotlin) 和 [Android10-Source-Analysis](https://github.com/hi-dhl/Android10-Source-Analysis)

> 正在建立一个最全、最新的 AndroidX Jetpack 相关组件的实战项目 以及 相关组件原理分析文章，目前已经包含了 App Startup、Paging3、Hilt 等等，正在逐渐增加其他 Jetpack 新成员，仓库持续更新，可以前去查看：[AndroidX-Jetpack-Practice](https://github.com/hi-dhl/AndroidX-Jetpack-Practice)。

### Leetcode-Solutions-with-Java-And-Kotlin

由于 LeetCode 的题库庞大，每个分类都能筛选出数百道题，由于每个人的精力有限，不可能刷完所有题目，因此我按照经典类型题目去分类、和题目的难易程度去排序

* 数据结构： 数组、栈、队列、字符串、链表、树……
* 算法： 查找算法、搜索算法、位运算、排序、数学、……

每道题目都会用 Java 和 kotlin 去实现，并且每道题目都有解题思路，如果你同我一样喜欢算法、LeetCode，可以关注我 GitHub 上的 LeetCode 题解：[Leetcode-Solutions-with-Java-And-Kotlin](https://github.com/hi-dhl/Leetcode-Solutions-with-Java-And-Kotlin)，一起来学习，期待与你一起成长

### Android10-Source-Analysis

正在写一系列的 Android 10 源码分析的文章，了解系统源码，不仅有助于分析问题，在面试过程中，对我们也是非常有帮助的，如果你同我一样喜欢研究 Android 源码，可以关注我 GitHub 上的 [Android10-Source-Analysis](https://github.com/hi-dhl/Android10-Source-Analysis)，文章都会同步到这个仓库

## License

```
Copyright 2020 hi-dhl (Jack Deng)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


