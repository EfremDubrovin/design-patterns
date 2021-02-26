package pattern.proxy.dymanic;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class DynamicProxyApplication {

	public static void main(String[] args) {
		Map proxyInstance = (Map) Proxy.newProxyInstance(
			DynamicProxyApplication.class.getClassLoader(),
			new Class[] { Map.class },
			new DynamicInvocationHandler(new HashMap<>()));

		proxyInstance.put("Hi", "asl");
	}
}
