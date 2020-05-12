一、实验目标：

  1.体验敏捷开发中的两人合作。

  2.进一步提高个人编程技巧与实践。

二 、实验内容：

  1.根据以下问题描述，练习结对编程(pair programming)实践；

  2.要求学生两人一组，自由组合。每组使用一台计算机，二人共同编码，完成实验要求。

  3.要求在结对编程工作期间，两人的角色至少切换 4 次；

  4.编程语言不限，版本不限。建议使用 Python 或 JAVA 进行编程。

三、问题描述（二选一）

  开发一个自动生成小学四则运算题目的命令行 “软件”。实现输入你要出题的个数，随机产生四则运算，然后用户回答，并且进行打分。

        规则：用随机数实现100以内的加、减、乘、除运算，其中和与积不能超过100，差不为负（即须大减小），商不为小数或分数（即必须整除）。要求总计输出10个运算式，每输出一个运算式，等待输入结果，然后进行对错判断并输出，最后输出统计答对的题数与分。

【 Week 1】

一、项目概况                                                                       

  选题：四则运算

  开发工具：Eclipse

  组员：盛静远（3171002236）、苏巧玲（3140802225）

  项目地址：https://github.com/Shengjingyuan/Su-Sheng-travel-plans

  博客园地址：https://www.cnblogs.com/shengjingyuan/    https://www.cnblogs.com/SQL666/

二、相关概念介绍

1.敏捷开发

         敏捷开发是一种以人为核心、迭代、循序渐进的开发方法。在敏捷开发中，软件项目的构建被切分成多个子项目，各个子项目的成果都经过测试，具备集成和可运行的特征。简单地来说，敏捷开发并不追求前期完美的设计、完美编码，而是力求在很短的周期内开发出产品的核心功能，尽早发布出可用的版本。然后在后续的生产周期内，按照新需求不断迭代升级，完善产品。具体见https://blog.csdn.net/csdn15556927540/article/details/90712308

2.结对编程

        结对编程（英语：Pair programming）是一种敏捷软件开发的方法，两个程序员在一个计算机上共同工作。一个人输入代码，而另一个人审查他输入的每一行代码。输入代码的人称作驾驶员，审查代码的人称作观察员（或导航员）。两个程序员经常互换角色。在结对编程中，观察员同时考虑工作的战略性方向，提出改进的意见，或将来可能出现的问题以便处理。这样使得驾驶者可以集中全部注意力在完成当前任务的“战术”方面。观察员当作安全网和指南。结对编程对开发程序有很多好处。比如增加纪律性，写出更好的代码等。结对编程是极端编程的组成部分。详细见https://baike.baidu.com/item/%E7%BB%93%E5%AF%B9%E7%BC%96%E7%A8%8B/7526152?fr=aladdin
三、项目准备
       本次项目通过Github平台来托管团队代码来开展协作。首先由队员1在本地创建好Java项目，在项目所在目录下创建Git仓库，将首次编写好的项目提交到本地的Git仓库后，上传到队员1的Github平台。在Github上托管好项目后，队员2根据队员1提供的项目地址，即可获取项目代码，并且可在该平台上直接加入协作，这样就实现了队员1和队员2之间的结队编程。
四、项目内容
  
  项目名称：四则运算
  
  包名称：四则运算
  
  文件名称：Arithmetic.java；ChangeToFenshuDemo.java；CT.java
  
  main方法在文件3中，文件1中的GetQueston_int()和GetQuestion_div()方法分别用来生成整数表达式和分数表达式；
文件1中定义了arithmetic()方法来求解表达式字符串的结果（返回值double型），支持分数表达式；
文件2中定义了toFenshu()方法来将小数转化成分数，在GetQuestion_div()中使用它可以生成小于1的随机分数；
当已做题数到达5的倍数时就出一道分数题，否则出整数题；
定义一个大小30的字符串数组盛放已做题目，生成题目时需要判断是否已经做过；
在文件1中计算除法时，运算数是BigDecimal型的，使用divide方法运算时如果没有告诉计算机小数位精确到哪位的话，将结果分为小数部分和整数部分，小数部分可能因为超过int数值范围而报错，所以需要在81行位置指定精度2。

五、代码准备

  本次项目选用的编程语言为Java，参考代码所属的博文如下：https://cloud.tencent.com

六、初步成果
  
  初次结果仍有不足，虽然可以判断对错，但是没有打分的功能。就此问题下周会与队友详细讨论。
 
【Week 2】

一、实验目标
  
  1）体验敏捷开发中的两人合作。

  2）进一步提高个人编程技巧与实践。

二 、实验内容
  1）根据以下问题描述，练习结对编程(pair programming)实践；

  2）要求学生两人一组，自由组合。每组使用一台计算机，二人共同编码，完成实验要求。

  3）要求在结对编程工作期间，两人的角色至少切换 4 次；

  4）编程语言不限，版本不限。建议使用 Python 或 JAVA 进行编程。

