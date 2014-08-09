策略模式

这个模式涉及到三个角色:
  1) 环境(Context)角色: 持有一个Strategy类的引用。
  2) 抽象策略(Strategy)角色：
  3) 具体策略(ConcreteStrategy)角色：

java语言内部的例子：
  1) AWT中的LayoutManager
  2) Swing中的Border

举例：
  1) 排序策略系统

在什么情况下使用
  1) 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。