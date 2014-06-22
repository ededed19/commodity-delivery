package com.walmart.commoditydelivery.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class RouteTO implements Serializable {
	private static final long serialVersionUID = 123333L;

	private Long id;
	private PointTO startPointTO;
	private PointTO endPointTO;
	private BigDecimal distance;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PointTO getStartPointTO() {
		return startPointTO;
	}
	public void setStartPointTO(PointTO startPointTO) {
		this.startPointTO = startPointTO;
	}
	public PointTO getEndPointTO() {
		return endPointTO;
	}
	public void setEndPointTO(PointTO endPointTO) {
		this.endPointTO = endPointTO;
	}
	public BigDecimal getDistance() {
		return distance;
	}
	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}
}
