module module.b {
    // 引入logging模块
    requires java.logging;
    // 引入lombok模块
    requires lombok;
    // 引入A模块
    requires module.a;
}