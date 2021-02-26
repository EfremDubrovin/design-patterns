package pattern.proxy.dymanic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class DynamicInvocationHandler implements InvocationHandler {

	private final Object target;

	public DynamicInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
		long start = System.nanoTime();
		Object result = method.invoke(target, args);
		long elapsed = System.nanoTime() - start;
		System.out.println("Invoked method: " + method.getName() + " took " + elapsed);
		return result;
	}
}
