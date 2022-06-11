package __24责任链模式;/*
    @author wxg
    @date 2021/12/27-19:15
    */

public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 10000 && purchaseRequest.getPrice() <= 30000) System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        else approver.processRequest(purchaseRequest);
    }
}
