# 尚医通

#### 介绍
基于cola4.0架构练习尚医通项目，通过这个项目来熟练使用cola4.0的架构思想

#### 项目简介

尚医通即为网上预约挂号系统，网上预约挂号是近年来开展的一项便民就医服务，
旨在缓解看病难、挂号难的就医难题，许多患者为看一次病要跑很多次医院，最终还不一定能保证看得上医生。
网上预约挂号全面提供的预约挂号业务从根本上解决了这一就医难题。随时随地轻松挂号！不用排长队！

#### 模块搭建

- cola-components : cola组件
- shangyitong-adapter 
- shangyitong-app
- shangyitong-client
- shangyitong-domain
- shangyitong-infrastructure
- start

#### cola介绍

对于一个典型的业务应用系统来说，COLA会做如下层次定义，每一层都有明确的职责定义：

![image-20210624094818152](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624094818152.png)

1）适配层（Adapter Layer）：负责对前端展示（web，wireless，wap）的路由和适配，对于传统B/S系统而言，adapter就相当于MVC中的controller；

2）应用层（Application Layer）：主要负责获取输入，组装上下文，参数校验，调用领域层做业务处理，如果需要的话，发送消息通知等。层次是开放的，应用层也可以绕过领域层，直接访问基础实施层；

3）领域层（Domain Layer）：主要是封装了核心业务逻辑，并通过领域服务（Domain Service）和领域对象（Domain Entity）的方法对App层提供业务实体和业务逻辑计算。领域是应用的核心，不依赖任何其他层次；

4）基础实施层（Infrastructure Layer）：主要负责技术细节问题的处理，比如数据库的CRUD、搜索引擎、文件系统、分布式服务的RPC等。此外，领域防腐的重任也落在这里，外部依赖需要通过gateway的转义处理，才能被上面的App层和Domain层使用。

### 包结构

分层是属于大粒度的职责划分，太粗，我们有必要往下再down一层，细化到包结构的粒度，才能更好的指导我们的工作。

还是拿一堆玩具举例子，分层类似于拿来了一个架子，分包类似于在每一层架子上又放置了多个收纳盒。所谓的内聚，就是把功能类似的玩具放在一个盒子里，这样可以让应用结构清晰，极大的降低系统的认知成本和维护成本。
![image-20210624094854025](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624094854025.png)

那么，对于一个后端应用来说，应该需要哪些收纳盒呢？这一块的设计真可谓是费了老鼻子劲了，基本上每一次COLA的迭代都会涉及到包结构的调整，迭代到现在，才算基本稳定下来。
![image-20210624094909693](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624094909693.png)

各个包结构的简要功能描述，如下表所示：
![image-20210624094953962](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624094953962.png)

COLA组件

![image-20210624095139680](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624095139680.png)

# COLA 4.0架构

![image-20210624095220204](https://gitee.com/mxchen-team/figure-bed/raw/master/images/image-20210624095220204.png)