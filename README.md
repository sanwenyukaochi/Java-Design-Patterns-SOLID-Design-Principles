# Java 23种设计模式超全详解

### 一、创建型模式（管"生孩子"的）

#### 1\. 单例模式（Singleton）

**问题**：如何保证一个类只有一个实例？  
**生活案例**：一个国家只有一个总统，所有部门都找同一个人办事  
**核心**：私有构造器 + 静态实例 + 全局访问点

```java
public class President {
    private static President instance; // 唯一总统

    private President() {
    } // 禁止外部new总统

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }
}

// 使用：
President p1 = President.getInstance();
President p2 = President.getInstance();
System.out.println(p1 == p2); // true（同一个人）
```

#### 2\. 工厂方法模式（Factory Method）

**问题**：如何让创建对象更灵活？  
**生活案例**：汽车工厂生产不同车型，客户不关心制造细节  
**核心**：定义创建接口，子类决定实例化哪个类

```java
interface Car {
    void drive();
}

class SUV implements Car {
    public void drive() {
        System.out.println("越野车行驶");
    }
}

class CarFactory {
    public Car createCar(String type) {
        if ("SUV".equals(type)) return new SUV();
        return null;
    }
}

// 使用：
Car myCar = new CarFactory().createCar("SUV");
myCar.drive(); // 越野车行驶
```

#### 3\. 抽象工厂模式（Abstract Factory）

**问题**：如何创建相关产品家族？  
**生活案例**：苹果工厂生产iPhone+AirPods，小米工厂生产手机+耳机  
**核心**：工厂接口生产多个关联产品

```java
interface Phone {
    void call();
}

interface Earphone {
    void play();
}

// 苹果产品家族
class iPhone implements Phone { /*...*/
}

class AirPods implements Earphone { /*...*/
}

interface TechFactory {
    Phone createPhone();

    Earphone createEarphone();
}

class AppleFactory implements TechFactory {
    public Phone createPhone() {
        return new iPhone();
    }

    public Earphone createEarphone() {
        return new AirPods();
    }
}
```

#### 4\. 建造者模式（Builder）

**问题**：如何创建复杂对象？  
**生活案例**：点汉堡时定制配料（加芝士/去生菜/多酱料）  
**核心**：分步构建 + 链式调用

```java
class Burger {
    private boolean cheese, lettuce;

    static class Builder {
        private boolean cheese = false;
        private boolean lettuce = true;

        Builder addCheese() {
            this.cheese = true;
            return this;
        }

        Builder noLettuce() {
            this.lettuce = false;
            return this;
        }

        Burger build() {
            Burger burger = new Burger();
            burger.cheese = this.cheese;
            burger.lettuce = this.lettuce;
            return burger;
        }
    }
}

// 使用：
Burger burger = new Burger.Builder()
        .addCheese()
        .noLettuce()
        .build();
```

#### 5\. 原型模式（Prototype）

**问题**：如何高效创建相似对象？  
**生活案例**：细胞分裂产生相同副本  
**核心**：克隆代替new

```java
class Sheep implements Cloneable {
    String name;

    public Sheep clone() {
        try {
            return (Sheep) super.clone(); // 浅拷贝
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

// 使用：
Sheep dolly = new Sheep();
dolly.name ="多莉";
Sheep clone = dolly.clone();
```

### 二、结构型模式（管"搭积木"的）

#### 6\. 适配器模式（Adapter）

**问题**：接口不兼容怎么办？  
**生活案例**：Type-C转3.5mm耳机转换器  
**核心**：包装旧对象，实现新接口

```java
// 旧接口：圆孔耳机
class CircleJack {
    void playSound() {
        System.out.println("播放声音");
    }
}

// 新接口：Type-C
interface USBC {
    void transmitData();
}

// 适配器
class JackAdapter implements USBC {
    private final CircleJack oldJack;

    public JackAdapter(CircleJack jack) {
        this.oldJack = jack;
    }

    public void transmitData() {
        oldJack.playSound(); // 调用旧方法
    }
}
```

#### 7\. 桥接模式（Bridge）

**问题**：如何避免类爆炸？  
**生活案例**：不同颜色+不同形状的组合（红圆/蓝方）  
**核心**：分离抽象和实现

```java
interface Color {
    void applyColor();
}

abstract class Shape {
    protected Color color; // 桥接点

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    void draw() {
        System.out.print("圆形：");
        color.applyColor(); // 调用颜色实现
    }
}
```

#### 8\. 组合模式（Composite）

**问题**：如何统一处理整体和部分？  
**生活案例**：文件夹包含文件/子文件夹  
**核心**：树形结构 + 统一接口

