package waterMill;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/waterMill")
public class WaterMillController {

	@Resource
	WaterMillService waterMillService;

	@Resource
	private WaterMillResult waterMillResult;

	@RequestMapping(value = "/setNum")
	public WaterMillResult setForCalculation(@Valid int monthlyAmount, int endPeriod) {
		return waterMillService.setForCalculation(monthlyAmount, endPeriod);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public WaterMillResult IllegalArgumentException(IllegalArgumentException exception) {
		return waterMillResult.resultErrorEntity("IllegalArgumentException",
				ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage()));
	}

	@ExceptionHandler(RuntimeException.class)
	public WaterMillResult handleRuntimeException(RuntimeException exception) {
		return waterMillResult.resultErrorEntity("RuntimeException",
				ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage()));
	}
}
