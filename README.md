
# <p align="center"> JProgressView </p>

<p align="center"> 如果这个仓库对你有帮助，请仓库右上角帮我 star 一下</p>

<p align="center">
一个小巧灵活可定制的进度条，支持图形：圆形、圆角矩形、矩形等等，陆续会添加更多的图形
</p>

<p align="center">
<a href="https://github.com/hi-dhl"><img src="https://img.shields.io/badge/GitHub-HiDhl-4BC51D.svg?style=flat"></a> <a href="https://opensource.org/licenses/Apache-2.0"><img src="https://img.shields.io/badge/license-Apache2.0-blue.svg?style=flat"></a> <img src="https://img.shields.io/badge/language-kotlin-orange.svg"/> <img src="https://img.shields.io/badge/platform-android-lightgrey.svg"/>
</p>

<p align="center">
<img src="http://cdn.51git.cn/2020-07-13-15946108487308.gif"/> 
</p>


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

| 名称 | 值类型 | 默认值 | 备注 |
| --- | --- | --- | --- |
| progress_type | integer  | 圆形：1 | 矩形：0；矩形：0；矩形：0 |
| progress_animate_duration | integer | 2000 | 动画运行时间 |
| progress_color | color | Color.GRAY | 当前进度颜色 |
| progress_color_background | color  | Color.GRAY | 进度条背景颜色 |
| progress_paint_bg_width | dimen | 10 | 进度条背景画笔的宽度 |
| progress_paint_value_width | dimen | 10 | 当前进度画笔的宽度 |
| progress_text_color | color | Color.BLUE | 进度条上的文字的颜色 |
| progress_text_size | dimen | `sp2Px(20f)` | 进度条上的文字的大小 |
| progress_text_visible | boolean | 默认不显示：false | 是否显示文字 |
| progress_value | integer | 0 | 当前进度 |
| progress_value_max | integer | 100 | 当前进度条的最大值 |

**以下属性，矩形 或者 圆角矩形进度条专有属性：**

| 名称 | 值类型 | 默认值 | 备注 |
| --- | --- | --- | --- |
| progress_rect_text_align | integer  | 中间：1 | 文字位于进度条位置(左边：0；中间：1；右边：2) |
| progress_rect_radius | dimen  | 0 | 进度条圆角 |

**以下属性，圆形进度条专有属性：**

| 名称 | 值类型 | 默认值 | 备注 |
| --- | --- | --- | --- |
| progress_circle_sweep_angle | integer  | top：1 | 进度条开始角度(left：0；top：1；right：2；bottom：3) |

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

未来还未支持更多自定义图形，请持续关注，如果这个仓库对你有帮助，请仓库右上角帮我 star 一下。

## 结语

致力于分享一系列 Android 系统源码、逆向分析、算法、翻译、Jetpack 源码相关的文章，欢迎一起来学习，在技术的道路上一起前进，另外我还在维护其他项目 [Android10-Source-Analysis](https://github.com/hi-dhl/Android10-Source-Analysis)、[Leetcode-Solutions-with-Java-And-Kotlin](https://github.com/hi-dhl/Leetcode-Solutions-with-Java-And-Kotlin) 、[Technical-Article-Translation](https://github.com/hi-dhl/Technical-Article-Translation) 、 [AndroidX-Jetpack-Practice](https://github.com/hi-dhl/AndroidX-Jetpack-Practice) 可以前去查看。

### AndroidX-Jetpack-Practice

正在建立一个最全、最新的 AndroidX Jetpack 相关组件的实战项目 以及 相关组件原理分析文章，目前已经包含了 App Startup、Paging3、Hilt 等等，正在逐渐增加其他 Jetpack 新成员，仓库持续更新，可以前去查看：[AndroidX-Jetpack-Practice](https://github.com/hi-dhl/AndroidX-Jetpack-Practice)。

### Android10-Source-Analysis

正在写一系列的 Android 10 源码分析的文章，了解系统源码，不仅有助于分析问题，在面试过程中，对我们也是非常有帮助的，如果你同我一样喜欢研究 Android 源码，可以关注我 GitHub 上的 [Android10-Source-Analysis](https://github.com/hi-dhl/Android10-Source-Analysis)。

### Leetcode-Solutions-with-Java-And-Kotlin

由于 LeetCode 的题库庞大，每个分类都能筛选出数百道题，由于每个人的精力有限，不可能刷完所有题目，因此我按照经典类型题目去分类、和题目的难易程度去排序。

* 数据结构： 数组、栈、队列、字符串、链表、树……
* 算法： 查找算法、搜索算法、位运算、排序、数学、……

每道题目都会用 Java 和 kotlin 去实现，并且每道题目都有解题思路，如果你同我一样喜欢算法、LeetCode，可以关注我 GitHub 上的 LeetCode 题解：[Leetcode-Solutions-with-Java-And-Kotlin](https://github.com/hi-dhl/Leetcode-Solutions-with-Java-And-Kotlin)。

### Technical-Article-Translation

目前正在整理和翻译一系列精选国外的技术文章，不仅仅是翻译，很多优秀的英文技术文章提供了很好思路和方法，每篇文章都会有**译者思考**部分，对原文的更加深入的解读，可以关注我 GitHub 上的 [Technical-Article-Translation](https://github.com/hi-dhl/Technical-Article-Translation)。

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


