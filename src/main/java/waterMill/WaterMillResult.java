package waterMill;

import org.springframework.stereotype.Component;

@Component
public class WaterMillResult {
	private boolean chk;
	private Object data;
	private String msg;

	public WaterMillResult result(Object data) {
		this.chk = true;
		this.data = data;
		return this;
	}

	public WaterMillResult resultError(String msg, Object data) {
		this.chk = false;
		this.msg = msg;
		this.data = data;
		return this;
	}

	public boolean getChk() {
		return chk;
	}

	public Object getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}
}
