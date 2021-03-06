package __08桥接模式;/*
    @author wxg
    @date 2021/12/25-20:29
    */

public abstract class Phone {
    //组合品牌
    private final Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}
