package br.com.neolog.services.WS;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="br.com.neolog.services.WS.WS")
public class WSImp implements WS {

	@WebMethod
	public synchronized boolean isBaskSlipOk(String name) {
		try {
			wait(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
}
