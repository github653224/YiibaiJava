<<<<<<< HEAD
<<<<<<< HEAD
# 1.00-Java教程（YiibaiJava）

[TOC]

Java是一种广泛使用的计算机编程技术。我们从了解一些基本问题开始学习java，例如了解什么是java，核心java，java在哪里使用，在java中创建什么类型的应用程序，为什么使用java等等。

## Java是什么？

Java是一种编程语言和一个平台。Java是一种高级，健壮，安全和面向对象的编程语言。

**平台：** 程序运行的任何硬件或软件环境都可叫作平台。由于Java有自己的运行时环境(`JRE`)和`API`，所以它也被称为平台。

## Java示例

下面来看看一个java编程示例。 `Hello Java`示例程序的详细描述将在教程的下一页中给出。

```java
class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}

```

## Java在哪里使用？

据Sun公司(现已被Oracle公司收购)称：有`30`亿个设备使用和运行`java`。现在仍有很多设备(Android手机就是一种)，目前使用java。其中一些如下：

1. 桌面应用程序，如`acrobat`阅读器，媒体播放器，防病毒等。
2. Web应用程序，如：`irctc.co.in`，`taobao.com`，`jd.com`等。
3. 企业应用程序如银行应用程序。
4. 移动应用(Android手机)
5. 嵌入式系统
6. 智能卡
7. 机器人
8. 游戏等

## Java应用程序的类型

主要有`4`种类型的应用程序可以使用`java`编程语言来创建：

**1. 独立应用程序**

它也被称为桌面应用程序或基于窗口的应用程序。我们需要在每台机器上安装的应用程序，如媒体播放器，防病毒等。`AWT`和`Swing`框架在`java`中可用于创建独立应用程序。

**2. Web应用程序**

在服务器端运行并创建动态页面的应用程序称为Web应用程序。目前，[servlet](../servlets/default.htm)，[jsp](../jsp/default.htm)，[struts](../struts/default.htm)，jsf等技术用于在java中创建web应用程序。

**3. 企业应用**

自然分布的应用程序，如银行应用程序等。它具有高级别安全性，负载平衡和集群的优势。 在java中，EJB用于创建企业应用程序。

**4. 移动应用**

为移动设备创建的应用程序。目前Android和Java ME用于创建移动应用程序。

## Java的历史

Java的历史是比较有趣的。Java的历史从绿色团队(`Green Team`)开始，Java团队成员(也称为绿色团队-`Green Team`)发起了一项革命性任务，他们想要为数字设备(如机顶盒，电视等)开发语言。

对于绿色团队成员，这是一个先进的概念。 但是，它适合于互联网编程。 后来，Java技术由Netscape合并。

目前，Java用于互联网编程，移动设备，游戏，电子商务解决方案等。下面是描述Java历史的主要特点。

1. `James Gosling`，`Mike Sheridan`和`Patrick Naughton`于1991年6月发起了Java语言项目。Sun工程师的小团队称为`Green Team`。
2. Java的最初设计用于电子电器，如：机顶盒中的小型嵌入式系统。
3. 最初，它被`James Gosling`称为“`Greentalk`”，文件扩展名为`.gt`(不是`.java`)。
4. 之后，它被称为 `Oak` ，并开发作为 `Green` 项目的一部分。

下面就是Java之父 - `James Gosling` 大神。

![img](images/686140245_35550.jpg)

> 提示：据说每个在Java编程的人在第一次学习Java的时候，都要拜一拜他。以求在未来编写的Java程序时，少几个Bug。

## 为什么 Sun 要选择“Oak”这个的名字？

1. 为什么选择的名字橡树(`Oak`)？ 因为橡树是力量的象征，选择作为美国，法国，德国，罗马尼亚等许多国家的国家树。
2. 1995年，`Oak`正式更名为“`Java`”，因为`Oak`技术的这个商标已经被别人使用了。

## 为什么sun选择“Java”作为名字？

1. 为什么他们选择`java`名称为java语言？ 当时团队聚集要选择一个新的名字，建议的单词是“动态的”，“革命的”，“丝绸的”，“颠簸”，“DNA”等。他们想要的东西反映了技术的本质：革命，动态，活泼，酷，独特，容易拼写和有趣。
2. 根据詹姆斯·高斯林(James Gosling)的“**Java was one of the top choices along with Silk**” 因为java是如此独特，大多数团队成员都喜欢java。
3. Java是印尼的一个岛屿，它生产第一杯咖啡(称为java咖啡)。
4. 请注意，Java不是一个缩写的名称。
5. 最初由`James Gosling`在Sun Microsystems(现在是Oracle的子公司)开发，并于1995年发布。
6. 1995年，“时代”杂志称之为“1995年十大最佳产品之一”。
7. JDK 1.0发布(1996年1月23日)。

