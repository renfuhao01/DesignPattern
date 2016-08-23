package prs.rfh.dsnp.cor;

public class PMRequestHandle implements RequestHandle{

	RequestHandle rh ;
	
	public PMRequestHandle(RequestHandle rh){
		this.rh = rh;
	}
	
	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request instanceof AddMoneyRequest){
			System.out.println("要加薪，项目经咯审批");
		}else{
			rh.handleRequest(request);
		}
	}
	
}
