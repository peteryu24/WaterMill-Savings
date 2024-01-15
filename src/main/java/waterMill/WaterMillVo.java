package waterMill;

import javax.validation.constraints.Min;

public class WaterMillVo {
	@Min(value = 10000, message = "월별 금액은 1만원 이상이어야 합니다.")
	private int monthlyAmount;
	@Min(value = 6, message = "최소 만기 기간은 6개월 이상이어야 합니다.")
	private int endPeriod;

	public int getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(int monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	public int getEndPeriod() {
		return endPeriod;
	}

	public void setEndPeriod(int endPeriod) {
		this.endPeriod = endPeriod;
	}
}
