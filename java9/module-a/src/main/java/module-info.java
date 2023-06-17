//module module.a
// 如果允许其它模块反射该模块的类,必须添加为open，否则会报错
open module module.a {
    // 引入lombok模块
    requires lombok;

    exports com.a;
}