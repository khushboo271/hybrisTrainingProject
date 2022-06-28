/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21 Jun, 2022 10:15:40 AM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.training.core.jalo;

import com.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.training.core.jalo.ApparelProduct ApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApparelProduct extends Product
{
	/** Qualifier of the <code>ApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>ApparelProduct.productQuality</code> attribute **/
	public static final String PRODUCTQUALITY = "productQuality";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		tmp.put(PRODUCTQUALITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.productQuality</code> attribute.
	 * @return the productQuality - Recommended Product Quality
	 */
	public String getProductQuality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTQUALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.productQuality</code> attribute.
	 * @return the productQuality - Recommended Product Quality
	 */
	public String getProductQuality()
	{
		return getProductQuality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.productQuality</code> attribute. 
	 * @param value the productQuality - Recommended Product Quality
	 */
	public void setProductQuality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTQUALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.productQuality</code> attribute. 
	 * @param value the productQuality - Recommended Product Quality
	 */
	public void setProductQuality(final String value)
	{
		setProductQuality( getSession().getSessionContext(), value );
	}
	
}