一、代码规范

    import java.util.Scanner;
    public class Test1{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 10;
        int a, b;
        int sum = 0;
        System.out.println("共有"+n+"道题，请做好准备:");
        int[] op = new int[n];
        int[] s = new int[n];
        int[] result = new int[n];
        String[] questions = new String[n];
        for (int i = 0; i < n; i++) {
          op[i] = (int) (Math.random() * 4); // 运算符
          a = (int) (Math.random() * 89) + 10; // 数a
          b = (int) (Math.random() * 89) + 10; // 数b
          System.out.println(a + getOp(op[i]) + b + "=?");
          System.out.println("输入答案:");
          s[i] = scanner.nextInt(); // 输入的答案
          result[i] = jisuan(a, b, op[i]); // 正确答案
          if (s[i] == result[i]) {
            sum++;
          }
          questions[i] = a + getOp(op[i]) + b + "=" + result[i];
          }
       // 最后的输出
          System.out.println("你答对了" + sum + "道题，答错了" + (n - sum) + "道题");
          for (int i = 0; i < n; i++) {
              System.out.print(questions[i]);
              if (s[i] == result[i]) {
                System.out.println(",你的回答是" + s[i] + "，正确");
              } else {
                System.out.println(",你的回答是" + s[i] + "，错误");
              }
            }
        }
    // 获取运算符
    private static String getOp(int index) {
      String string = "";
      switch (index) {
        case 0:
          string = "+";
          break;
        case 1:
          string = "-";
          break;
        case 2:
          string = "*";
          break;
        case 3:
          string = "/";
          break;
      }
      return string;
    }
    // 计算答案
    private static int jisuan(int a, int b, int index) {
      int sum = 0;
      switch (index) {
      case 0:
        sum = a + b;
        break;
      case 1:
        sum = a - b;
        break;
      case 2:
        sum = a * b;
        break;
      case 3:
        sum = a / b;
        break;
      }
      return sum;
      }
    }

二、程序总体设计

   1. 生成问题

　　Math.random()是令系统随机选取大于等于0.0且小于1.0的伪随机double值，是Java语言常用代码。利用Math.random()随即函数来获取运算符和参与运算的两个整数，随机组合生成二项运算式。

　　（1）获取参与运算的整数

    a = (int) (Math.random() * 89) + 10; // 数a
    b = (int) (Math.random() * 89) + 10; // 数b
 　　控制a、b为区间(0,100)上的整数。

　　（2）获取运算符

    op[i] = (int) (Math.random() * 4); // 运算符
　　先将四则运算中的运算符量化，以区间[0,3]上的四个整数来区分 。

    private static String getOp(int index) {
        String string = "";
        switch (index) {
        case 0:
            string = "+";
            break;
        case 1:
            string = "-";
            break;
        case 2:
            string = "*";
            break;
        case 3:
            string = "/";
            break;
        }
        return string;
    }
 　　定义一个用来获取运算符的对象getOp()，分别指定整数1、2、3、4对应的运算符为+、-、*、/。

 　　（3）输出问题
     
    System.out.println(a + getOp(op[i]) + b + "=?");
   
   2.计算答案

    private static int jisuan(int a, int b, int index) {
        int sum = 0;
        switch (index) {
        case 0:
            sum = a + b;
            break;
        case 1:
            sum = a - b;
            break;
        case 2:
            sum = a * b;
            break;
        case 3:
            sum = a / b;
            break;
        }
        return sum;
    }
　　基于上述运算符对应的数字，sum的值就1、2、3、4分别对应为a、b和运算、差运算、积运算、商运算的结果。

    result[i] = jisuan(a, b, op[i]); // 正确答案
  3.输入答案

    System.out.println("输入答案:");
  4.判错

    if (s[i] == result[i]) {
                System.out.println(",你的回答是" + s[i] + "，正确");
            } else {
                System.out.println(",你的回答是" + s[i] + "，错误");
            }
    }
 　　将输入的答案s[i]与正确答案result[i]进行对比，若两者不相等，则判定为错误，反之判定为正确。　

  5.输出最后的结果

    System.out.println("你答对了" + sum + "道题，答错了" + (n - sum) + "道题");
 　　统计最终对了几题和错了几题。

三、程序结对编程过程
　　 
   
     本次结对编程我与苏巧玲同学利用PC端的腾讯QQ对话框中的远程协作技术，Test1.java文件在苏巧玲同学的电脑上编写、改正、编译与运行，其中我与苏巧玲同学互换身份共4次。
     第一次互换:苏编写生成问题的模块，盛进行检查纠正
     第二次互换:盛编写计算答案的模块，苏进行检查纠正
     第三次互换:苏完成判错模块的编写，盛进行检查纠正
     第四次互换:盛完成剩余代码的编写，苏进行检查纠正

 　　编写程序的过程中，因程序较短同时又有参考的代码，几乎没有出错。但在编译运行后才发现犯了一个非常低级的错误，没有添加头文件。在添上头文件之后，程序成功运行。

四、项目GitHub地址

　　Test1由苏巧玲同学Pull Request，我来做的merge。Test2由我来提交。
    项目的GitHub地址为https://github.com/Shengjingyuan/Su-Sheng-travel-plans

五、实验总结

1.在本次实验的过程中切身体会到了结对编程确实提高了代码的质量，大大降低了出错率。两个人协作比一个人要有趣的多，效率也很高。
2.PC端腾讯QQ的远程协作功能不是很给力，操作上存在很大的延时，但是也不影响操作，可能是网络问题。
3.本次的程序功能并不完善，缺少最终的打分功能，期待下周的再次讨论。

 

 

 

 

 
