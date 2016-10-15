package com.eli.calc.shape.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.HexagonCalculations;
import com.eli.calc.shape.model.ShapeName;

@Component("hexagonVolume")
public final class HexagonVolumeCalculationImpl extends AbstractShapeCalculationsImpl implements HexagonCalculations {

	 private static final Logger logger = LoggerFactory.getLogger(HexagonVolumeCalculationImpl.class);

	@Override
	public CalcType getCalcType() { return CalcType.CALC_VOLUME; }

	@Override
	public ShapeName getShapeName() { return name; }

	/**
	 * this calculates volume
	 */
	@Override
	public double calculate(double d) {

		logger.debug("calc volume of Hexagon of {}", d);

		if (0>d) throw new IllegalArgumentException("dimension must not be less than zero");

		return 0;

	}

}
