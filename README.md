
# <p align="center"> JProgressView <br/> <img src='http://cdn.51git.cn/2020-07-15-15948208369286.gif'></p>

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

## JProgressView 包含以下功能

* 支持在 XML 中配置是否自动播放动画（true : 当 view 可见的时候会自动播放动画）
* 支持自定义图形：圆形、圆角矩形、矩形
* 支持代码和 XML 设置进度条属性；同时设置代码会覆盖 XML 设置的属性
* 支持设置文字是否显示，文字距离进度条的位置、大小、颜色等等
* 支持设置进度的的颜色，当前进度值、进度的最大值、动画运行时间等等
* 更多功能正在开发中...... 

## Download

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
    implementation 'com.hi-dhl:progressview:1.0.2'
}
```

## Usage

**1.在 layout 文件内添加以下命名空间**

```
xmlns:app="http://schemas.android.com/apk/res-auto"
```

**2.实现一个进度条基本示例**

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
| progress_type | integer  | 圆形：1 | 矩形：0；圆形：1；圆角矩形：2 |
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
| progress_start_animate | boolean | 默认不自动开启：false | 是否开动画自动播放 |

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

还可以通过代码设置进度条一些属性，代码会覆盖 XML 设置的属性

```
progresssView
    .setProgress(0f)// 当前进度
    .setMaxProgress(100)// 进度条的最大值
    .setReverse(false)// 进度条回放
    .setAnimateDuration(1000)// 动画运行时间
    .isShowText(true)// 是否显示文字
    .setProgressColor(resources.getColor(R.color.progress_color, null))// 当前进度颜色
    .setProgressColorBackground(resources.getColor(R.color.progress_color_background, null))// 进度条背景颜色
    .setRectRadius(resources.getDimension(R.dimen.common_radius_8dp))// 圆角
    .setRectTextAlign(1)// 文字位于进度条位置(左边：0；中间：1；右边：2)
    .setTextColor(resources.getColor(R.color.progress_text_color, null))// 文字颜色
    .setTextSize(resources.getDimension(R.dimen.text_size_14sp))// 文字大小
    .setShapeType(2)// 形状： 矩形：0；圆形：1；圆角矩形：2
    .setProgressPaintBackgroundWidth(resources.getDimension(R.dimen.progress_paint_width))// 进度条背景画笔的宽度
    .setProgressPaintWidth(resources.getDimension(R.dimen.progress_paint_width))// 当前进度画笔的宽度
    .resetValue()// 通过代码设置完属性之后，需要调用，重新绘制
```

未来还未支持更多自定义图形，请持续关注，如果这个仓库对你有帮助，请仓库右上角帮我 star 一下。

---

最后推荐我一直在更新维护的项目和网站：

* 计划建立一个最全、最新的 AndroidX Jetpack 相关组件的实战项目 以及 相关组件原理分析文章，正在逐渐增加 Jetpack 新成员，仓库持续更新，欢迎前去查看：[AndroidX-Jetpack-Practice](https://github.com/hi-dhl/AndroidX-Jetpack-Practice)

* LeetCode / 剑指 offer / 国内外大厂面试题 / 多线程 题解，语言 Java 和 kotlin，包含多种解法、解题思路、时间复杂度、空间复杂度分析<br/>

    <image src="http://cdn.51git.cn/2020-10-04-16017884626310.jpg" width = "500px"/>
  
    * 剑指 offer 及国内外大厂面试题解：[在线阅读](https://offer.hi-dhl.com)
    * LeetCode 系列题解：[在线阅读](https://leetcode.hi-dhl.com)

* 最新 Android 10 源码分析系列文章，了解系统源码，不仅有助于分析问题，在面试过程中，对我们也是非常有帮助的，仓库持续更新，欢迎前去查看 [Android10-Source-Analysis](https://github.com/hi-dhl/Android10-Source-Analysis)

* 整理和翻译一系列精选国外的技术文章，每篇文章都会有**译者思考**部分，对原文的更加深入的解读，仓库持续更新，欢迎前去查看 [Technical-Article-Translation](https://github.com/hi-dhl/Technical-Article-Translation)

* 「为互联网人而设计，国内国外名站导航」涵括新闻、体育、生活、娱乐、设计、产品、运营、前端开发、Android 开发等等网址，欢迎前去查看 [为互联网人而设计导航网站](https://site.51git.cn)

