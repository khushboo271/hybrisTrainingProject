/**
 *
 */
package com.hybris.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Aditi2204
 *
 */
@Controller
@RequestMapping("/deliveryLocation")
public class DeliveryPageController extends AbstractPageController
{
	@RequestMapping(method = RequestMethod.GET)
	public String getDeliveryDetails()
	{

		return getViewForPage(model);
	}

}