```java
interface FileSystem {
    void display();
}

class File implements FileSystem {
    public void display() {
        System.out.println("显示文件");
    }
}

class Folder implements FileSystem {
    private final List<FileSystem> items = new ArrayList<>();

    public void add(FileSystem item) {
        items.add(item);
    }

    public void display() {
        for (FileSystem item : items) {
            item.display(); // 递归调用
        }
    }
}
```

#### 9\. 装饰器模式（Decorator）

**问题**：如何动态添加功能？  
**生活案例**：给咖啡加糖/加奶  
**核心**：包装对象 + 实现相同接口

```java
interface Coffee {
    double getCost();
}

class BasicCoffee implements Coffee {
    public double getCost() {
        return 10;
    }
}

class SugarDecorator implements Coffee {
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getCost() {
        return coffee.getCost() + 2;
    }
}

// 使用：
Coffee coffee = new SugarDecorator(new BasicCoffee());
System.out.println(coffee.getCost()); // 12
```

#### 10\. 外观模式（Facade）

**问题**：如何简化复杂系统？  
**生活案例**：一键观影模式（关灯/开投影/降幕布）  
**核心**：统一入口封装子系统

```java
class Projector {
    void on() { /*...*/ }
}

class Lights {
    void dim() { /*...*/ }
}

class HomeTheaterFacade {
    private Projector projector;
    private Lights lights;

    public void watchMovie() {
        lights.dim();
        projector.on();
    }
}
// 使用：
new HomeTheaterFacade().watchMovie();
```

#### 11\. 享元模式（Flyweight）

**问题**：如何节省内存？  
**生活案例**：棋盘重复使用棋子对象  
**核心**：共享细粒度对象

```java
class Tree {
    // 内部状态（可共享）
    private String type;

    // 外部状态（不可共享）
    void display(int x, int y) {
        System.out.println(type + "树在(" + x + "," + y + ")");
    }
}

class Forest {
    private static final Map<String, Tree> trees = new HashMap<>();

    public Tree getTree(String type) {
        Tree tree = trees.get(type);
        if (tree == null) {
            tree = new Tree(type);
            trees.put(type, tree);
        }
        return tree;
    }
}
```

#### 12\. 代理模式（Proxy）

**问题**：如何控制对象访问？  
**生活案例**：房产中介代理房东  
**核心**：代替真实对象执行操作

```java
interface House {
    void sell();
}

class Owner implements House {
    public void sell() {
        System.out.println("房东卖房");
    }
}

class Agent implements House {
    private Owner owner;

    public void sell() {
        if (owner == null) owner = new Owner();
        preProcess();
        owner.sell();
        postProcess();
    }

    private void preProcess() { /* 筛选客户 */ }
}
```

### 三、行为型模式（管"怎么干活"的）

#### 13\. 责任链模式（Chain of Responsibility）

**问题**：请求如何接力传递？  
**生活案例**：报销审批链（员工→经理→财务）  
**核心**：处理器链表

```java
abstract class Approver {
    protected Approver next;

    public void setNext(Approver next) {
        this.next = next;
    }

    abstract void handle(int amount);
}

class Manager extends Approver {
    void handle(int amount) {
        if (amount < 1000) {
            System.out.println("经理审批");
        } else if (next != null) {
            next.handle(amount); // 传递给下一级
        }
    }
}
```

#### 14\. 命令模式（Command）

**问题**：如何解耦请求和执行？  
**生活案例**：餐厅订单（点菜→厨师）  
**核心**：封装操作为对象

```java
interface Command {
    void execute();
}

class LightOnCommand implements Command {
    private Light light;

    public void execute() {
        light.on();
    }
}

class RemoteControl {
    private Command command;

    public void press() {
        command.execute();
    }
}
```

#### 15\. 解释器模式（Interpreter）

**问题**：如何解释特定语法？  
**生活案例**：计算器解析数学表达式  
**核心**：定义语法规则

```java
interface Expression {
    int interpret();
}

class Number implements Expression {
    private int value;

    public int interpret() {
        return value;
    }
}

class Add implements Expression {
    private Expression left, right;

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
```

#### 16\. 迭代器模式（Iterator）

**问题**：如何统一遍历集合？  
**生活案例**：遥控器切换电视频道  
**核心**：分离集合和遍历

```java
interface Iterator {
    boolean hasNext();

    Object next();
}

class ChannelList implements Iterable {
    private final String[] channels = {"CCTV", "Hunan TV"};

    public Iterator iterator() {
        return new ChannelIterator();
    }

    private class ChannelIterator implements Iterator {
        int index = 0;

        public boolean hasNext() {
            return index < channels.length;
        }

        public Object next() {
            return channels[index++];
        }
    }
}
```

