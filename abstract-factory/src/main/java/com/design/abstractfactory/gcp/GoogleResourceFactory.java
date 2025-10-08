package com.design.abstractfactory.gcp;


import com.design.abstractfactory.Instance;
import com.design.abstractfactory.Instance.Capacity;
import com.design.abstractfactory.ResourceFactory;
import com.design.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
