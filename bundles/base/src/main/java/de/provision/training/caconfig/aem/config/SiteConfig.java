/* Copyright (c) pro!vision GmbH. All rights reserved. */
package de.provision.training.caconfig.aem.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

/**
 * Example singleton configuration.
 */
@Configuration(label = "Training CAConfig Site Config",
description = "Example singleton configuration.")
public @interface SiteConfig {

  /**
   * @return site URL
   */
  @Property(label = "Site URL")
  String siteUrl();

  /**
   * @return Shopping basket
   */
  @Property(label = "Shopping basket")
  ShoppingBasket shoppingBasket();

}
