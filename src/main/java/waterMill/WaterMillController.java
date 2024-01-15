package waterMill;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/waterMill")
public class WaterMillController {

	@Autowired
	WaterMillService waterMillService;

	@RequestMapping(value = "/setNum")
	public WaterMillResult setForCalculation(@Valid int monthlyAmount, int endPeriod) {
		return waterMillService.setForCalculation(monthlyAmount, endPeriod);
	}
}