## Java版本历史

现在为止，已经发布了许多java版本了，Java当前稳定版本是Java SE 8，马上就要出来新版本：Java 9 了 。历史版本如下：

- JDK Alpha and Beta (1995)
- JDK 1.0 (23rd Jan, 1996)
- JDK 1.1 (19th Feb, 1997)
- J2SE 1.2 (8th Dec, 1998)
- J2SE 1.3 (8th May, 2000)
- J2SE 1.4 (6th Feb, 2002)
- J2SE 5.0 (30th Sep, 2004)
- Java SE 6 (11th Dec, 2006)
- Java SE 7 (28th July, 2011)
- Java SE 8 (18th March, 2014)
- Java SE 9 (?)

## Java语言特点

下面列出许多java的功能的特点。它们也被称为java流行语。下面给出的Java特性简单易懂。

1. 简单(Simple)
2. 面向对象(Object-Oriented)
3. 方便，可移植(Portable)
4. 平台独立(Platform independent)
5. 安全(Secured)
6. 强大,健壮(Robust)
7. 体系结构中立(Architecture neutral)
8. 动态(Dynamic)
9. 解释执行(Interpreted)
10. 高性能(High Performance)
11. 多线程(Multithreaded)
12. 分布式(Distributed)

如下图所示 -

![img](images/954150210_27743.png)

接下来我们一个个地解释说明。

## 简单(Simple)

根据Sun的说法，Java语言很简单，这是因为：

- Java的语法是基于C++(程序员在学习C++之后更容易学习它)。
- 移除许多令人困惑和/或很少使用的特征，例如，显式指针，操作符重载等。
- 不需要删除未引用的对象，因为在Java中有自动垃圾收集。

## 面向对象(Object-Oriented)

面向对象意味着将软件组织成不同类型的对象，对象中结合了数据和行为。面向对象编程(OOP)是一种通过提供一些规则来简化软件开发和维护的方法。
**面向对象编程(OOP)的基本概念是：**

- 对象
- 类
- 继承
- 多态性
- 抽象
- 封装

## 平台独立(Platform independent)

平台是程序运行的硬件或软件环境。有两种类型的平台：基于软件和基于硬件。Java提供基于软件的平台。
Java平台与大多数其他平台的不同之处在于它是一个基于软件的平台，运行在其他基于硬件的平台之上。它有两个组件：

1. 运行时环境
2. API(应用程序编程接口)

![img](images/477150230_37475.png)

Java代码可以在多个平台上运行，例如：Windows，Linux，Sun Solaris，Mac/OS等。Java代码由编译器编译并转换为字节码。这个字节码是一个独立于平台的代码，因为它可以在多个平台上运行，即一次写入和到处运行(WORA)。

## 安全(Secured)

Java是安全的，这是因为：

- 没有显式指针
- Java程序在虚拟机沙箱中运行

![img](images/625150219_16893.png)

- **类装载器**：通过将本地文件系统与那些从网络资源导入的类分开包装，以增加安全性。
- **字节码校验器**：检查代码片段中是否存在违反对象访问权限的非法代码。
- **安全管理器**：确定类可以访问什么资源，例如读取和写入本地磁盘。

这些安全方法是由java语言提供的。 一些安全性还可以由应用开发商通过SSL，JAAS，加密等提供。

## 强大,健壮(Robust)

健壮意味着强大。Java使用强大的内存管理，从而避免有安全问题的指针。在java中有自动垃圾收集。 在java中有异常处理和类型检查机制。所有这些点是使java强大的理由。

## 架构中立(Architecture neutral)

Java中并没有实现相关的特征。原始类型的大小是固定的。

在C语言编程中，对于`32`位架构，`int`数据类型占用`2`字节的存储器，对于`64`位架构，`int`数据类型占用`4`字节的存储器。 但在java中，它为`32`位和`64`位体系结构占用`4`字节的内存。

## 可移植

可以将java字节码携带到任何平台。

## 高性能

Java比传统的解释更快，因为字节代码与本地代码“接近”，但仍然比编译语言(例如C++)慢一些。

## 分布式(Distributed)

可以在java中创建分布式应用程序。RMI和EJB用于创建分布式应用程序。我们可以通过从互联网上的任何机器调用方法来访问文件。

## 多线程

线程就像一个单独的程序，并发执行。 我们可以编写Java程序，通过定义多个线程一次处理多个任务。多线程的主要优点是每个线程它不占用内存。它共享一个公共内存区域 线程对于多媒体，Web应用程序等非常重要。

