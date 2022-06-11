package __19中介者模式;/*
    @author wxg
    @date 2021/12/27-10:04
    */

//具体的同事类
public class Alarm extends Colleague {
    //构造器
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm 同事对象时，将自己放入到ConcreteMediator 对象中[集合]
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        GetMediator().GetMessage(stateChange, name);
    }
}