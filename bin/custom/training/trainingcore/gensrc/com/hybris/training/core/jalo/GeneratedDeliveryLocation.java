/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21 Jun, 2022 10:15:40 AM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.training.core.jalo;

import com.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DeliveryLocation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDeliveryLocation extends GenericItem
{
	/** Qualifier of the <code>DeliveryLocation.states</code> attribute **/
	public static final String STATES = "states";
	/** Qualifier of the <code>DeliveryLocation.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>DeliveryLocation.pinCode</code> attribute **/
	public static final String PINCODE = "pinCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STATES, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(PINCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryLocation.city</code> attribute.
	 * @return the city - Recommended City
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryLocation.city</code> attribute.
	 * @return the city - Recommended City
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryLocation.city</code> attribute. 
	 * @param value the city - Recommended City
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryLocation.city</code> attribute. 
	 * @param value the city - Recommended City
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryLocation.pinCode</code> attribute.
	 * @return the pinCode - Recommended PinCode
	 */
	public String getPinCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PINCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryLocation.pinCode</code> attribute.
	 * @return the pinCode - Recommended PinCode
	 */
	public String getPinCode()
	{
		return getPinCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryLocation.pinCode</code> attribute. 
	 * @param value the pinCode - Recommended PinCode
	 */
	public void setPinCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PINCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryLocation.pinCode</code> attribute. 
	 * @param value the pinCode - Recommended PinCode
	 */
	public void setPinCode(final String value)
	{
		setPinCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryLocation.states</code> attribute.
	 * @return the states - Recommended States
	 */
	public String getStates(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryLocation.states</code> attribute.
	 * @return the states - Recommended States
	 */
	public String getStates()
	{
		return getStates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryLocation.states</code> attribute. 
	 * @param value the states - Recommended States
	 */
	public void setStates(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryLocation.states</code> attribute. 
	 * @param value the states - Recommended States
	 */
	public void setStates(final String value)
	{
		setStates( getSession().getSessionContext(), value );
	}
	
}
