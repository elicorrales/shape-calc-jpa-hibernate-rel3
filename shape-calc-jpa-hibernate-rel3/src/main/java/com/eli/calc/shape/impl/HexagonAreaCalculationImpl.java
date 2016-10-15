package com.eli.calc.shape.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.HexagonCalculations;
import com.eli.calc.shape.model.ShapeName;

@Component("hexagonArea")
public final class HexagonAreaCalculationImpl extends AbstractShapeCalculationsImpl implements HexagonCalculations {

	 private static final Logger logger = LoggerFactory.getLogger(HexagonAreaCalculationImpl.class);

	@Override
	public CalcType getCalcType() { return CalcType.CALC_AREA; }

	@Override
	public ShapeName getShapeName() { return name; }

	/**
	 * this calculates the area
	 */
	@Override
	public double calculate(double n) {
		
		if (0>n) throw new IllegalArgumentException("dimension must not be less than zero");

		logger.debug("calc area of Hexagon of " + n);

		faketime.sleep();
		
		return ((3*Math.sqrt(3))/2)*(n*n);
	}

}