来源： [http://www.yiibai.com/java/](http://www.yiibai.com/java/)
=======
# YiibaiJava

>>>>>>> parent of b21b0ff... 调整目录章节的内容
=======
# YiibaiJava

<<<<<<< HEAD
>>>>>>> parent of b21b0ff... 调整目录章节的内容
=======
# 1.00-Java教程

[TOC]

Java是一种广泛使用的计算机编程技术。我们从了解一些基本问题开始学习java，例如了解什么是java，核心java，java在哪里使用，在java中创建什么类型的应用程序，为什么使用java等等。

## Java是什么？

Java是一种编程语言和一个平台。Java是一种高级，健壮，安全和面向对象的编程语言。

**平台：** 程序运行的任何硬件或软件环境都可叫作平台。由于Java有自己的运行时环境(`JRE`)和`API`，所以它也被称为平台。

## Java示例

下面来看看一个java编程示例。 `Hello Java`示例程序的详细描述将在教程的下一页中给出。

```java
class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}

```

## Java在哪里使用？

据Sun公司(现已被Oracle公司收购)称：有`30`亿个设备使用和运行`java`。现在仍有很多设备(Android手机就是一种)，目前使用java。其中一些如下：

1. 桌面应用程序，如`acrobat`阅读器，媒体播放器，防病毒等。
2. Web应用程序，如：`irctc.co.in`，`taobao.com`，`jd.com`等。
3. 企业应用程序如银行应用程序。
4. 移动应用(Android手机)
5. 嵌入式系统
6. 智能卡
7. 机器人
8. 游戏等

## Java应用程序的类型

主要有`4`种类型的应用程序可以使用`java`编程语言来创建：

**1. 独立应用程序**

它也被称为桌面应用程序或基于窗口的应用程序。我们需要在每台机器上安装的应用程序，如媒体播放器，防病毒等。`AWT`和`Swing`框架在`java`中可用于创建独立应用程序。

**2. Web应用程序**

在服务器端运行并创建动态页面的应用程序称为Web应用程序。目前，[servlet](../servlets/default.htm)，[jsp](../jsp/default.htm)，[struts](../struts/default.htm)，jsf等技术用于在java中创建web应用程序。

**3. 企业应用**

自然分布的应用程序，如银行应用程序等。它具有高级别安全性，负载平衡和集群的优势。 在java中，EJB用于创建企业应用程序。

**4. 移动应用**

为移动设备创建的应用程序。目前Android和Java ME用于创建移动应用程序。

## Java的历史

Java的历史是比较有趣的。Java的历史从绿色团队(`Green Team`)开始，Java团队成员(也称为绿色团队-`Green Team`)发起了一项革命性任务，他们想要为数字设备(如机顶盒，电视等)开发语言。

对于绿色团队成员，这是一个先进的概念。 但是，它适合于互联网编程。 后来，Java技术由Netscape合并。

目前，Java用于互联网编程，移动设备，游戏，电子商务解决方案等。下面是描述Java历史的主要特点。

1. `James Gosling`，`Mike Sheridan`和`Patrick Naughton`于1991年6月发起了Java语言项目。Sun工程师的小团队称为`Green Team`。
2. Java的最初设计用于电子电器，如：机顶盒中的小型嵌入式系统。
3. 最初，它被`James Gosling`称为“`Greentalk`”，文件扩展名为`.gt`(不是`.java`)。
4. 之后，它被称为 `Oak` ，并开发作为 `Green` 项目的一部分。

下面就是Java之父 - `James Gosling` 大神。

![img](images/686140245_35550.jpg)

> 提示：据说每个在Java编程的人在第一次学习Java的时候，都要拜一拜他。以求在未来编写的Java程序时，少几个Bug。

## 为什么 Sun 要选择“Oak”这个的名字？

1. 为什么选择的名字橡树(`Oak`)？ 因为橡树是力量的象征，选择作为美国，法国，德国，罗马尼亚等许多国家的国家树。
2. 1995年，`Oak`正式更名为“`Java`”，因为`Oak`技术的这个商标已经被别人使用了。

## 为什么sun选择“Java”作为名字？

1. 为什么他们选择`java`名称为java语言？ 当时团队聚集要选择一个新的名字，建议的单词是“动态的”，“革命的”，“丝绸的”，“颠簸”，“DNA”等。他们想要的东西反映了技术的本质：革命，动态，活泼，酷，独特，容易拼写和有趣。
2. 根据詹姆斯·高斯林(James Gosling)的“**Java was one of the top choices along with Silk**” 因为java是如此独特，大多数团队成员都喜欢java。
3. Java是印尼的一个岛屿，它生产第一杯咖啡(称为java咖啡)。
4. 请注意，Java不是一个缩写的名称。
5. 最初由`James Gosling`在Sun Microsystems(现在是Oracle的子公司)开发，并于1995年发布。
6. 1995年，“时代”杂志称之为“1995年十大最佳产品之一”。
7. JDK 1.0发布(1996年1月23日)。

## Java版本历史

现在为止，已经发布了许多java版本了，Java当前稳定版本是Java SE 8，马上就要出来新版本：Java 9 了 。历史版本如下：

- JDK Alpha and Beta (1995)
- JDK 1.0 (23rd Jan, 1996)
- JDK 1.1 (19th Feb, 1997)
- J2SE 1.2 (8th Dec, 1998)
- J2SE 1.3 (8th May, 2000)
- J2SE 1.4 (6th Feb, 2002)
- J2SE 5.0 (30th Sep, 2004)
- Java SE 6 (11th Dec, 2006)
- Java SE 7 (28th July, 2011)
- Java SE 8 (18th March, 2014)
- Java SE 9 (?)

## Java语言特点

下面列出许多java的功能的特点。它们也被称为java流行语。下面给出的Java特性简单易懂。

1. 简单(Simple)
2. 面向对象(Object-Oriented)
3. 方便，可移植(Portable)
4. 平台独立(Platform independent)
5. 安全(Secured)
6. 强大,健壮(Robust)
7. 体系结构中立(Architecture neutral)
8. 动态(Dynamic)
9. 解释执行(Interpreted)
10. 高性能(High Performance)
11. 多线程(Multithreaded)
12. 分布式(Distributed)

如下图所示 -

![img](images/954150210_27743.png)

接下来我们一个个地解释说明。

## 简单(Simple)

根据Sun的说法，Java语言很简单，这是因为：

- Java的语法是基于C++(程序员在学习C++之后更容易学习它)。
- 移除许多令人困惑和/或很少使用的特征，例如，显式指针，操作符重载等。
- 不需要删除未引用的对象，因为在Java中有自动垃圾收集。

## 面向对象(Object-Oriented)

面向对象意味着将软件组织成不同类型的对象，对象中结合了数据和行为。面向对象编程(OOP)是一种通过提供一些规则来简化软件开发和维护的方法。
**面向对象编程(OOP)的基本概念是：**

- 对象
- 类
- 继承
- 多态性
- 抽象
- 封装

## 平台独立(Platform independent)

平台是程序运行的硬件或软件环境。有两种类型的平台：基于软件和基于硬件。Java提供基于软件的平台。
Java平台与大多数其他平台的不同之处在于它是一个基于软件的平台，运行在其他基于硬件的平台之上。它有两个组件：

1. 运行时环境
2. API(应用程序编程接口)

![img](images/477150230_37475.png)

Java代码可以在多个平台上运行，例如：Windows，Linux，Sun Solaris，Mac/OS等。Java代码由编译器编译并转换为字节码。这个字节码是一个独立于平台的代码，因为它可以在多个平台上运行，即一次写入和到处运行(WORA)。

## 安全(Secured)

Java是安全的，这是因为：

- 没有显式指针
- Java程序在虚拟机沙箱中运行

![img](images/625150219_16893.png)

- **类装载器**：通过将本地文件系统与那些从网络资源导入的类分开包装，以增加安全性。
- **字节码校验器**：检查代码片段中是否存在违反对象访问权限的非法代码。
- **安全管理器**：确定类可以访问什么资源，例如读取和写入本地磁盘。

这些安全方法是由java语言提供的。 一些安全性还可以由应用开发商通过SSL，JAAS，加密等提供。

## 强大,健壮(Robust)

健壮意味着强大。Java使用强大的内存管理，从而避免有安全问题的指针。在java中有自动垃圾收集。 在java中有异常处理和类型检查机制。所有这些点是使java强大的理由。

## 架构中立(Architecture neutral)

Java中并没有实现相关的特征。原始类型的大小是固定的。

在C语言编程中，对于`32`位架构，`int`数据类型占用`2`字节的存储器，对于`64`位架构，`int`数据类型占用`4`字节的存储器。 但在java中，它为`32`位和`64`位体系结构占用`4`字节的内存。

## 可移植

可以将java字节码携带到任何平台。

## 高性能

Java比传统的解释更快，因为字节代码与本地代码“接近”，但仍然比编译语言(例如C++)慢一些。

## 分布式(Distributed)

可以在java中创建分布式应用程序。RMI和EJB用于创建分布式应用程序。我们可以通过从互联网上的任何机器调用方法来访问文件。

## 多线程

线程就像一个单独的程序，并发执行。 我们可以编写Java程序，通过定义多个线程一次处理多个任务。多线程的主要优点是每个线程它不占用内存。它共享一个公共内存区域 线程对于多媒体，Web应用程序等非常重要。

来源： [http://www.yiibai.com/java/](http://www.yiibai.com/java/)



>>>>>>> parent of 8292db6... Revert "调整目录章节的内容"