#### 17\. 中介者模式（Mediator）

**问题**：如何减少对象耦合？  
**生活案例**：机场塔台调度飞机  
**核心**：通过中介通信

```java
class ChatRoom {
    public static void showMessage(User user, String msg) {
        System.out.println(user.name + ": " + msg);
    }
}

class User {
    String name;

    public void sendMsg(String msg) {
        ChatRoom.showMessage(this, msg); // 通过聊天室发送
    }
}
```

#### 18\. 备忘录模式（Memento）

**问题**：如何实现撤销功能？  
**生活案例**：游戏存档  
**核心**：保存对象状态

```java
class Editor {
    private String content;

    // 创建存档
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    // 恢复存档
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}

record EditorMemento(String content) {
}
```

#### 19\. 观察者模式（Observer）

**问题**：状态变化如何通知？  
**生活案例**：微信公众号订阅  
**核心**：发布-订阅机制

```java
class NewsPublisher {
    private final List<Subscriber> subs = new ArrayList<>();

    public void addSub(Subscriber sub) {
        subs.add(sub);
    }

    public void publish(String news) {
        for (Subscriber sub : subs) {
            sub.update(news); // 通知所有订阅者
        }
    }
}

interface Subscriber {
    void update(String news);
}
```

#### 20\. 状态模式（State）

**问题**：行为如何随状态改变？  
**生活案例**：红绿灯状态变化  
**核心**：封装状态行为

```java
interface TrafficLightState {
    void handle();
}

class RedLight implements TrafficLightState {
    public void handle() {
        System.out.println("停车等待");
    }
}

class TrafficLight {
    private TrafficLightState state;

    public void change() {
        state.handle();
    }
}
```

#### 21\. 策略模式（Strategy）

**问题**：如何灵活切换算法？  
**生活案例**：导航选择不同路线  
**核心**：封装算法族

```java
interface RouteStrategy {
    void calculateRoute();
}

class FastestRoute implements RouteStrategy {
    public void calculateRoute() { /* 计算最快路线 */ }
}

class Navigator {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy s) {
        strategy = s;
    }

    public void navigate() {
        strategy.calculateRoute();
    }
}
```

#### 22\. 模板方法模式（Template Method）

**问题**：如何固定流程框架？  
**生活案例**：冲泡饮料流程（烧水→冲泡→加料）  
**核心**：定义算法骨架

```java
abstract class Beverage {
    // 模板方法（final防止重写）
    public final void prepare() {
        boilWater();
        brew();
        addCondiments();
    }

    abstract void brew(); // 子类实现

    abstract void addCondiments();

    void boilWater() { /* 通用步骤 */ }
}

class Coffee extends Beverage {
    void brew() {
        System.out.println("冲泡咖啡");
    }

    void addCondiments() {
        System.out.println("加糖");
    }
}
```

#### 23\. 访问者模式（Visitor）

**问题**：如何解耦数据结构与操作？  
**生活案例**：医生诊断不同病人  
**核心**：双重分发

```java
interface ComputerPart {
    void accept(Visitor visitor);
}

class Keyboard implements ComputerPart {
    public void accept(Visitor v) {
        v.visit(this);
    }
}

interface Visitor {
    void visit(Keyboard keyboard);
}

class RepairVisitor implements Visitor {
    public void visit(Keyboard k) {
        System.out.println("修理键盘");
    }
}
```

### 设计模式选择指南（3步法）

1. **创建对象遇到问题？** → 创建型模式

    + 需要全局唯一？→ 单例
    + 创建过程复杂？→ 建造者
    + 需要产品家族？→ 抽象工厂
2. **组织对象结构困难？** → 结构型模式

    + 接口不兼容？→ 适配器
    + 需动态增功能？→ 装饰器
    + 简化复杂系统？→ 外观
3. **对象协作不顺畅？** → 行为型模式

    + 状态需要通知？→ 观察者
    + 需切换算法？→ 策略
    + 分步骤处理？→ 模板方法

> **小白建议**：从最常用5种开始：单例、工厂、观察者、策略、装饰器。记住模式**解决的问题**比代码更重要！

### 模式关系图谱

```
创建型 ↔ 结构型 ↔ 行为型
  │        │         │
  └── 创建对象       └── 对象交互
           │
           └── 对象组合
AI运行代码12345
```

掌握设计模式的关键：**理解每个模式解决什么痛点**，在实际编码中遇到类似问题时自然能想到对应模式！