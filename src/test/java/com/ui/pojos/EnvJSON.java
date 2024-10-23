package com.ui.pojos;

public class EnvJSON {
	private String url;
	private int MAX_RETRY_ATTEMPTS;

	public int getMAX_RETRY_ATTEMPTS() {
		return MAX_RETRY_ATTEMPTS;
	}

	public void setMAX_RETRY_ATTEMPTS(int mAX_RETRY_ATTEMPTS) {
		MAX_RETRY_ATTEMPTS = mAX_RETRY_ATTEMPTS;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
