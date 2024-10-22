package com.ui.pojos;

import java.util.Map;

public class configJson {
	
	Map<String,EnvJSON> environments;
	

	public Map<String, EnvJSON> getEnvironments() {
		return environments;
	}

	public void setEnvironments(Map<String, EnvJSON> environments) {
		this.environments = environments;
	}

}
