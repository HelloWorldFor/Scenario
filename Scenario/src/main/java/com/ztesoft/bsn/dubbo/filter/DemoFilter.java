package com.ztesoft.bsn.dubbo.filter;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * 
 * @ClassName: DemoFilter 
 * @Description: 过滤器 
 * @author lindong
 * @date 2016年9月10日 下午4:02:56 
 *
 */
public class DemoFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation)
			throws RpcException {
		// TODO Auto-generated method stub
		return null;
	}

}
