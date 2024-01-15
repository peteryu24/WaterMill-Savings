package waterMill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaterMillService {

	@Autowired
	private WaterMillResult waterMillResult;

	public WaterMillResult setForCalculation(int monthlyAmount, int endPeriod) {
		try {
			return waterMillResult.result(totalAmount(monthlyAmount, endPeriod));
		} catch (RuntimeException e) {
			return waterMillResult.resultError("RuntimeException");
		} catch (Exception e) {
			return waterMillResult.resultError("Exception");
		}

	}

	private Integer totalAmount(int monthlyAmount, int endPeriod) {
		Integer totalAmount = 0;
		for (int i = 1; i <= endPeriod; i++) {
			totalAmount += (monthlyAmount * i);
		}
		return totalAmount;
	}
}
