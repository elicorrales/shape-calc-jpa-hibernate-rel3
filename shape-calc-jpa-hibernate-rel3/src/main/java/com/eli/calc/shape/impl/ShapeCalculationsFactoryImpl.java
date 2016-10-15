package com.eli.calc.shape.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eli.calc.shape.ShapeCalculationsFactory;
import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.CircleCalculations;
import com.eli.calc.shape.model.CubeCalculations;
import com.eli.calc.shape.model.EqualDimShapeCalculations;
import com.eli.calc.shape.model.EquilateralTriangleCalculations;
import com.eli.calc.shape.model.HexagonCalculations;
import com.eli.calc.shape.model.ShapeName;
import com.eli.calc.shape.model.SphereCalculations;
import com.eli.calc.shape.model.SquareCalculations;
import com.eli.calc.shape.model.TetrahedronCalculations;

@Component
public class ShapeCalculationsFactoryImpl implements ShapeCalculationsFactory {


	@Autowired
	private CircleCalculations circleArea;
	@Autowired
	private CircleCalculations circleVolume;
	
	@Autowired
	private SquareCalculations squareArea;
	@Autowired
	private SquareCalculations squareVolume;
	
	@Autowired
	private EquilateralTriangleCalculations triangleArea;
	@Autowired
	private EquilateralTriangleCalculations triangleVolume;
	
	@Autowired
	private HexagonCalculations hexagonArea;
	@Autowired
	private HexagonCalculations hexagonVolume;
	
	@Autowired
	private SphereCalculations sphereArea;
	@Autowired
	private SphereCalculations sphereVolume;
	
	@Autowired
	private CubeCalculations cubeArea;
	@Autowired
	private CubeCalculations cubeVolume;
	
	@Autowired
	private TetrahedronCalculations tetraArea;
	@Autowired
	private TetrahedronCalculations tetraVolume;
	
	@Override
	public EqualDimShapeCalculations createShapeCalculation(ShapeName shapeName, CalcType type) {
		
		if (null==shapeName) throw new IllegalArgumentException("Must have a ShapeName");
		if (null==type) throw new IllegalArgumentException("Must have a CalculationType");

		switch (shapeName) {

			case CIRCLE:
				switch (type) {
					case CALC_AREA:
							return this.circleArea;
					case CALC_VOLUME:
							return this.circleVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}

	
			case SQUARE:
				switch (type) {
					case CALC_AREA:
							return this.squareArea;
					case CALC_VOLUME:
							return this.squareVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}

	
			case EQUILATERALTRIANGLE:
				switch (type) {
					case CALC_AREA:
							return this.triangleArea;
					case CALC_VOLUME:
							return this.triangleVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}

	
			case HEXAGON:
				switch (type) {
					case CALC_AREA:
							return this.hexagonArea;
					case CALC_VOLUME:
							return this.hexagonVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}

	
			case SPHERE:
				switch (type) {
					case CALC_AREA:
							return this.sphereArea;
					case CALC_VOLUME:
							return this.sphereVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}


			case CUBE:
				switch (type) {
					case CALC_AREA:
							return this.cubeArea;
					case CALC_VOLUME:
							return this.cubeVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}
	
				
			case TETRAHEDRON:
				switch (type) {
					case CALC_AREA:
							return this.tetraArea;
					case CALC_VOLUME:
							return this.tetraVolume;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}

			case TRUNCICOSAHERON:
				switch (type) {
					case CALC_AREA:
							//TODO: need a area calculation class
							return null;
					case CALC_VOLUME:
							//TODO: need a volume calculation class
							return null;
					default:
							throw new IllegalArgumentException("Unknown Calc Type: "+ type + " for " + shapeName);
				}

			default: throw new IllegalArgumentException("No CalcType Available for ShapeName: "+ shapeName);

		}
	}
}
