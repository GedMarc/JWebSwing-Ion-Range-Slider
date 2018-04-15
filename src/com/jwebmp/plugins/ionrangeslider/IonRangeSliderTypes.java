/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.ionrangeslider;

/**
 * The available types for the iron range slider
 *
 * @author Marc Magon
 * @since 11 Jun 2017
 */
public enum IonRangeSliderTypes
{
	Double,
	Integer;
	/**
	 * Any sub data
	 */
	private String data;

	/**
	 * A new IonRangeSliderTypes
	 */
	IonRangeSliderTypes()
	{

	}

	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name();
		}
	}
}