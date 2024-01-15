package waterMill;

import org.springframework.stereotype.Component;

@Component
public class WaterMillResult {
	private boolean chk;
	private Object data;

	public WaterMillResult result(Object data) {
		this.chk = true;
		this.data = data;
		return this;
	}

	public WaterMillResult resultError(Object data) {
		this.chk = false;
		this.data = data;
		return this;
	}

	public boolean getChk() {
		return chk;
	}

	public Object getData() {
		return data;
	}
}
