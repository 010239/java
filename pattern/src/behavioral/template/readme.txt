模版方法模式

这个模式涉及到两个角色:
  1) 抽象模版(Context)角色:
    定义了一个或多个抽象操作，以便让子类实现。
  2) 具体模版(Strategy)角色：

java语言内部的例子：
  1) HttpServlet中的service()方法


重构的原则：
  对一个继承的等级结构做重构时，尽量将行为移动到结构的高端，而将转态移动到结构的低端。

  1) 以多态性代替条件转移块
